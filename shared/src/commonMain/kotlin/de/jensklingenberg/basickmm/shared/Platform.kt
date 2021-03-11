package de.jensklingenberg.basickmm.shared

expect class Platform() {
    val platform: String
}



data class Movie(val title: String, val year: Int, val image: String)
