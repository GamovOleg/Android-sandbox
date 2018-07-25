package com.gelo.a0009;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button button1;
    Button button2;
    Button button3;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "найдем View элементы");
        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int i = 6/0;
                    textView.setText("Зузультат деления = " + i);
                } catch (Exception e) {
                    Log.d(TAD, "Делить на 0 нельзя", e);
                    e.printStackTrace();
                }
//                Log.d(TAG, "Обработаем нажатие кнопки 1");
            }
        });

        button2.setOnClickListener(this);
    }

    public void clickButton3(View V) {
        textView.setText("Нажата кнопка 3");
        Log.d(TAG, "Обработаем нажатие кнопки3");
    }

    @Override
    public void onClick(View v) {
        textView.setText("Нажата кнопка 2");
        Log.d(TAG, "Обработаем кнопку 2");
    }
}

        button1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        try {
        int i = 6/0;
        textView.setText("Зузультат деления = " + i);
        } catch (Exception e) {
        Log.d(TAD, "Делить на 0 нельзя", e);
        e.printStackTrace();
        }
//                Log.d(TAG, "Обработаем нажатие кнопки 1");
        }
        });