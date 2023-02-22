package com.example.cobalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvsesi;
    private Button Btnlogout;

    kendali_login kl=new kendali_login();
    public  static String keySpusername="sppadang";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(kl.islogin(MainActivity.this,keySpusername)==true){
            tvsesi = findViewById(R.id.tv_sesi);
            Btnlogout =findViewById(R.id.btn_logout);

        }
        else{
            startActivity(new Intent(MainActivity.this, login_activity.class));
            finish();
        }

//        setContentView(R.layout.activity_main);




    }
}