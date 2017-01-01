/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import shop.Movie;

/**
 *
 * @author COMar-PC
 */
public class DataBaseDebug {
    private static ArrayList<Movie> arrayOfMovies;
    private static DataBaseDebug instance;
    
    public static DataBaseDebug getInstance() {
        if (instance == null) {
            instance = new DataBaseDebug();
        }
        
        return instance;
    }
    
    private DataBaseDebug() {
        this.arrayOfMovies = new ArrayList<>();
        
        Movie movie;
//        MOVIE 1 - Spice And Wolf
        String movieName = "Spice and Wolf";
        System.out.println(movieName);
        String movieDesc = "Spice and Wolf's story revolves around Kraft Lawrence,"
                + " a 25-year-old traveling merchant who peddles various goods"
                + " from town to town to make a living in a stylized historical"
                + " setting with European influences. One night when stopped at"
                + " the town of Pasloe, he finds in his wagon a Pagan wolf-deity"
                + " named Holo who is over 600 years old. She takes the form of"
                + " a 15-year-old girl, except for a wolf's tail and ears.";
        String movieShort = "Spice and Wolf's story revolves around Kraft Lawrence"
                + "and a Pagan wolf-deity named Holo.";
        String movieAuthor = "Ayakura";
        ArrayList<String> movieGenre = new ArrayList<>();
        movieGenre.clear();
        movieGenre.add("Fantazy");
        movieGenre.add("Gods");
        movieGenre.add("Wolfes");
        String movieType = "TV Series";
        Integer movieSeries = 12;
        String movieVoice = "Ancord";
        String movieURL = "spice_and_wolf";
        
        movie = new Movie(movieName, movieShort, movieDesc, movieAuthor,
                movieGenre, movieType, movieSeries, movieVoice, movieURL);
        arrayOfMovies.add(movie);
        
//        MOVIE 2 - Sword Art Online
        movieName = "Sword Art Online";
        System.out.println(movieName);
        movieDesc = "In 2022, a Virtual Reality Massively Multiplayer Online"
                + " Role-Playing Game (VRMMORPG) called Sword Art Online (SAO)"
                + " is released. With the NerveGear, a helmet that stimulates"
                + " the user's five senses via their brain, players can"
                + " experience and control their in-game characters with their" 
                + " minds.";
        movieShort = "Virtual Reality Massively Multiplayer Online Role-Playing"
                + "  Game (VRMMORPG) called Sword Art Online (SAO)";
        movieAuthor = "Ito Tohimoto";
        ArrayList<String> movieGenre1 = new ArrayList<>();
        movieGenre1.clear();
        movieGenre1.add("Fantazy");
        movieGenre1.add("Game");
        movieGenre1.add("Action");
        movieGenre1.add("Virtual real world");
        movieType = "TV Series\\Ova";
        movieSeries = 12;
        movieVoice = "Ancord";
        movieURL = "sword_art_online";
        
        movie = new Movie(movieName, movieShort, movieDesc, movieAuthor,
                movieGenre1, movieType, movieSeries, movieVoice, movieURL);
        arrayOfMovies.add(movie);
        
//        MOVIE 3 - Death Note
        movieName = "Death Note";
        System.out.println(movieName);
        movieDesc = "Light Yagami is a genius high school student who discovers"
                + " the Death Note, a notebook that kills anyone whose name is"
                + " written in it. After experimenting with the notebook,"
                + " Light meets the Shinigami Ryuk, the notebook's original"
                + " owner. Light eventually becomes known to the public as Kira.";
        movieShort = "Light Yagami is a genius high school student who discovers"
                + " the Death Note, a notebook that kills anyone whose name is"
                + " written in it.";
        movieAuthor = "Tsugumi Ohba";
        ArrayList<String> movieGenre2 = new ArrayList<>();
        movieGenre2.clear();
        movieGenre2.add("Detective");
        movieGenre2.add("Gods");
        movieGenre2.add("Mystic");
        movieType = "TV Series";
        movieSeries = 24;
        movieVoice = "Ancord, Trina";
        movieURL = "death_note";
        
        movie = new Movie(movieName, movieShort, movieDesc, movieAuthor,
                movieGenre2, movieType, movieSeries, movieVoice, movieURL);
        arrayOfMovies.add(movie);
    }

    public static ArrayList<Movie> getArrayOfMovies() {
        return arrayOfMovies;
    }
}
