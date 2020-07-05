package com.createsapp.primevideoclone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.createsapp.primevideoclone.adapter.BannerMoviesPagerAdapter;
import com.createsapp.primevideoclone.adapter.MainRecyclerAdapter;
import com.createsapp.primevideoclone.model.AllCategory;
import com.createsapp.primevideoclone.model.BannerMovies;
import com.createsapp.primevideoclone.model.CategoryItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    BannerMoviesPagerAdapter bannerMoviesPagerAdapter;
    TabLayout indicatorTab, categoryTab;
    ViewPager bannerMoviesViewPager;
    List<BannerMovies> homeBannerList;
    List<BannerMovies> tvShowBannerList;
    List<BannerMovies> movieBannerList;
    List<BannerMovies> kidsBannerList;

    MainRecyclerAdapter mainRecyclerAdapter;
    RecyclerView mainRecycler;
    List<AllCategory> allCategoryList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        indicatorTab = findViewById(R.id.tab_indicator);
        categoryTab = findViewById(R.id.tabLayout);

        homeBannerList = new ArrayList<>();
        homeBannerList.add(new BannerMovies(1, "PONMANGAL VANDHAL", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner1.png", ""));
        homeBannerList.add(new BannerMovies(1, "Little Women", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner2.png", ""));
        homeBannerList.add(new BannerMovies(2, "BHOOT The Hunted Ship", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner3.png", ""));
        homeBannerList.add(new BannerMovies(3, "MIRZAPUR", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner4.png", ""));
        homeBannerList.add(new BannerMovies(4, "PIKACHU", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/homebanner5.png", ""));

        tvShowBannerList = new ArrayList<>();
        tvShowBannerList.add(new BannerMovies(1, "SKULL & ROSES", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/tvshowbanner1.png", ""));
        tvShowBannerList.add(new BannerMovies(2, "COMICSTAAN", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/tvshowbanner2.png", ""));
        tvShowBannerList.add(new BannerMovies(3, "UPLOAD", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/tvshowbanner3.png", ""));
        tvShowBannerList.add(new BannerMovies(4, "HUNTERS", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/tvshowbanner4.png", ""));

        movieBannerList = new ArrayList<>();
        movieBannerList.add(new BannerMovies(1, "A Beautiful Day", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/moviebanner1.png", ""));
        movieBannerList.add(new BannerMovies(2, "Black-Mail", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/moviebanner2.png", ""));
        movieBannerList.add(new BannerMovies(3, "SUFNA", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/moviebanner3.png", ""));

        kidsBannerList = new ArrayList<>();
        kidsBannerList.add(new BannerMovies(1, "Inspector Chingum", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/kidsbanner1.png", ""));
        kidsBannerList.add(new BannerMovies(2, "ODDBODS", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/kidsbanner2.png", ""));
        kidsBannerList.add(new BannerMovies(3, "BAJRANGI", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/kidsbanner3.png", ""));
        kidsBannerList.add(new BannerMovies(4, "Tenali Raman", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/kidsbanner4.png", ""));
        kidsBannerList.add(new BannerMovies(5, "WishenProof", "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/primevideo/banners/kidsbanner5.png", ""));

        //this is default tab selected
        setBannerMoviesPagerAdapter(homeBannerList);

        //on tab change selected data
        categoryTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 1:
                        setBannerMoviesPagerAdapter(tvShowBannerList);
                        return;
                    case 2:
                        setBannerMoviesPagerAdapter(movieBannerList);
                        return;
                    case 3:
                        setBannerMoviesPagerAdapter(kidsBannerList);
                        return;

                    default:
                        setBannerMoviesPagerAdapter(homeBannerList);
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //first we will add catitem data
        List<CategoryItem> homeCateListItem1 = new ArrayList<>();
        homeCateListItem1.add(new CategoryItem(1, "7500", "https://static2.showtimes.com/poster/660x980/7500-amazon-prime-video-145865.jpg", ""));
        homeCateListItem1.add(new CategoryItem(2, "7500", "https://static2.showtimes.com/poster/660x980/7500-amazon-prime-video-145865.jpg", ""));
        homeCateListItem1.add(new CategoryItem(3, "7500", "https://static2.showtimes.com/poster/660x980/7500-amazon-prime-video-145865.jpg", ""));
        homeCateListItem1.add(new CategoryItem(4, "7500", "https://static2.showtimes.com/poster/660x980/7500-amazon-prime-video-145865.jpg", ""));
        homeCateListItem1.add(new CategoryItem(5, "7500", "https://static2.showtimes.com/poster/660x980/7500-amazon-prime-video-145865.jpg", ""));


        allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory(1, "Watch next Tv and movies", homeCateListItem1));
        allCategoryList.add(new AllCategory(2, "Movies in Hindi", homeCateListItem1));
        allCategoryList.add(new AllCategory(3, "Kids and family movies", homeCateListItem1));
        allCategoryList.add(new AllCategory(4, "Amazon Original series", homeCateListItem1));

        //here we pass array to recycler setup method
        setMainRecycler(allCategoryList);
    }

    private void setBannerMoviesPagerAdapter(List<BannerMovies> bannerMoviesList) {
        bannerMoviesViewPager = findViewById(R.id.banner_viewPager);
        bannerMoviesPagerAdapter = new BannerMoviesPagerAdapter(this, bannerMoviesList);
        bannerMoviesViewPager.setAdapter(bannerMoviesPagerAdapter);
        indicatorTab.setupWithViewPager(bannerMoviesViewPager);

        Timer sliderTimer = new Timer();
        sliderTimer.scheduleAtFixedRate(new AutoSlider(), 4000, 6000);
        indicatorTab.setupWithViewPager(bannerMoviesViewPager, true);
    }

    class AutoSlider extends TimerTask {

        @Override
        public void run() {
            MainActivity.this.runOnUiThread(() -> {
                if (bannerMoviesViewPager.getCurrentItem() < homeBannerList.size() - 1) {
                    bannerMoviesViewPager.setCurrentItem(bannerMoviesViewPager.getCurrentItem() + 1);
                } else {
                    bannerMoviesViewPager.setCurrentItem(0);
                }
            });
        }
    }


    public void setMainRecycler(List<AllCategory> allCategoryList) {
        mainRecycler = findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        mainRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategoryList);
        mainRecycler.setAdapter(mainRecyclerAdapter);
    }
}