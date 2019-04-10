package com.example.wika.sharedpreferencenote;

import com.example.wika.sharedpreferencenote.models.Note;
import com.example.wika.sharedpreferencenote.models.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {

    private static List<User> users;
    private static List<Note> notes;

    static {
        users = new ArrayList<>();
        users.add(new User("wika", "rahasia"));
        users.add(new User("shinta", "rahasia"));
        users.add(new User("bela", "rahasia"));

        notes = new ArrayList<>();
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu detik hiduplah sepasang kekasih...."));
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu menit hiduplah sepasang kekasih...."));
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu jam hiduplah sepasang kekasih...."));
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
        notes.add(new Note("Lorem Ipsum", new Date(), "Pada suatu bulan hiduplah sepasang kekasih...."));
    }

    public static List<User> getUsers() {
        return users;
    }

    public static List<Note> getNotes() {
        return notes;
    }
}
