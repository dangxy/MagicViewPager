package com.dxy.sociallogin.magicviewpager;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    int[] pagers = {R.mipmap.a, R.mipmap.a, R.mipmap.a, R.mipmap.a, R.mipmap.a};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setPageMargin(20);
        viewPager.setOffscreenPageLimit(3);
        viewPager.setPageTransformer(true,new AlphaPageTransforms());

        viewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return pagers.length;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView((View) object);
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {

                ImageView view = new ImageView(MainActivity.this);

                view.setImageResource(pagers[position]);
                container.addView(view);
                return view;


            }
        });

    }

    private class AlphaPageTransforms implements  ViewPager.PageTransformer{

        private static final float DEFFAULT_MIN_ALPHA=0.2f;
        private float mMinAlpha = DEFFAULT_MIN_ALPHA;
        @Override
        public void transformPage(View page, float position) {

            if(position<-1){
                page.setAlpha(mMinAlpha);
            }else if(position<=1){
                if(position<0){
                    float factor = mMinAlpha+(1-mMinAlpha)*(1+position);
                    page.setAlpha(factor);
                }else{
                    float factor = mMinAlpha+(1-mMinAlpha)*(1-position);
                    page.setAlpha(factor);
                }
            }else{
                page.setAlpha(mMinAlpha);
            }
        }
    }
}
