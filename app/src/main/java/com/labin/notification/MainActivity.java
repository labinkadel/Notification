package com.labin.notification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private NotificationManagerCompat notificationManagerCompat;

    private Button btn1;
    private Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationManagerCompat =NotificationManagerCompat.from(this);
  CreateChannel channel =new CreateChannel(this);
  channel.createChannel();
  btn1=findViewById(R.id.btn1);
  btn2=findViewById(R.id.btn2);
  
  btn1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          DisplayNotification();
      }
  });
    }

    private void DisplayNotification() {
    }
}
