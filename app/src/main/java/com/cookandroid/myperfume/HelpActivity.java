package com.cookandroid.myperfume;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HelpActivity extends AppCompatActivity {

    Button inquiryBtn, backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helping);
        setTitle("My Perfume");

        inquiryBtn = (Button) findViewById(R.id.inquiryBtn); // 문의하기
        inquiryBtn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.setType("plain/text");
                String address = "my_perfume@mju.ac.kr";
                email.putExtra(Intent.EXTRA_EMAIL, address);
                email.putExtra(Intent.EXTRA_SUBJECT, "앱 이용 문의"); // 제목
                email.putExtra(Intent.EXTRA_TEXT, "문의 내용을 적어주세요."); // 내용
                startActivity(email);
            }
        });

        backBtn = (Button) findViewById(R.id.backBtn); // 이전
        backBtn.setOnClickListener(new View.OnClickListener() { // 이전
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
