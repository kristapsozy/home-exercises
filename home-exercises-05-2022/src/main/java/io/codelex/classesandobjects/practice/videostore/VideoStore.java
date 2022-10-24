package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Video> videos = new ArrayList<>();
    private ArrayList<Video> rentedVideos = new ArrayList<>();

    public void addVideo(String movieName) {
        this.videos.add(new Video(movieName));
    }

    public void checkOutVideo(Video video) {
        videos.remove(video);
        rentedVideos.add(video);
    }

    public void returnCheckedOutVideo(Video video) {
        rentedVideos.remove(video);
        videos.add(video);
    }

    public ArrayList<Video> getVideos() {
        return this.videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }

    public void takeUserRating(Video video, int rating) {
        video.getRating(rating);

    }

    public int searchVideoByTitle(String title) {
        for (Video video : videos) {
            if (video.getTitle().equals(title)) {
                return videos.indexOf(video);
            }
        }
        return 0;
    }

    public ArrayList<Video> getRentedVideos() {
        return rentedVideos;
    }
}