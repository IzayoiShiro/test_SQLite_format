package com.example.test_sqlite_format.database;

import android.provider.BaseColumns;

/**
 * Created by 杨天宇 on 2016/7/14.
 */
public class PersonTable {
    public static class Person implements BaseColumns {
        public static final String TABLE_NAME = "person";
        public static final String NAME = "name";
        public static final String NUMBER = "number";
    }
}
