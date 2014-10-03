package com.example.fragmentplay;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);        
    }
    
    public void onFragmentOne( View v){
    	// create
    	FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    	
    	// hide, show, add, remove fragment
    	ft.replace(R.id.flContainer, new OneFragment(), "one");
    	
    	getSupportFragmentManager().findFragmentByTag("one");
    	
    	ft.addToBackStack(null);
    	// execute
    	ft.commit();
    }
    
    public void onFragmentTwo( View v){
    	// create
    	FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    	
    	// hide, show, add, remove fragment
    	ft.replace(R.id.flContainer, new TwoFragment());
    	
    	ft.addToBackStack(null);
    	// execute
    	ft.commit();
    	
    }

}
