package com.suncode.moviecatalogue.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.suncode.moviecatalogue.Constant;
import com.suncode.moviecatalogue.R;
import com.suncode.moviecatalogue.adapter.MovieAdapter;
import com.suncode.moviecatalogue.api.ApiClient;
import com.suncode.moviecatalogue.api.ApiService;
import com.suncode.moviecatalogue.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMovie;
    ArrayList<Movie.ResultsBean> movies;
    private MovieAdapter movieAdapter;
    private ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMovie = findViewById(R.id.rv_movie);
        movies = new ArrayList<Movie.ResultsBean>();
        movieAdapter = new MovieAdapter(getApplicationContext(),movies);
        apiService = ApiClient.getRetrofit().create(ApiService.class);

        getData();
    }

    private void getData() {
        Call<Movie> call = apiService.getMovies(Constant.CATEGORY, Constant.API_KEY, Constant.LANGUAGE, Constant.PAGE);
        call.enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {
                Movie movie = response.body();
                if (response.body().getTotal_results() != 0) {
                    for (int i = 0; i < movie.getResults().size(); i++) {
                        List<Movie.ResultsBean> list = movie.getResults();
                        Movie.ResultsBean movieList = list.get(i);
                        movies.add(movieList);
                        rvMovie.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                        rvMovie.setAdapter(movieAdapter);
                    }
                }
            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}