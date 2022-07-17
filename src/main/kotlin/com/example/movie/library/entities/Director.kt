package com.example.movie.library.entities

import javax.persistence.*

@Entity
@Table(name = "directors")
data class Director (
    @Id
    @GeneratedValue
    val id:  Long? = null,
    val name: String,
    val lastName: String,
    @OneToMany(mappedBy = "director", cascade = [CascadeType.ALL])
    val movies: List<Movie> = emptyList()
)
