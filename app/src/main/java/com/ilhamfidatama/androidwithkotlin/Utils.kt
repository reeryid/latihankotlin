package com.ilhamfidatama.androidwithkotlin

object Utils {
    const val EXTRA_USERNAME = "username"

    val movies: MutableList<Movie> = mutableListOf(
        Movie(name = "The Ragnarok", popularity = 135.055, imagePath = "https://image.tmdb.org/t/p/w500/rzRwTcFvttcN1ZpX2xv4j3tSdJu.jpg"),
        Movie(name = "Spider-Man: Homecoming", popularity = 140.322, imagePath = "https://image.tmdb.org/t/p/w500/c24sv2weTHPsmDa7jEMN0m2P3RT.jpg"),
        Movie(name = "Logan", popularity = 82.796, imagePath = "https://image.tmdb.org/t/p/w500/fnbjcRDYn6YviCcePDnGdyAkYsB.jpg"),
        Movie(name = "Doctor Strange", popularity = 118.368, imagePath = "https://image.tmdb.org/t/p/w500/xf8PbyQcR5ucXErmZNzdKR0s8ya.jpg"),
        Movie(name = "Deadpool", popularity = 93.844, imagePath = "https://image.tmdb.org/t/p/w500/8peYuPeLawgCFhuI4IcDjdrAAXw.jpg")
    )
}