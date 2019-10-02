package com.indtel.mcf.utils.download;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.core.content.FileProvider;

import com.indtel.mcf.BuildConfig;
import com.indtel.mcf.R;

import org.jetbrains.annotations.Nullable;

import java.io.File;

import static com.indtel.mcf.utils.download.Constants.EXTRA_MESSAGE;
import static com.indtel.mcf.utils.download.Constants.FILE_NAME;
import static com.indtel.mcf.utils.download.Constants.FILE_PATH;

/**
 * Created by Arvindo Mondal on 1/15/2018.
 * Email : arvindomondal@gmail.com
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm creator
 */
public class ReadFileNotifyActivity extends Activity {

    private static final String TAG = ReadFileNotifyActivity.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String message = getIntent().getStringExtra(EXTRA_MESSAGE);
        String fileName = getIntent().getStringExtra(FILE_NAME);
        String filePath = getIntent().getStringExtra(FILE_PATH);

        if (getIntent().getExtras() != null) {
            for (String key : getIntent().getExtras().keySet()) {
                Object value = getIntent().getExtras().get(key);
                Log.e(TAG, "Key: " + key + " Value: " + value);
            }
        }

        try {
            FileDownloaded.clearFileNotifications(this);
        }
        catch (Exception ignored){
        }


        openFile(message, fileName, filePath);
    }

//    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        String message = intent.getStringExtra(EXTRA_MESSAGE);
        String fileName = intent.getStringExtra(FILE_NAME);
        String filePath = intent.getStringExtra(FILE_PATH);

        if (intent.getExtras() != null) {
            for (String key : intent.getExtras().keySet()) {
                Object value = intent.getExtras().get(key);
                Log.e(TAG, "Key: " + key + " Value: " + value);
            }
        }

        openFile(message, fileName, filePath);
    }

    private void openFile(String message, String fileName, String filePath){

        if(fileName != null && !fileName.equalsIgnoreCase("null")) {
            File file = new File(filePath);
            if (file.exists()) {
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setDataAndType(Uri.fromFile(file), "application/pdf");
//                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
//                startActivity(intent);
//                try {
//                    startActivity(intent);
//                } catch (ActivityNotFoundException e) {
//                    Toast.makeText(ReadFileNotifyActivity.this,
//                            "No Application Available to View PDF",
//                            Toast.LENGTH_SHORT).show();
//                }

                String extention = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
                Intent intent = new Intent(Intent.ACTION_VIEW);
//                    intent.setDataAndType(Uri.fromFile(file), "application/pdf");
                Uri uri = FileProvider.getUriForFile(ReadFileNotifyActivity.this,
                        BuildConfig.APPLICATION_ID + ".provider", file);
//                    intent.setDataAndType(uri, "application/pdf");
                intent.setDataAndType(uri, "application/" + extention);
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

//                    startActivity(intent);
                try {
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(ReadFileNotifyActivity.this,
                            getString(R.string.no_app_available),
                            Toast.LENGTH_SHORT).show();
                }

                Log.e(TAG, "ghn=======");

            } else {
                Toast.makeText(ReadFileNotifyActivity.this,
                        "No file found",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}