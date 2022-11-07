public class Movie {
    public static void main(String[] args) {
        enum MovieRating {A,B, E}
        MovieRating rating = MovieRating.E;

        switch (rating){
            case E:
                System.out.println("Excellent");
                break;
            case A:
                System.out.println("Good");
                break;
            case B:
                System.out.println("Skip it");
                break;
            default:
                System.out.println("Something went wrong");
        }

        for(MovieRating rating2: MovieRating.values()){
            System.out.println(rating2);
        }
    }
}
