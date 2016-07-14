package com.example.test_sqlite_format.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.test_sqlite_format.database.PersonTable.Person;

/**
 * Created by 杨天宇 on 2016/7/14.
 */
public class MySQLiteOpenHelper extends SQLiteOpenHelper {
    public MySQLiteOpenHelper(Context context) {
        super(context, "person", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table "+ Person.TABLE_NAME+"("+
                Person._ID + " integer primary key increment,"+
                Person.NAME + " varchar(20),"+
                Person.NUMBER + " varchar(20))"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
