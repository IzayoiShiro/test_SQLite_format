package com.example.test_sqlite_format.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.LoginFilter;
import android.util.Log;

import com.example.test_sqlite_format.database.PersonTable.Person;

/**
 * Created by 杨天宇 on 2016/7/14.
 */
public class MySQLiteOpenHelper extends SQLiteOpenHelper {
    private static final String TAG = "MySQLiteOpenHelper";
    public MySQLiteOpenHelper(Context context) {
        super(context, "person", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + Person.TABLE_NAME + "(" +
                Person._ID + " integer primary key autoincrement," +
                Person.NAME + " varchar(20)," +
                Person.NUMBER + " varchar(20))"
        );
        Log.i(TAG, "onCreate: 数据库被创建");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("alter table "
                + Person.TABLE_NAME + " add account varchar(20)"
        );
    }
}
