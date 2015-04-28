package com.example.titleanimation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GolfFragment extends Fragment{
	
	private View mView;
	private int totalChapter = 6;
	private int[] numberofTopics = new int[] {3,6,4,6,2,2,0};
	private int subtopics = 1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			super.onCreateView(inflater, container, savedInstanceState);
			mView = inflater.inflate(R.layout.animation_viewpager_item, container, false);
			((TextView)mView.findViewById(R.id.txt_viewpager_item_header)).setText("Golf Content");
			
			for (int i = 0; i <= totalChapter; i++) {
				for (int j = 0; j <=numberofTopics[i]; j++) {
					if((i!=1 && j!=3)||(i!=4 && j!=1)){
						for (int k = 0; k <=subtopics; k++) {
							
						}
					}
					else{
						
					}
				}
			}
			return mView;
	}	
	
	

}
