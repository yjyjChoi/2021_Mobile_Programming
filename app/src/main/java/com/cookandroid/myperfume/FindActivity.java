package com.cookandroid.myperfume;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FindActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        setTitle("My Perfume");

        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox)findViewById(R.id.checkBox5);
        button1 = (Button) findViewById(R.id.button1); // 확인
        button2 = (Button) findViewById(R.id.button2); // 이전

        button1.setOnClickListener(new Button.OnClickListener() { // 확인
            public void onClick(View v) {
                if (!checkBox1.isChecked() && !checkBox2.isChecked() && !checkBox3.isChecked() && !checkBox4.isChecked() && !checkBox5.isChecked()) {
                    Toast.makeText(getApplicationContext(), "아무것도 선택되지 않았습니다. 반드시 하나 이상을 선택해주세요", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                    intent.putExtra("checkBox1", checkBox1.isChecked()); // 머스크
                    intent.putExtra("checkBox2", checkBox2.isChecked()); // 우디
                    intent.putExtra("checkBox3", checkBox3.isChecked()); // 시트러스
                    intent.putExtra("checkBox4", checkBox4.isChecked()); // 플로럴
                    intent.putExtra("checkBox5", checkBox5.isChecked()); // 파우더리
                    startActivity(intent);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() { // 이전
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {

    }

}
