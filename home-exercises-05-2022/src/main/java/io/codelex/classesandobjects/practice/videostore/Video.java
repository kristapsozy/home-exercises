package io.codelex.classesandobjects.practice.videostore;

public class Video {
    String title;
    static boolean isCheckedOut;
    static double averageUserRating;

    static int totalRatingCount;
    static double totalRating;

    public Video(String title) {
        this.title = title;
    }

    public static void beeingCheckedOut() {
        isCheckedOut = true;
    }

    public static void getRating(double rating) {
        totalRatingCount++;
        totalRating += rating;
        averageUserRating = totalRating / totalRatingCount;
    }

    public void returnVideo() {
        isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public double getAverageUserRating() {
        return averageUserRating;
    }

    public void setAverageUserRating(double averageUserRating) {
        this.averageUserRating = averageUserRating;
    }

    public int getTotalRatingCount() {
        return totalRatingCount;
    }

    public void setTotalRatingCount(int totalRatingCount) {
        this.totalRatingCount = totalRatingCount;
    }

    public double getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(double totalRating) {
        this.totalRating = totalRating;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                '}';
    }
}
