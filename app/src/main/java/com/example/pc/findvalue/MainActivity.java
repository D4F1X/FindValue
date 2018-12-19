package com.example.pc.findvalue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultText;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                editText1 = (EditText) findViewById(R.id.editText1);
                editText2 = (EditText) findViewById(R.id.editText2);
                editText3 = (EditText) findViewById(R.id.editText3);
                editText4 = (EditText) findViewById(R.id.editText4);
                resultText = (TextView) findViewById(R.id.textView);

                resultText.setText("Yaz rakamı Bul cevabı");

            }


            public void button (View view) {

                if (editText1.getText().toString().matches(" ") || editText2.getText().toString().matches(" ") || editText3.getText().toString().matches(" ") || editText4.getText().toString().matches(" "))  {

                    resultText.setText("Sayi girmediniz!");

                if (editText1.getText().toString().matches("0"))



                    resultText.setText("Result:" + " " + 0);
                }

                if (editText2.getText().toString().matches("30"))


                resultText.setText("Result:" + " " + 1/2);

    }
}
