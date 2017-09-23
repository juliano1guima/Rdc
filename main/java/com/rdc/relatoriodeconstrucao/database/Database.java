package com.rdc.relatoriodeconstrucao.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 40833 on 28/02/2016.
 */
public class Database extends SQLiteOpenHelper {

    public Database (Context context)
    {

        super (context, "RELATORIO", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ScriptSQL.getCreateRelatorio());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }
}
