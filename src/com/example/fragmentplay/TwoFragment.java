package com.example.fragmentplay;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TwoFragment extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, 
			@Nullable Bundle savedInstanceState) {
		
		  // Defines the xml file for the fragment
	      View view = inflater.inflate(R.layout.fragment_two, container, false);
	      
	      // Setup handles to view objects here
	      // etFoo = (EditText) v.findViewById(R.id.etFoo);
	      
	   
	      
	      return view;
	}
}
