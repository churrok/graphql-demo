package com.example.movie.library.adapters

import com.example.movie.library.entities.Movie

interface IMovieRepository {
    fun save(movie: Movie): Movie
    fun findAll(): List<Movie>
}