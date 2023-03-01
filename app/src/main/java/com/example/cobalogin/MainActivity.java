package com.example.cobalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvsesi,tvnama;
    private Button Btnlogout;

    kendali_login kl=new kendali_login();
    public  static String keySpusername="sppadang";
    public  static String keySpname="spadang";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if(kl.islogin(MainActivity.this,keySpusername)==true){
            setContentView(R.layout.activity_main);
            tvnama=findViewById(R.id.tv_nama);
            tvsesi = findViewById(R.id.tv_sesi);
            Btnlogout =findViewById(R.id.btn_logout);

            tvsesi.setText(kl.getpref(MainActivity.this,keySpusername));
            tvnama.setText(kl.getpref(MainActivity.this,keySpname));

            Btnlogout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    kl.setpref(MainActivity.this,keySpusername, null);
                    kl.setpref(MainActivity.this,keySpname, null);
                    startActivity(new Intent(MainActivity.this, login_activity.class));
                    finish();
                }
            });
        }
        else{
            startActivity(new Intent(MainActivity.this, login_activity.class));
            finish();
        }






    }
}