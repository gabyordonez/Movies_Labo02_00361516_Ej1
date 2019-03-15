package com.gordonez.loginFake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button click_button = findViewById(R.id.click_button);


        click_button.setOnClickListener(this);
        click_button.setOnLongClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int clicked_id = v.getId();
        switch (clicked_id){
            case R.id.click_button:
                TextView m = (TextView) findViewById(R.id.display_text);
                EditText username = findViewById(R.id.username);
                m.setText(username.getText().toString());

        }

    }

    @Override
    public boolean onLongClick(View v) {

        int clicked_id = v.getId();
        switch (clicked_id){
            case R.id.click_button:
                TextView m = (TextView) findViewById(R.id.display_text);
                EditText password = findViewById(R.id.password);
                m.setText(password.getText().toString());
        }
        return true;
    }
}
