package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
<<<<<<< HEAD
import android.widget.Toast;
=======
>>>>>>> 1394675fcc5ececc88f38b362cf428d740164bec

public class MainActivity extends AppCompatActivity {

    //declaration toutes les variables
    EditText e1 ;
    EditText e2 ;
    Button b1 ;
<<<<<<< HEAD
=======
    TextView result ;
>>>>>>> 1394675fcc5ececc88f38b362cf428d740164bec

    private double height ;
    private double weight ;
    private double imc ;

    float CalculateIMC(double weight , double height){
        height=(height/100) ;
        return (float)(weight/(height*height));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.id1) ;
        e2 = (EditText) findViewById(R.id.id2) ;
        b1 = (Button) findViewById(R.id.id3) ;
<<<<<<< HEAD
=======
        result = (TextView) findViewById(R.id.id4) ;
>>>>>>> 1394675fcc5ececc88f38b362cf428d740164bec


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (e1.getText().length() > 0 && e2.getText().length() > 0) {
                        height = Float.parseFloat(e1.getText().toString());
                        weight = Float.parseFloat(e2.getText().toString());
                        imc = CalculateIMC(weight, height);

                        if (imc < 16) {
<<<<<<< HEAD
                            Toast.makeText(MainActivity.this, "Votre IMC est :" + imc + "Vous etes trop maigre", Toast.LENGTH_SHORT).show();
                        } else if (imc < 18.5) {
                            Toast.makeText(MainActivity.this, "Votre IMC est :" + imc + "Vous etes trop maigre", Toast.LENGTH_SHORT).show();
                        } else if (imc < 25) {
                            Toast.makeText(MainActivity.this, "Votre IMC est :" + imc + "Vous etes trop normal", Toast.LENGTH_SHORT).show();
                        } else if (imc < 30) {
                            Toast.makeText(MainActivity.this, "Votre IMC est :" + imc + "Vous etes Gros(se)", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "Votre IMC est :" + imc + "Vous etes Obése", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Remplir les cases SVP", Toast.LENGTH_SHORT).show();
                    }
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Erreur", Toast.LENGTH_SHORT).show();
=======
                            result.setText("Votre IMC est :" + imc + "Vous etes trop maigre");
                        } else if (imc < 18.5) {
                            result.setText("Votre IMC est :" + imc + "Vous etes trop maigre");
                        } else if (imc < 25) {
                            result.setText("Votre IMC est :" + imc + "Vous etes trop normal");
                        } else if (imc < 30) {
                            result.setText("Votre IMC est :" + imc + "Vous etes Gros(se)");
                        } else {
                            result.setText("Votre IMC est :" + imc + "Vous etes Obése");
                        }
                    }
                    else{
                        result.setText("Remplir les cases SVP");
                    }
                }
                catch (Exception e){
                    result.setText("Erreur");
>>>>>>> 1394675fcc5ececc88f38b362cf428d740164bec
                }
            }
        });

    }
}