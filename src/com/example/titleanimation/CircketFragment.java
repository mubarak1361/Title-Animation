package com.example.titleanimation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CircketFragment extends Fragment{

	private View mView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);		
		mView = inflater.inflate(R.layout.animation_viewpager_item, container,false);
		((TextView)mView.findViewById(R.id.txt_viewpager_item_header)).setText("Circket Content");
		return mView;
	}
	
	
	
}
