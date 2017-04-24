package com.example.android.absholistic.Health;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ridita on 4/23/17.
 */

public class BooksAdapter extends RecyclerView.Adapter {

    private List<Book> bookList;

    public BooksAdapter(List<Book> books) {
        bookList = books;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new BookViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder bookHolder, int position) {
        ((BookViewHolder) bookHolder).bind(bookList.get(position));
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}
