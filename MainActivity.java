package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button leftButton, rightButton;
    private EditText leftText, rightText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rightButton = (Button) findViewById(R.id.bt_right);
        leftButton = (Button) findViewById(R.id.bt_left);
        rightText = (EditText) findViewById(R.id.righttext);
        leftText = (EditText) findViewById(R.id.lefttext);
        rightButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                suchita_moveleft(view);

            }
        });
        leftButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                suchita_moveright(view);

            }
        });
    }


    public void suchita_moveleft(View view)
    {
        String a;
        a = rightText.getText().toString();
        leftText.setText(a);


    }

    public void suchita_moveright(View view)
    {
        String b;
        b = leftText.getText().toString();
        rightText.setText(b);


    }

}
