package com.example.test_sqlite_format;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.test_sqlite_format.database.MySQLiteOpenHelper;

public class MainActivity extends AppCompatActivity {

    private MySQLiteOpenHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelper = new MySQLiteOpenHelper(this);
        mHelper.getWritableDatabase();
    }
}
