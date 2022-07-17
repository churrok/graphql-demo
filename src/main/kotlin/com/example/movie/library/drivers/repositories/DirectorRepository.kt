package com.example.movie.library.drivers.repositories

import com.example.movie.library.adapters.IDirectorRepository
import com.example.movie.library.entities.Director
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DirectorRepository: CrudRepository<Director,Long>,IDirectorRepository