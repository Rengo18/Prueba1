package com.example.prueba1;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Propietario extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((Principal) getActivity()).getSupportActionBar().setTitle("Perfil");
        return inflater.inflate(R.layout.fragment_propietario, container, false);

    }



}
