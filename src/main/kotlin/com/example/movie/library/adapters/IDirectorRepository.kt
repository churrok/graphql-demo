package com.example.movie.library.adapters

import com.example.movie.library.entities.Director

interface IDirectorRepository {
    fun findAll(): List<Director>
    fun save(director: Director): Director
}