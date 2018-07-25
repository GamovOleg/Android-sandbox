package com.gelo.a0012;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Нажата кнопка 1");

                Toast toast = Toast.makeText(MainActivity.this,"Нажата 1", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0 ,0);
                LinearLayout toastImage = (LinearLayout) toast.getView();
                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setImageResource(R.drawable.lo);
                toastImage.addView(imageView, 0);
                toast.show();

            }
        });

        button2.setOnClickListener(this);
    }

    public void clickButton3(View v) {
        textView.setText("Нажата кнопка 3");

    }

    @Override
    public void onClick(View v) {
        textView.setText("Нажата кнопка 2");

    }
}
