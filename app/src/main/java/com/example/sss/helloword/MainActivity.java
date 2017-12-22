package com.example.sss.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import static com.example.sss.helloword.R.menu.lay_menu;

public class MainActivity extends AppCompatActivity {

    private TextView greetView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greetView = (TextView) findViewById(R.id.hello);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.lay_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.act_bye){
            greetView.setText(R.string.finalbye);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

