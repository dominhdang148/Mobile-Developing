package com.techja.truyencuoi;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.jokes.R;

public class M000SplashFrg extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initView();
        return inflater.inflate(R.layout.m000_frg_splash,container, false);
    }
    private void initView(){
        new Handler().postDelayed(this::gotoM001Screen,1000);
    }
    private void gotoM001Screen(){
        ((MainActivity)getActivity()).gotoM001Screen();
    }
}
