package com.indtel.mcf.utils.download;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;

import androidx.core.app.NotificationCompat;

import com.indtel.mcf.R;
import com.indtel.mcf.utils.Logger;

import org.jetbrains.annotations.Nullable;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.indtel.mcf.utils.download.Constants.FILE_NAME;
import static com.indtel.mcf.utils.download.Constants.FILE_PATH;
import static com.indtel.mcf.utils.download.Constants.NOTIFICATION_ID;
import static com.indtel.mcf.utils.download.Constants.NOTIFICATION_ID_DOWNLOAD;

/**
 * Created by Arvindo Mondal on 1/13/2018.
 * Email : arvindomondal@gmail.com
 * Designation : Programmer and Developer
 * Skills : Logic and Algorithm creator
 */

public class FileDownloaded extends IntentService {

    private static final String TAG = FileDownloaded.class.getSimpleName();
    private NotificationManager mNotificationManager;
    private NotificationCompat.Builder builder;

    private String fileName;
    private NotificationManager mNotifyManager;
    private NotificationCompat.Builder mBuilder;
    private String filePath;

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @ param name Used to name the worker thread, important only for debugging.
     */
    public FileDownloaded() {
        super("org.dlw_va.ispl.dlwonlinevendorregistration.notification");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        // The reminder message the user set.
        fileName = intent.getStringExtra(FILE_NAME);
        filePath = intent.getStringExtra(FILE_PATH);

        NotificationManager nm = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);

        String action = intent.getAction();
        if(action == null){
            action = "";
        }

        switch (action) {
            case Constants.DOWNLOAD_COMPLETE:
                Logger.e(Constants.SERVICE_CLASS_NAME, " file download===");
//                nm.cancel(Constants.NOTIFICATION_ID);
                issueOpenFile(intent);
                break;
            case Constants.NOTIFICATION_DOWNLOADING:
                Logger.e(Constants.SERVICE_CLASS_NAME, " file downloading");
//                issueDownloadingFile(intent, "", fileName);
                break;
            case Constants.ACTION_DISMISS:
                assert nm != null;
                nm.cancel(NOTIFICATION_ID);
                Logger.e(Constants.SERVICE_CLASS_NAME,  " notice dismiss");
                break;


            case Constants.DOWNLOAD_COMPLETED:
                Logger.e(Constants.SERVICE_CLASS_NAME, " file downloaded");
//                nm.cancel(NOTIFICATION_ID);
                issueOpenFile(intent);
                break;
        }
    }

    private void issueOpenFile(Intent intent){
//        mNotificationManager = (NotificationManager)
//                getSystemService(NOTIFICATION_SERVICE);

        // Sets up the Snooze and Dismiss action buttons that will appear in the
        // expanded view of the notification.
        Intent dismissIntent = new Intent(this, FileDownloaded.class);
        dismissIntent.setAction(Constants.ACTION_DISMISS);
        PendingIntent piDismiss = PendingIntent.getService(this, 0,
                dismissIntent, 0);

        Intent openFileIntent = new Intent(this, FileDownloaded.class);
        openFileIntent.setAction(Constants.DOWNLOAD_COMPLETED);
        PendingIntent piOpenFile = PendingIntent.getService(this, 0,
                openFileIntent, 0);

        String message = fileName + " " +
                getString(R.string.file_downleded);

        // Constructs the Builder object.
        builder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle(getString(R.string.notification_open_file))
                        .setContentText(fileName)
                        .setDefaults(Notification.DEFAULT_ALL) // requires VIBRATE permission
                        .setStyle(new NotificationCompat.BigTextStyle()
                                .bigText(message))
                        .addAction (R.drawable.ic_close,
                                getString(R.string.dismiss), piDismiss)
                        .addAction (R.drawable.ic_open,
                                getString(R.string.open), piOpenFile)
                        ;

        Intent resultIntent = new Intent(this, ReadFileNotifyActivity.class);
        resultIntent.putExtra(EXTRA_MESSAGE, Constants.READ_FILE);
        resultIntent.putExtra(FILE_NAME, fileName);
        resultIntent.putExtra(FILE_PATH, filePath);
        resultIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

        // Because clicking the notification opens a new ("special") activity, there's
        // no need to create an artificial back stack.
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        this,
                        0,
                        resultIntent,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );

        builder.setContentIntent(resultPendingIntent);
        issueNotification(builder);
    }

    private void issueNotification(NotificationCompat.Builder builder) {
        mNotificationManager = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);
        // Including the notification ID allows you to update the notification later on.
        mNotificationManager.notify(NOTIFICATION_ID, builder.build());
    }

    // Clears notification tray messages
    public static void clearFileNotifications(Context context) throws NullPointerException {
        NotificationManager notificationManager = (NotificationManager)
                context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.cancel(NOTIFICATION_ID);
    }

    //-------------------------------------

}
