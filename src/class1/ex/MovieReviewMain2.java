package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;


        MovieReview abouttime = new MovieReview();
        abouttime.title = "어바웃 타임";
        abouttime.review = "인생 시간 영화";
        reviews[1] = abouttime;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 라뷰: " + review.review);
        }
    }
}
