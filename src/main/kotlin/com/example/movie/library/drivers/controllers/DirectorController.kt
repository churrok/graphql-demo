package com.example.movie.library.drivers.controllers

import com.example.movie.library.adapters.IDirectorRepository
import com.example.movie.library.adapters.IMovieRepository
import com.example.movie.library.drivers.repositories.DirectorRepository
import com.example.movie.library.drivers.repositories.MovieRepository
import com.example.movie.library.entities.Director
import com.example.movie.library.entities.Movie
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class DirectorController(
    private val directorRepository: IDirectorRepository,
    private val movieRepository: IMovieRepository
) {

    @QueryMapping
    fun directors(): List<Director>{
        return directorRepository.findAll()
    }
    @QueryMapping
    fun movies(): List<Movie>{
        return movieRepository.findAll()
    }
    @MutationMapping
    fun addDirector(@Argument director: DirectorInput): Director{
        val d = Director(name = director.name, lastName = director.lastName)
        return directorRepository.save(d)
    }
    @MutationMapping
    fun addMovie(@Argument movie: Movie): Movie{
        return movieRepository.save(movie)
    }
}

data class DirectorInput(
    val name: String,
    val lastName: String
)