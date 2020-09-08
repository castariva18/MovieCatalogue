package com.suncode.moviecatalogue.view;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.suncode.moviecatalogue.Constant;
import com.suncode.moviecatalogue.R;
import com.suncode.moviecatalogue.api.ApiClient;
import com.suncode.moviecatalogue.api.ApiService;
import com.suncode.moviecatalogue.model.Genre;

import java.util.HashMap;

public class DetailActivity extends AppCompatActivity {
    private ImageView imgPoster;
    private TextView tvOverview, tvTitle, tvGenre;
    private ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgPoster = findViewById(R.id.img_detail);
        tvTitle = findViewById(R.id.title_detail);
        tvOverview = findViewById(R.id.desc_detail);
        tvGenre = findViewById(R.id.genre_detail);

        apiService = ApiClient.getRetrofit().create(ApiService.class);

        Intent intent = getIntent();
        String movie_title = intent.getStringExtra("TITLE");
//        String movie_title_ori = intent.getStringExtra("ORI_TITLE");
        String movie_poster = intent.getStringExtra("POSTER");
//        String movie_release = intent.getStringExtra("RELEASE");
        String movie_overview = intent.getStringExtra("OVERVIEW");
//        int movie_vote_count = intent.getIntExtra("VOTE_COUNT",0);
//        int movie_vote_avg = intent.getIntExtra("VOTE_AVG",0);
//        double popular = intent.getDoubleExtra("POPULAR",0);
        int[] genre_ids = intent.getIntArrayExtra("GENRE");
        Glide.with(this).load(Constant.IMAGE_REQUEST + movie_poster).diskCacheStrategy(DiskCacheStrategy.DATA).into(imgPoster);
        //  getGenre(genre_ids);
        tvOverview.setText(movie_overview);
        tvTitle.setText("Title: " + movie_title);
    }

//    private void getGenre(int[] genre_ids) {
//        Call<Genre> genreCall = apiService.getGenres(Constant.API_KEY, Constant.LANGUAGE);
//        genreCall.enqueue(new Callback<Genre>() {
//            @Override
//            public void onResponse(Call<Genre> call, Response<Genre> response) {
//                Genre data = response.body();
//
//                Genre.Genres[] genres = data.getGenres();
//
//                HashMap<Integer, String> map = new HashMap<>();
//
//                for (int i = 0; i < genres.length; i++) {
//                    map.put(genres[i].getId(), genres[i].getName());
//                }
//
//                for (int i = 0; i < genre_ids.length; i++) {
//                    String genreName = map.get(genre_ids[i]);
//                    tvGenre.setText("Genre: " + genreName);
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<Genre> call, Throwable t) {
//                t.getMessage();
//            }
//        });
//    }
}