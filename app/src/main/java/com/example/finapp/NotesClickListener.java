package com.example.finapp;

import androidx.cardview.widget.CardView;

import com.example.finapp.Models.Notes;

public interface NotesClickListener {

    void onClick (Notes notes);
    void onLongClick (Notes notes, CardView cardView);

}
