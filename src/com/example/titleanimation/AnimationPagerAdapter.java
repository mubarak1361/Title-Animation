package com.example.titleanimation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;


class AnimationPagerAdapter extends FragmentStatePagerAdapter {
	
	private Fragment[] fragments = {new FootballFragment(),new CircketFragment(),new GolfFragment()};
	private Fragment fragment = null;

	public AnimationPagerAdapter(FragmentManager fm) {
		super(fm);
	}
	
	@Override
	public int getCount() {
		return fragments.length;
	}
	

	@Override
	public boolean isViewFromObject(View view, Object object) {
		if(object instanceof FootballFragment){
            view.setTag(2);
        }
        if(object instanceof CircketFragment){
            view.setTag(1);
        }
        if(object instanceof GolfFragment){
            view.setTag(0);
        }
        return super.isViewFromObject(view, object);
	}

	
	@Override
	public Fragment getItem(int position) {
			switch (position) {
			case 0:
				fragment =  fragments[position];
				break;
			case 1:
				fragment = fragments[position];
				break;
			case 2:
				fragment = fragments[position];
				break;

			default:
				break;
			}
		return fragment;
	}

	
}