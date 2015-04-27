package com.example.titleanimation;

import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AnimationActivity extends ActionBarActivity {
	
	private ViewPager animationViewPager;
	private AnimationPagerAdapter animationPagerAdapter;
	public Toolbar homeToolBar;
	private CircleIndicator circleIndicator;
	private String[] titles =  new String[]{"Football","Circket","Golf"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_animation);
	
		
		homeToolBar = (Toolbar) findViewById(R.id.home_toolbar);
		circleIndicator = (CircleIndicator) findViewById(R.id.indicator_default);
		
		if(homeToolBar!=null){
			setSupportActionBar(homeToolBar);
		}
		animationViewPager = (ViewPager) findViewById(R.id.animation_viewpager);
		animationPagerAdapter = new AnimationPagerAdapter(getSupportFragmentManager());
		animationViewPager.setAdapter(animationPagerAdapter);
		circleIndicator.setViewPager(animationViewPager);
		
		final Drawable upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
		upArrow.setColorFilter(getResources().getColor(android.R.color.white),Mode.SRC_ATOP);
		getSupportActionBar().setHomeAsUpIndicator(upArrow);
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final LayerDrawable background = (LayerDrawable) animationViewPager.getBackground();

        background.getDrawable(0).setAlpha(0); // this is the lowest drawable
        background.getDrawable(1).setAlpha(0);
        background.getDrawable(2).setAlpha(255); // this is the upper one 

        animationViewPager.setPageTransformer(true, new ViewPager.PageTransformer() {
            @Override
            public void transformPage(View view, float position) {

                int index = (Integer) view.getTag();
                Drawable currentDrawableInLayerDrawable;
                currentDrawableInLayerDrawable = background.getDrawable(index);
                
                if(position <= -1 || position >= 1) {
                    currentDrawableInLayerDrawable.setAlpha(0);
                } else if( position == 0 ) {
                    currentDrawableInLayerDrawable.setAlpha(255);
                } else { 
                    currentDrawableInLayerDrawable.setAlpha((int)(255 - Math.abs(position*255)));
                }

            }
        });
	}
}
