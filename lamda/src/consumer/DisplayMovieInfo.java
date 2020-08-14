package consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie {

	String movieName;
	String director;

	public Movie(String movieName, String director) {
		this.movieName = movieName;
		this.director = director;
	}

	public Movie() {
	}

	public String getMovieName() {
		return movieName;
	}

	public String getDirector() {
		return director;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setDirector(String director) {
		this.director = director;
	}
}

public class DisplayMovieInfo {
	public static void main(String[] args) {
		ArrayList<Movie> al = new ArrayList<>();
		DisplayMovieInfo dmi = new DisplayMovieInfo();
		dmi.populate(al);
		// System.out.println(al.get(0).getMovieName());
		Consumer<Movie> cons = (mov) -> System.out
				.println("Movie Name: " + mov.getMovieName() + "  Movie Director: " + mov.getDirector());
		for (Movie m : al) {
			cons.accept(m);
		}
		// Pass By Reference Example
		Movie m = new Movie();
		System.out.println("Movie Name: " + m.getMovieName() + " Movie Director: " + m.getDirector());
	}
	public void populate(ArrayList<Movie> al) {
		Movie m1 = new Movie("Pardesh", "Akii");
		Movie m2 = new Movie("TTP", "Gaurav");
		al.add(m1);
		al.add(m2);
	}
}