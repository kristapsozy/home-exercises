package io.codelex.classesandobjects.practice.videostore;

import java.util.Objects;

public class Video {
    String title;
    boolean isCheckedOut;
    double averageUserRating;

    int totalRatingCount;
    double totalRating;

    public Video(String title) {
        isCheckedOut = false;
        this.title = title;
    }

    public void beeingCheckedOut() {
        isCheckedOut = true;
    }

    public void getRating(double rating) {
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

    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", averageUserRating=" + averageUserRating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return isCheckedOut == video.isCheckedOut && Double.compare(video.averageUserRating, averageUserRating) == 0 && totalRatingCount == video.totalRatingCount && Double.compare(video.totalRating, totalRating) == 0 && title.equals(video.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, isCheckedOut, averageUserRating, totalRatingCount, totalRating);
    }
}
