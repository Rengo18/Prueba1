package com.example.prueba1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class Propiedades extends Fragment {

    ViewPager viewPager;
    TabLayout tabLayout;
    AppBarLayout appBarLayout;
    int contador =0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_propiedades, container, false);
        ViewGroup contenedor =(ViewGroup)container.getParent();


            appBarLayout =((ViewGroup)contenedor.getParent()).findViewById(R.id.appBar );
            tabLayout=new TabLayout(getActivity());
            appBarLayout.addView(tabLayout);






        viewPager= (ViewPager)view.findViewById(R.id.viewPager);



        ViewPageAdapter vpa = new  ViewPageAdapter(getFragmentManager());

        vpa.addFragment(new propiedad_item(),"prop1");
        vpa.addFragment(new propiedad_item(),"prop2");

        viewPager.setAdapter(vpa);
        tabLayout.setupWithViewPager(viewPager);


        ((Principal) getActivity()).getSupportActionBar().setTitle("Propiedades");
        return view;
    }

    public class ViewPageAdapter extends FragmentPagerAdapter {
        private List<Fragment> fragmentList = new ArrayList<>();
        private List<String> titulosFragment = new ArrayList<>();

        public ViewPageAdapter(FragmentManager fm) {
            super(fm);
        }



        @Override
        public Fragment getItem(int position) {
            return null;
        }

        @Override
        public int getCount() {
            return 0;
        }
        public  CharSequence getPageTitle(int posicion){
            return titulosFragment.get(posicion);
        }

        public void addFragment (Fragment fragment , String titulo){
            fragmentList.add(fragment);
            titulosFragment.add(titulo);
        }
    }



}
