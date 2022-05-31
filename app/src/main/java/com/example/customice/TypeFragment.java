package com.example.customice;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TypeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.typesfragment_layout, container, false);
    }
}
//@Override
//public View onCreateView(LayoutInflater inflater, ViewGroup container,
// Bundle savedInstanceState) {
// Inflate the layout for this fragment
//return inflater.inflate(R.layout.fragment_flavors, container, false);
//}
