package com.example.coie_project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Office extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
        final Button BossButton=(Button)findViewById(R.id.boss_review_button);
        final Button BossCallButton=(Button)findViewById(R.id.boss_call_button);
        BossButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(getApplicationContext(), ViewReview.class);
                startActivity(intent);
            }
        });
        BossCallButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //전화 앱에 번호 찍어주기
                //Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-8541-6939"));      //원래 이런 형태 인데
                //Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+"010-8541-6939"));   //이런식으로 해도 작동 잘하는거같으니까
                String callNum="010-8541-6939";// '-' 빼고 해도 작동 잘 하는것 확인했습니다.
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+callNum));             // 이렇게 해도 될거같습니다.
                startActivity(intent);
            }
        });
    }
}
