package com.example.android.absholistic.Health;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.absholistic.R;

import java.util.ArrayList;
import java.util.List;


public class HealthActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        List<Book> list = new ArrayList<>();

        Book mainBook = new Book();
        mainBook.setTitle("I will be a great programmer");
        list.add(mainBook);

        //TODO: make network request and get list of data.

        RecyclerView bookListView = (RecyclerView) findViewById(R.id.bookslist_rv);
        bookListView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));  //Vertical by default

        BooksAdapter adapter = new BooksAdapter(list);

        bookListView.setAdapter(adapter);

        //TODO: once you receive data update your adapter and notify data set changed.

    }

}