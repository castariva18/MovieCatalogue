package com.suncode.moviecatalogue.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.suncode.moviecatalogue.Constant;
import com.suncode.moviecatalogue.R;
import com.suncode.moviecatalogue.model.Movie;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private Context context;
    private List<Movie.ResultsBean> mData;

    public MovieAdapter(Context context, List<Movie.ResultsBean> mData) {
        this.context = context;
        this.mData = mData;

    }

    @NonNull
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ViewHolder holder, int position) {
        holder.title.setText(mData.get(position).getTitle());
        holder.overview.setText(mData.get(position).getOverview());
        String image = mData.get(position).getBackdrop_path();
        Glide.with(context).load(Constant.IMAGE_REQUEST + image).diskCacheStrategy(DiskCacheStrategy.DATA).into(holder.img);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title, overview;
        private ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_title);
            overview = itemView.findViewById(R.id.tv_desc);
            img = itemView.findViewById(R.id.img_poster);
        }
    }
}
