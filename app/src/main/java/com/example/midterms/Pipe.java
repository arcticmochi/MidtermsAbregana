package com.example.midterms;

import android.content.Context;

import java.util.List;

public class Pipe {
    String brand;
    double diameter;

    public Pipe(String brand, double diameter) {
        this.brand = brand;
        this.diameter = diameter;
    }

    // TODO Milestone 1: Fix spPipe adapter.
    public SpPipeAdapter(Context context, int resource, List<Pipe> objects) {
        this.brand = objects;
        this.diameter = Double.valueOf(resource);
    }
}
