package com.MovieCruiser.Dao;

import java.util.List;

import com.MovieCruiser.model.MovieItem;


public interface FavouritesDao {
	 void addFavouritesItem(long userId,long menuItemId);
	 List<MovieItem> getAllFavouritesItem(long userId) throws FavouritesEmptyException;
	 void removeFavouritesItem(long userId,long menuItemId);

}
