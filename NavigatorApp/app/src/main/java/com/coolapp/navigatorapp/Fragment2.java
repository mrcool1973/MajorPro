package com.coolapp.navigatorapp;

import android.app.FragmentManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Ruchi on 3/20/2015.
 */
public class Fragment2 extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment2, container,false);
        TextView sup=(TextView)view.findViewById(R.id.signup);
        sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate();
            }
        });
        return view;
    }

    @Override
    public void onClick(View v) {

    }

    public void navigate(){
        Fragment newFragment;

        newFragment=new Fragment3();
        this.getFragmentManager().beginTransaction()
                .replace(R.id.mainContent, newFragment,null)
                .addToBackStack(null)
                .commit();

    }


}
