package com.example.lukebates.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Luke Bates on 18/07/2016.
 */
public class SecondFrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.second_frag, container, false);
        return v;
    }

    public static SecondFrag newInstance(String text) {
        SecondFrag secondFrag = new SecondFrag();
        return secondFrag;
    }
}
