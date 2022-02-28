package com.example.likeinthemovies.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.likeinthemovies.R;
import com.example.likeinthemovies.model.Film;

import java.util.List;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.FilmViewHolder> {

    Context context;
    List<Film>  categories;

    public FilmAdapter(Context context, List<Film> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public FilmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View categoryItems = LayoutInflater.from(context).inflate(R.layout.category_item, parent, false);
        return new FilmViewHolder(categoryItems);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmViewHolder holder, int position) {
        holder.categoryTitle.setText(categories.get(position).getTitle());
        holder.years.setText(categories.get(position).getYears());
        holder.imageView.setImageResource(R.drawable.poster);
     }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static final class FilmViewHolder extends RecyclerView.ViewHolder{

        TextView categoryTitle;
        TextView years;
        ImageView imageView;

        public FilmViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryTitle = itemView.findViewById(R.id.textView);
            years = itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.imageView2);

        }
    }
}
