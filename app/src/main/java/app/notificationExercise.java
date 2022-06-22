package app;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;

import com.example.notificationsexercise.utils;

public class notificationExercise  extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        notificationChannel();
    }

    public void notificationChannel(){
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel  = new NotificationChannel(utils.CHANNEL_ID, utils.CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH );
            channel.setDescription(utils.CHANNEL_DESC);

            NotificationManager managerCompat = getSystemService(NotificationManager.class);
            managerCompat.createNotificationChannel(channel);
        }
    }
}
