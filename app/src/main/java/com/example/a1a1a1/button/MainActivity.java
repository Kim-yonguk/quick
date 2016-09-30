package com.example.a1a1a1.button;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //TextView text = (TextView) findViewById(R.id.textView);
        //text.setText("모바일 프로그래밍");
        //text.setTextSize(35);

        final Button aver = (Button) findViewById(R.id.average);
        final Button min = (Button) findViewById(R.id.minimum);


        final MyMinimum resultmin = new MyMinimum();
        final MyAverage resultav = new MyAverage();

        aver.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), String.valueOf(resultav.getResult()), Toast.LENGTH_LONG).show();
                    }
                }
        );
        min.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), String.valueOf(resultmin.getResult()), Toast.LENGTH_LONG).show();


                    }


                }
        );
    }
    /*
    public void onclick01(View v)

    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }
    public void onclick02(View v)
    {
        Toast.makeText(getApplicationContext(), "버튼을 클릭하셨습니다.", Toast.LENGTH_LONG).show();

    }
    public void onclick03(View v)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"));
        startActivity(intent);
    }
    */
}






