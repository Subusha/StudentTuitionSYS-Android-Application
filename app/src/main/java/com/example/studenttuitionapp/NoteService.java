package com.example.studenttuitionapp;

import android.provider.ContactsContract;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NoteService {
    @GET("notes")
    Call<List<ContactsContract.CommonDataKinds.Note>> getNotes();
}