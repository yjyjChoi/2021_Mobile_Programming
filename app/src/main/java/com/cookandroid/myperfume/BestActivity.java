package com.cookandroid.myperfume;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BestActivity extends AppCompatActivity {

    private Button backBtn;
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        setTitle("My Perfume");

        button1 = (Button)findViewById(R.id.best_buy1);
        button2 = (Button)findViewById(R.id.best_buy2);
        button3 = (Button)findViewById(R.id.best_buy3);
        button4 = (Button)findViewById(R.id.best_buy4);
        button5 = (Button)findViewById(R.id.best_buy5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all?query=%EC%82%B0%ED%83%80%EB%A7%88%EB%A6%AC%EC%95%84%EB%85%B8%EB%B2%A8%EB%9D%BC%20%EB%A9%9C%EB%A1%9C%EA%B7%B8%EB%9D%BC%EB%85%B8&frm=NVSHATC&prevQuery=%EC%A1%B0%EB%A7%90%EB%A1%A0%20%EC%9E%89%EA%B8%80%EB%A6%AC%EC%89%AC%20%ED%8E%98%EC%96%B4%20%EC%95%A4%20%ED%94%84%EB%A6%AC%EC%A7%80%EC%95%84"));
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all?query=%EB%B0%94%EC%9D%B4%EB%A0%88%EB%8F%84%20%EB%9D%BC%20%ED%8A%A4%EB%A6%BD&frm=NVSHATC&prevQuery=%EC%95%84%EC%BF%A0%EC%95%84%EB%94%94%ED%8C%8C%EB%A5%B4%EB%A7%88%20%EB%AF%B8%EB%A5%B4%ED%86%A0%20%EB%94%94%20%ED%8C%8C%EB%82%98%EB%A0%88%EC%95%84"));
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all?query=%EB%94%A5%ED%8B%B0%ED%81%AC%20%ED%83%90%EB%8B%A4%EC%98%A4&frm=NVSHATC&prevQuery=%EC%A1%B0%EB%A7%90%EB%A1%A0%20%EC%9A%B0%EB%93%9C%20%EC%84%B8%EC%9D%B4%EC%A7%80%20%EC%95%A4%20%EC%94%A8%20%EC%86%94%ED%8A%B8%20%EC%BD%94%EB%A1%B1"));
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all?query=%EC%A1%B0%EB%A7%90%EB%A1%A0%20%EC%9E%89%EA%B8%80%EB%A6%AC%EC%89%AC%20%ED%8E%98%EC%96%B4%20%EC%95%A4%20%ED%94%84%EB%A6%AC%EC%A7%80%EC%95%84&frm=NVSHATC&prevQuery=%EB%B0%94%EC%9D%B4%EB%A0%88%EB%8F%84%20%EB%9D%BC%20%ED%8A%A4%EB%A6%BD"));
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search.shopping.naver.com/search/all?query=%EB%8F%8C%EC%B2%B4%EC%95%A4%EA%B0%80%EB%B0%94%EB%82%98%20%EB%9D%BC%EC%9D%B4%ED%8A%B8%EB%B8%94%EB%A3%A8&frm=NVSHATC&prevQuery=%EB%94%A5%ED%8B%B0%ED%81%AC%20%ED%83%90%EB%8B%A4%EC%98%A4"));
                startActivity(intent);
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
