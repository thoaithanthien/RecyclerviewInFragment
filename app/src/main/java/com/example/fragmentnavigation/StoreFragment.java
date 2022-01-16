package com.example.fragmentnavigation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;

public class StoreFragment extends Fragment {
    private RecyclerView rcvStore;
    private ArrayList<Movie> arrayListMovie;
    private AdapterStore adapterStore;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_store_fragment, container, false);

        rcvStore = view.findViewById(R.id.recyclerViewStore);

        arrayListMovie = new ArrayList<>();

        arrayListMovie.add(new Movie("Lacoda", "200.000đ", R.drawable.movie1));
        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie2));
        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie3));

        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie1));
        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie2));
        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie3));

        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie1));
        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie2));
        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie3));

        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie1));
        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie2));
        arrayListMovie.add(new Movie("Lacoda", "200.000.đ", R.drawable.movie3));
        adapterStore = new AdapterStore(arrayListMovie, getContext());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        rcvStore.setLayoutManager(gridLayoutManager);
        rcvStore.setAdapter(adapterStore);

        return view;

    }
}