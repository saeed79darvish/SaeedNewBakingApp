package com.example.saeedmac.saeednewbakingapp.activites;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.saeedmac.saeednewbakingapp.R;
import com.example.saeedmac.saeednewbakingapp.fragment.RecipeFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecipeFragment();
    }
    private void initRecipeFragment(){
        RecipeFragment rf = new RecipeFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragment_container, rf, RecipeFragment.class.getSimpleName());
        ft.commit();
    }
}
