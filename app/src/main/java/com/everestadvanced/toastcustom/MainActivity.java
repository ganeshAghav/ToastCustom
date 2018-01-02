package com.everestadvanced.toastcustom;

import android.content.Context;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // My custom toast
    public void btntoast(View view) {
        Context context=getApplicationContext();
        LayoutInflater inflater=getLayoutInflater();

        View customToastroot =inflater.inflate(R.layout.mytoast, null);

        Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
    // Red toast
    public void btnRed(View view) {
        Context context=getApplicationContext();
        LayoutInflater inflater=getLayoutInflater();

        View customToastroot =inflater.inflate(R.layout.red_toast, null);

        Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
    // Yellow toast
    public void btnYellow(View view) {
        Context context=getApplicationContext();
        LayoutInflater inflater=getLayoutInflater();

        View customToastroot =inflater.inflate(R.layout.yellow_toast, null);

        Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
    // Blue toast
    public void btnBlue(View view) {
        Context context=getApplicationContext();
        LayoutInflater inflater=getLayoutInflater();

        View customToastroot =inflater.inflate(R.layout.blue_toast, null);

        final Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,0, 0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();


        //for custom time to show toast
        new CountDownTimer(9000, 1000)
        {

            public void onTick(long millisUntilFinished) {customtoast.show();}
            public void onFinish() {customtoast.show();}

        }.start();
    }
}
