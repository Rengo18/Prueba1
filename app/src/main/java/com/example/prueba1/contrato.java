package com.example.prueba1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class contrato extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ((Principal) getActivity()).getSupportActionBar().setTitle("Contratos");
        return inflater.inflate(R.layout.fragment_contrato, container, false);
    }


}
