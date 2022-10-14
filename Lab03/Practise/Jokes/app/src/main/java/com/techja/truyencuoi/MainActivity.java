package com.techja.truyencuoi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.jokes.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String topicName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFrg(new M000SplashFrg());
    }
    private  void showFrg(Fragment frg){
        getSupportFragmentManager().beginTransaction().replace(R.id.In_main,frg,null).commit();
    }

    public void gotoM001Screen(){

    }
    public void gotoM002Screen(String topicName){

    }
    public void backToM001Screen(){
        gotoM001Screen();
    }
//    public void gotoM003Screen(ArrayList<StoryEntity>listStory, StoryEntity story){
//
//    }
}