package com.example.cobalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {
    private EditText etusername,etpassword;
    private Button btnlogin;

    private String username,password;

    kendali_login KL=new kendali_login();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_login);

        etusername=findViewById(R.id.et_username);
        etpassword=findViewById(R.id.et_password);
        btnlogin=findViewById(R.id.btn_login);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username=etusername.getText().toString();
                password=etpassword.getText().toString();

                if(username.trim().equals("")){
                    etusername.setError("USERNAME TIDAK BOLEH KOSONG!!!!!");
                }
                else if(password.trim().equals("")){
                    etpassword.setError("PASSWORD TIDAK BOLEH KOSONG!!!!");
                }
                else {
                        if (username.equals("nando")&&password.equals("123")){
                            KL.setpref(login_activity.this,MainActivity.keySpusername,username);
                            KL.setpref(login_activity.this,MainActivity.keySpname,"Doooo");
                            startActivity(new Intent(login_activity.this,MainActivity.class));
                            finish();
                        }
                        else {
                            Toast.makeText(login_activity.this,"USERNAME ATAU PASSWORD ADA YANG SALAH",Toast.LENGTH_LONG).show();
                        }
                }
            }
        });

    }
}