package com.createsapp.primevideoclone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.createsapp.primevideoclone.adapter.BannerMoviesPagerAdapter;
import com.createsapp.primevideoclone.model.BannerMovies;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BannerMoviesPagerAdapter bannerMoviesPagerAdapter;
    TabLayout tabLayout;
    ViewPager bannerMoviesViewPager;
    List<BannerMovies> bannerMoviesList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bannerMoviesList = new ArrayList<>();
        bannerMoviesList.add(new BannerMovies(1, "test1", "https://netrockdeals.sirv.com/WP_netrockdeals.com/2020/04/H/o/1/How-to-Get-Amazon-Prime-Membership-For-Free-banner-min-1.jpg", ""));
        bannerMoviesList.add(new BannerMovies(2, "test2", "https://netrockdeals.sirv.com/WP_netrockdeals.com/2020/04/H/o/1/How-to-Get-Amazon-Prime-Membership-For-Free-banner-min-1.jpg", ""));
        bannerMoviesList.add(new BannerMovies(3, "test3", "https://netrockdeals.sirv.com/WP_netrockdeals.com/2020/04/H/o/1/How-to-Get-Amazon-Prime-Membership-For-Free-banner-min-1.jpg", ""));
        bannerMoviesList.add(new BannerMovies(4, "test4", "https://netrockdeals.sirv.com/WP_netrockdeals.com/2020/04/H/o/1/How-to-Get-Amazon-Prime-Membership-For-Free-banner-min-1.jpg", ""));

        setBannerMoviesPagerAdapter(bannerMoviesList);
    }

    private void setBannerMoviesPagerAdapter(List<BannerMovies> bannerMoviesList) {
        bannerMoviesViewPager = findViewById(R.id.banner_viewPager);
        bannerMoviesPagerAdapter = new BannerMoviesPagerAdapter(this, bannerMoviesList);
        bannerMoviesViewPager.setAdapter(bannerMoviesPagerAdapter);

    }

}