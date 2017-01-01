/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.util.ArrayList;

/**
 *
 * @author COMar-PC
 */
public class Movie implements java.io.Serializable {
    private static int nextId = 0;
    
    private Integer movieId;
    private String movieName;
    private String movieDesc;
    private String movieShortDesc;
    private String movieAuthor;
    private ArrayList<String> movieGenre;
    private String movieType;
    private Integer movieSeries;
    private String movieVoice;
    private String movieURL;
    
    public Movie() {

    }
    
    public Movie(String movieName,
            String movieShort,
            String movieDesc,
            String movieAuthor,
            ArrayList<String> movieGenre,
            String movieType,
            Integer movieSeries,
            String movieVoice,
            String movieURL) {
        this.movieName = movieName;
        this.movieShortDesc = movieShort;
        this.movieDesc = movieDesc;
        this.movieAuthor = movieAuthor;
        this.movieGenre = movieGenre;
        this.movieType = movieType;
        this.movieSeries = movieSeries;
        this.movieVoice = movieVoice;
        this.movieURL = movieURL;
        
        this.movieId = createId();
    }

    private Integer createId() {
        nextId++;
        
        return nextId;
    }
    
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    public void setMovieShortDesc(String movieShortDesc) {
        this.movieShortDesc = movieShortDesc;
    }

    public void setMovieAuthor(String movieAuthor) {
        this.movieAuthor = movieAuthor;
    }

    public void setMovieGenre(ArrayList<String> movieGenre) {
        this.movieGenre = movieGenre;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public void setMovieSeries(Integer movieSeries) {
        this.movieSeries = movieSeries;
    }

    public void setMovieVoice(String movieVoice) {
        this.movieVoice = movieVoice;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public String getMovieShortDesc() {
        return movieShortDesc;
    }

    public String getMovieAuthor() {
        return movieAuthor;
    }

    public ArrayList<String> getMovieGenre() {
        return movieGenre;
    }

    public String getMovieType() {
        return movieType;
    }

    public Integer getMovieSeries() {
        return movieSeries;
    }

    public String getMovieVoice() {
        return movieVoice;
    }

    public String getMovieURL() {
        return movieURL;
    }

    public void setMovieURL(String movieURL) {
        this.movieURL = movieURL;
    }
}
