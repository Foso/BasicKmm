package de.jensklingenberg.basickmm.shared


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    fun getnicCageMovies(): List<Movie> = listOf(
        Movie("Raising Arizona", 1987, "raising_arizona.jpg"),
        Movie("Vampire's Kiss", 1988, "vampires_kiss.png"),
        Movie("Con Air", 1997, "con_air.jpg"),
        Movie("Face/Off", 1997, "face_off.jpg"),
        Movie("National Treasure", 2004, "national_treasure.jpg"),
        Movie("The Wicker Man", 2006, "wicker_man.jpg"),
        Movie("Bad Lieutenant", 2009, "bad_lieutenant.jpg"),
        Movie("Kick-Ass", 2010, "kickass.jpg")
    )
}
