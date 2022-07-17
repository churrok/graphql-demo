package com.example.movie.library.drivers.repositories

import com.example.movie.library.adapters.IMovieRepository
import com.example.movie.library.entities.Movie
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository: CrudRepository<Movie,Long>,IMovieRepository