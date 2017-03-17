package com.example.davidyu.algorithhms_sedgewick_c2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.concurrent.Callable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int sum = 0 ;
                for (int i = 0; i < 20; i++) {

                    Log.e("num", i+"");

                    sum+= (i*3-1);

                }




                Toast.makeText(MainActivity.this, "sum is "+ sum, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
