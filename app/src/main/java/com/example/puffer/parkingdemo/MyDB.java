package com.example.puffer.parkingdemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class MyDB extends SQLiteOpenHelper {
    private static String database = "mydb.db";
    private static final int version = 1;

    protected MyDB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    protected MyDB(Context context)
    {
        this(context,database,null,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS Parking_data(Data_id integer primary key autoincrement," +
                "TableName text not null UNIQUE," +
                "CreateTime real not null)");

        db.execSQL("CREATE TABLE IF NOT EXISTS Parking_point(Point_id integer primary key autoincrement," +
                "Latitude real not null," +
                "Longitude real not null)");

        db.execSQL("CREATE TABLE IF NOT EXISTS Parking_information(Info_id integer primary key autoincrement," +
                "Name text not null," +
                "Area text," +
                "Address text not null," +
                "Telephone text not null," +
                "Summary text," +
                "PayInfo text," +
                "TotalCar integer not null," +
                "TotalMotor integer not null," +
                "TotalBike integer not null)");

        db.execSQL("CREATE TABLE IF NOT EXISTS Parking_history(History_id integer primary key autoincrement," +
                "ViewTime real no null," +
                "Info_id integer no null UNIQUE)");

        db.execSQL("CREATE TABLE IF NOT EXISTS Parking_love(Love_id integer primary key autoincrement," +
                "Info_id integer no null UNIQUE)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Parking_data");
        db.execSQL("DROP TABLE IF EXISTS Parking_point");
        db.execSQL("DROP TABLE IF EXISTS Parking_information");
        db.execSQL("DROP TABLE IF EXISTS Parking_history");
        db.execSQL("DROP TABLE IF EXISTS Parking_love");

        this.onCreate(db);
    }
}
