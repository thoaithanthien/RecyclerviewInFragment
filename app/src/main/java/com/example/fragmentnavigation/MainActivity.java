package com.example.fragmentnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    private RecyclerView rcvStore;
//    private ArrayList<Movie> arrayListMovie;
//    private AdapterStore adapterStore;
    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = getSupportActionBar();
//        arrayListMovie = new ArrayList<>();
//        rcvStore = (RecyclerView) findViewById(R.id.recyclerViewStore);
//
//        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie1));
//        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie2));
//        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie3));
//
//        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie1));
//        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie2));
//        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie3));
//
//        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie1));
//        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie2));
//        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie3));
//
//        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie1));
//        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie2));
//        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie3));
//
//        adapterStore = new AdapterStore(arrayListMovie, this);
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
//        rcvStore.setLayoutManager(gridLayoutManager);
//        rcvStore.setAdapter(adapterStore);

        // load the store fragment by default
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_shop:
                    toolbar.setTitle("Shop");
                    fragment = new StoreFragment();
                    break;
                case R.id.navigation_gifts:
                    toolbar.setTitle("My Gifts");
                    fragment = new GiftsFragment();
                    break;
                case R.id.navigation_cart:
                    toolbar.setTitle("Cart");
                    fragment = new CartFragment();
                    break;
                case R.id.navigation_profile:
                    toolbar.setTitle("Profile");
                    fragment = new ProfileFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container,fragment).commit();

            return true;
        }
    };

}