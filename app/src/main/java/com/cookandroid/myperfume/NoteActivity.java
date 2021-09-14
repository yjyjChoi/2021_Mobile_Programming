package com.cookandroid.myperfume;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class NoteActivity extends AppCompatActivity {

    Button saveBtn, loadBtn;
    EditText editText;
    String fileName = "text.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        setTitle("My Perfume");

        saveBtn = (Button) findViewById(R.id.saveBtn);
        loadBtn = (Button) findViewById(R.id.loadBtn);
        editText = (EditText) findViewById(R.id.editText);

        // 저장 버튼
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileOutputStream outFs = openFileOutput(fileName, Context.MODE_PRIVATE);
                    String str = editText.getText().toString();
                    outFs.write(str.getBytes());
                    outFs.close();
                    Toast.makeText(getApplicationContext(), fileName + "이 저장되었습니다.", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                }
            }
        });

        // 불러오기 버튼
        loadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = readFromFile(fileName);
                editText.setText(str);
            }
        });
    }

    String readFromFile(String fName) {
        String context = null;
        FileInputStream inFs;

        try {
            inFs = openFileInput(fName);
            byte[] txt = new byte[500];
            inFs.read(txt);
            inFs.close();
            context = (new String(txt)).trim();
        } catch (IOException e) {
            editText.setHint("기록이 없습니다.");
        }
        return context;
    }

}
