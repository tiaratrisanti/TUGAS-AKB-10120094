package com.TiaraTrisantiRamadhani_10120094_UTS_AKB.database;

/*
 * NIM : 10120094
 *Nama : Tiara Trisanti Ramadhani
 *Kelas : IF3
 * */

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.TiaraTrisantiRamadhani_10120094_UTS_AKB.model.Note;
import com.TiaraTrisantiRamadhani_10120094_UTS_AKB.NoteInterface;

public class DatabaseHelper extends SQLiteOpenHelper implements NoteInterface {

    public DatabaseHelper(@Nullable Context context) {
        super(context, "db_catatan", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE tbl_note (id TEXT, title TEXT, category TEXT,description TEXT, date TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE tbl_note");
    }

    public Cursor read(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        return sqLiteDatabase.rawQuery("SELECT * FROM tbl_note", null);
    }

    public boolean create (Note note){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL("INSERT INTO tbl_note VALUES ('"+note.getId()+"','"+note.getTitle()+"','"+note.getCategory()+"','"+note.getDesc()+"','"+note.getDate()+"')");
        return true;
    }

    public boolean update (Note note){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL("UPDATE tbl_note SET title='"+note.getTitle()+"', category='"+note.getCategory()+"', description='"+note.getDesc()+"', date='"+note.getDate()+"' WHERE id='"+note.getId()+"'");
        return true;
    }

    public boolean delete(String id){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.execSQL("DELETE FROM tbl_note WHERE id='"+id+"'");
        return true;
    }
}

//10120094 - Tiara - IF3