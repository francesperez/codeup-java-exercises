package movies;
import util.Input;

public class MoviesApplication {

    //creating a method to stop coping and pasting code within switch statements
    public static void getAllMovieFromCategory(String category, Movie[] movies){
        for (Movie movieList : movies) {
            String name = movieList.getName();
            if (category.equalsIgnoreCase(movieList.getCategory())){
                System.out.printf("%s -- %s%n", name, category);
            }
        }
    }

    public static Movie[] addMovie(Movie newMovie, Movie[] movies){
        Movie[] newMovieArray;
        newMovieArray = new Movie[movies.length + 1]; //matches the original array but adds an extra null position at
        // the end
        for (int i = 0; i < movies.length; i++){
            newMovieArray[i] = movies[1];
        }
        newMovieArray[newMovieArray.length - 1] = newMovie;
        return newMovieArray;
    }

    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();
        String userChoice = "yes";
        while (!userChoice.equals("0")) {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view animated movies");
            System.out.println("3 - view drama movies");
            System.out.println("4 - view horror movies");
            System.out.println("5 - view sci-fi movies");
            System.out.println("6 - add a movie to the list");

            userChoice = input.getString("Enter your choice:");

            switch (userChoice){
                case "0":
                    break;
                case "1":
                    for (Movie movieList : movies) //the last part of this is the movies array we initiated earlier on
                        // line 7.
                    {
                        String name = movieList.getName();
                        String category = movieList.getCategory();
                        System.out.printf("%s -- %s%n", name, category);
                    }
                    break;
                case "2":
                    for (Movie movieList : movies) {
                        String category = movieList.getCategory();
                        String name = movieList.getName();
                        if (category.equalsIgnoreCase("animated")){
                            System.out.printf("%s -- %s%n", name, category);
                        }
                    }
                    break;
                case "3":
                    for (Movie movieList : movies) {
                        String category = movieList.getCategory();
                        String name = movieList.getName();
                        if (category.equalsIgnoreCase("drama")){
                            System.out.printf("%s -- %s%n", name, category);
                        }
                    }
                    break;
                case "4":
                    getAllMovieFromCategory("horror", movies);
                    break;
                case "5":
                    getAllMovieFromCategory("scifi", movies);
                    break;
                case "6":
                    String title = input.getString("Enter the name of the movie you want to add:");
                    String category = input.getString("Enter the name of the catgegory of the movie you just entered:");
                    Movie newMovie = new Movie(title, category);
                    movies = addMovie(newMovie, movies);

                    break;
                default:
                    System.out.println("YOU LITERALLY DID NOT TYPE IN A NUMBER, IDIOT.");//default means it didn't match
                    // any of
                    // the switches so run this
                    break;


            }

        }


    }
}
