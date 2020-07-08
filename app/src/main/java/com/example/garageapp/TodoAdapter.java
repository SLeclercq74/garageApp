package com.example.garageapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TodoAdapter {

    private PlanningActivity activity;
    private ArrayList<todo> todo;

    public TodoAdapter(PlanningActivity activity, ArrayList<todo> todo) {
        this.activity = activity;
        this.todo = todo;
    }

}
