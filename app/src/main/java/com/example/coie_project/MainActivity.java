package com.example.coie_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button CButton,JButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CButton=(Button)findViewById(R.id.chang_button);
        JButton=(Button)findViewById(R.id.jinju_button);
        CButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent= new Intent(getApplicationContext(),ChangwonList.class);
                intent.putExtra("where",CButton.getText().toString());
                startActivity(intent);
            }
        });
        JButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),ChangwonList.class);
                intent.putExtra("where","진주");
                startActivity(intent);
                //finish();
            }
        });
    }
}