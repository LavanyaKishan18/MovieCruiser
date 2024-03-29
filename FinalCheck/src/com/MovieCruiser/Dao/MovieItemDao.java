package com.MovieCruiser.Dao;

import java.util.List;

import com.MovieCruiser.model.MovieItem;


public interface MovieItemDao
{
	public List<MovieItem> getMovieItemListAdmin();
	public List<MovieItem> getMovieItemListCustomer();
	public void modifyMovieItem(MovieItem movie);
	public MovieItem getMovieItem(long movieItemId);

}
