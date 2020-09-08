package com.example.coie_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Button JButton=(Button)findViewById(R.id.Jbutton);
        final TextView Jn=(TextView) findViewById(R.id.text);
        setContentView(R.layout.activity_main);
        JButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                //startActivity(intent);
                //finish();
                Jn.setText("고기");
            }
        });
    }
}