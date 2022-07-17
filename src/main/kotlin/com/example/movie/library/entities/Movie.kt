package com.example.movie.library.entities

import javax.persistence.*

@Entity
@Table(name = "movies")
data class Movie (
    @Id
    @GeneratedValue
    val id: String? = null,
    val title: String,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "director_id")
    val director: Director? = null
    )