package com.example.notificationsexercise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void headsUpNotification(View view) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,utils.CHANNEL_ID).
                setSmallIcon(R.mipmap.ic_launcher).setContentTitle(utils.NOTI_TITLE)
                .setContentText(utils.NOTI_DESC).setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(utils.NOTI_ID,builder.build());
    }
}