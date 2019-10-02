package com.indtel.mcf.utils.download;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.widget.Toast;

import androidx.core.content.FileProvider;

import com.indtel.mcf.BuildConfig;
import com.indtel.mcf.R;
import com.indtel.mcf.core.binding.BindingUtils;
import com.indtel.mcf.utils.AppConstants;
import com.indtel.mcf.utils.Logger;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLConnection;

import static com.indtel.mcf.utils.download.Constants.DOWNLOAD_COMPLETE;
import static com.indtel.mcf.utils.download.Constants.FILE_NAME;
import static com.indtel.mcf.utils.download.Constants.FILE_PATH;

/**
 * Author       : Arvindo Mondal
 * Created on   : 02-10-2019
 * Email        : arvindo@aiprog.in
 * Company      : AIPROG
 * Designation  : Programmer
 * About        : I am a human can only think, I can't be a person like machine which have lots of memory and knowledge.
 * Quote        : No one can measure limit of stupidity but stupid things bring revolutions
 * Strength     : Never give up
 * Motto        : To be known as great Mathematician
 * Skills       : Algorithms and logic
 * Website      : www.aiprog.in
 */
public class DownloadFileTask extends AsyncTask<String, String, String> {
    public static final String TAG = DownloadFileTask.class.getSimpleName();
    private File outputFile = null;
    private File apkStorage1 = null;
    private WeakReference<Context> contextReference;

    public DownloadFileTask(Context context){
        this.contextReference = new WeakReference<>(context);
    }

    private File getDirectory(){
        return contextReference.get().getExternalFilesDir(Environment.DIRECTORY_PICTURES);
    }

    private static String getUrl(String referenceId, String fileName){
        return "http://mcf.ggn.rcil.gov.in/MCF_VR/DOCUMENTS/" + referenceId +
                "/" + fileName;
    }

    public static void startDownloading(Context context, String referenceId, String fileName){
        new DownloadFileTask(context).execute(getUrl(referenceId, fileName), fileName);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        BindingUtils.progressBarVisibility.set(true);
        Toast.makeText(contextReference.get(), R.string.startDownloading, Toast.LENGTH_SHORT).show();
    }

    //Check If SD Card is present or not method
    private boolean isSDCardPresent() {
        return Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED);
    }

    @Override
    protected String doInBackground(String... f_url) {
        int count;
        f_url[1] = String.valueOf((int)(Math.random()*1000)) + "_" + f_url[1];
        try {
            //Get File if SD card is present
            if (isSDCardPresent()) {
                apkStorage1 = new File(getDirectory(), AppConstants.MAIN_FOLDER);
            } else
                Toast.makeText(contextReference.get(),
                        "Oops!! There is no SD Card.", Toast.LENGTH_SHORT).show();

            //If File is not present create directory
            if (!apkStorage1.exists()) {
                if(apkStorage1.mkdir()){
                    Logger.e(TAG + " , Directory Created 1.");
                }
                else {
                    Logger.e(TAG + " , Directory not Created 1.");
                }
            }

            outputFile = new File(apkStorage1, f_url[1]);//Create Output file in Main File

            URL url = new URL(f_url[0]);
            URLConnection conection = url.openConnection();
            conection.connect();
            // this will be useful so that you can show a tipical 0-100% progress bar
            int lenghtOfFile = conection.getContentLength();
            // download the file
            InputStream input = new BufferedInputStream(url.openStream(), 8192);
            OutputStream output = new FileOutputStream(outputFile);
            byte[] data = new byte[1024];
            long total = 0;

            while ((count = input.read(data)) != -1) {
                total += count;
                publishProgress(""+(int)((total*100)/lenghtOfFile));

                // writing data to file
                output.write(data, 0, count);
            }

            output.flush();
            output.close();
            input.close();

        } catch (Exception e) {
            e.printStackTrace();
            Logger.e("Error: " + e.getMessage());
        }
        return f_url[1];
    }

    protected void onProgressUpdate(String... progress) {
        // setting progress percentage
//        pDialog.setProgress(Integer.parseInt(progress[0]));
    }

    @Override
    protected void onPostExecute(String fileName) {
//        pDialog.dismiss();

        BindingUtils.progressBarVisibility.set(false);

        String filePath = getDirectory().toString() + "/" +
                AppConstants.MAIN_FOLDER + "/" + fileName;

        Logger.e(TAG + " path , " + filePath);

        if(fileName != null && !fileName.equalsIgnoreCase("null")) {
            File file = new File(filePath);
            if (file.exists()) {
                String extension = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
                String mimetype = android.webkit.MimeTypeMap.getSingleton()
                        .getMimeTypeFromExtension(extension);

                Intent intent = new Intent(Intent.ACTION_VIEW);
                //                    intent.setDataAndType(Uri.fromFile(file), "application/pdf");
                Uri uri = FileProvider.getUriForFile(contextReference.get(),
                        BuildConfig.APPLICATION_ID + ".provider", file);
                //                    intent.setDataAndType(uri, "application/pdf");
                intent.setDataAndType(uri, mimetype);
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

                //                    startActivity(intent);
                try {
                    contextReference.get().startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(contextReference.get(),
                            contextReference.get().getString(R.string.no_app_available),
                            Toast.LENGTH_SHORT).show();
                }

                Intent mServiceIntent = new Intent(contextReference.get().getApplicationContext(),
                        FileDownloaded.class);
                mServiceIntent.putExtra(FILE_NAME, fileName);
                mServiceIntent.putExtra(FILE_PATH, filePath);
                mServiceIntent.setAction(DOWNLOAD_COMPLETE);
                contextReference.get().startService(mServiceIntent);
            } else {
                Toast.makeText(contextReference.get(), contextReference.get().getText(R.string.no_file_found),
                        Toast.LENGTH_SHORT).show();
            }
        }

        Logger.e(TAG + " , " + filePath);
    }
}
