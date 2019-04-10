package com.example.wika.sharedpreferencenote.models;

import android.support.annotation.NonNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Note {

    private Long id;

    private String title;
    private Date date;
    private String content;

    public Note() { }

    public Note(String title, Date date, String content) {
        this(null, title, date, content);
    }

    public Note(Long id, String title, Date date, String content) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.content = content;
    }

    @NonNull
    public Long getId() {
        return id;
    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public String getFormattedDate() {
        DateFormat formatter = new SimpleDateFormat("dd MMM yyyy", Locale.US);
        return formatter.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
