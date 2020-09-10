package com.example.coie_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChangwonList extends AppCompatActivity{
    Bundle bundle;
    TextView Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Text=(TextView)findViewById(R.id.whereText);
        final Button SearchButton=(Button)findViewById(R.id.search_button);
        Button COButton1=(Button)findViewById(R.id.co_button1);
        Button COButton2=(Button)findViewById(R.id.co_button2);
        Button COButton3=(Button)findViewById(R.id.co_button3);
        Button COButton4=(Button)findViewById(R.id.co_button4);
        Button COButton5=(Button)findViewById(R.id.co_button5);
        Button COButton6=(Button)findViewById(R.id.co_button6);
        Button COButton7=(Button)findViewById(R.id.co_button7);
        Button COButton8=(Button)findViewById(R.id.co_button8);
        Button COButton9=(Button)findViewById(R.id.co_button9);
        bundle=getIntent().getExtras();
        Text.setText(bundle.getString("where")+" 상담센터 리스트");

        SearchButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
            }
        });
        COButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(),Office.class);
                startActivity(intent);
                //finish();
            }
        });
    }
}
