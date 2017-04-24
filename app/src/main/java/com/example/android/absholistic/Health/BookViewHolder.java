package com.example.android.absholistic.Health;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.absholistic.R;

/**
 * Created by ridita on 4/23/17.
 */

public class BookViewHolder extends RecyclerView.ViewHolder {

    private TextView titleTextView;

    public BookViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        titleTextView = (TextView) itemView.findViewById(R.id.zerobellybooktext);
    }

    private static View inflateView(ViewGroup parent) {
        return LayoutInflater.from(parent.getContext()).inflate(R.layout.health_books, parent, false);
    }

    public void bind(Book book) {
        titleTextView.setText(book.getTitle());
    }
}
