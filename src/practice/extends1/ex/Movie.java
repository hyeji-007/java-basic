package practice.extends1.ex;

public class Movie {
    private String director;
    private String actor;

    public Movie (String director, String actor) {
        this.director = director;
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public String getActor() {
        return actor;
    }
}
