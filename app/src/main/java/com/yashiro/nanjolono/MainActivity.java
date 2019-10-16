package com.yashiro.nanjolono;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void clickHandler(View source){
        TextView tv = (TextView) findViewById(R.id.show);
        tv.setText("にたま在どを");
    }
}
