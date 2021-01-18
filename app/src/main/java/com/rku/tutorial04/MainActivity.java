package com.rku.tutorial04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUsername;
    EditText edtPassword;
    String valPassword;
    String valUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
    }
    public void btnLoginClick(View view) {

         valUsername = edtUsername.getText().toString();
         valPassword = edtPassword.getText().toString();


        if(valUsername.equals("")){
            Toast.makeText(this, "Username can not be empty!!", Toast.LENGTH_SHORT).show();
            return;
        }
        if(valPassword.equals("")){
            Toast.makeText(this, "Password can not be empty!!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (valPassword.length() < 6) {
            Toast.makeText(this, "Password must be minimum of 6 character!!", Toast.LENGTH_SHORT).show();
            return;
        }

        if(valUsername.equals("Admin@gmail.com") && valPassword.equals("Admin444")){

            Intent intent = new Intent(MainActivity.this,Welcome.class);
            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
            startActivity(intent );
            finish();
        }else {

            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
        }

    }
}