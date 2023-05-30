package com.TiaraTrisantiRamadhani_10120094_UTS_AKB;
/*
 * NIM : 10120094
 *Nama : Tiara Trisanti Ramadhani
 *Kelas : IF3
 * */
import android.database.Cursor;

import com.TiaraTrisantiRamadhani_10120094_UTS_AKB.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

//10120094 - Tiara - IF3