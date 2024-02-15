package com.example.tp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    EditText username ;
    EditText password ;
    Button b2 ;

    private int nbre_click ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        username = (EditText) findViewById(R.id.username) ;
        password = (EditText) findViewById(R.id.password) ;
        b2 = (Button) findViewById(R.id.btn2) ;

        nbre_click = 0 ;

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                nbre_click ++ ;
                if(nbre_click < 5){
                    if( username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                        Intent intent = new Intent(login.this, MainActivity.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(login.this, "username or password incorrect !", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    b2.setEnabled(false);
                    Toast.makeText(login.this, "Désoles-tu dépasse le nombre maximal de cas !", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}