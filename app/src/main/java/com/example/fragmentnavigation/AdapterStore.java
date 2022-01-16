package com.example.fragmentnavigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterStore extends RecyclerView.Adapter<AdapterStore.StoreViewHolder>{
    private ArrayList<Movie> arrayListMovie;
    private Context context;

    public AdapterStore(ArrayList<Movie> arrayListMovie, Context context) {
        this.arrayListMovie = arrayListMovie;
        this.context = context;
    }

    @NonNull
    @Override
    public StoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.store_item_row, parent, false);
        return new StoreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoreViewHolder holder, int position) {
        holder.tvName.setText(arrayListMovie.get(position).getTitle());
        holder.tvPrice.setText(arrayListMovie.get(position).getPrice());
        holder.imgMovie.setImageResource(arrayListMovie.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        if (arrayListMovie != null) {
            return  arrayListMovie.size();
        }
        return 0;
    }

    public class StoreViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName, tvPrice;
        private ImageView imgMovie;
        public StoreViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tv_name);
            tvPrice = itemView.findViewById(R.id.tv_price);
            imgMovie = itemView.findViewById(R.id.img_movie);
        }
    }
}
