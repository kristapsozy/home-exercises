package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {
    ArrayList<Video> videos = new ArrayList<>(10);
    int videoCount;

    public VideoStore() {
        //this.videos = new ArrayList<>();
        //  videos.add(new Video(""));
        //  videos.add(new Video(""));
        //  videos.add(new Video(""));
        //  videos.add(new Video(""));
        //  videos.add(new Video(""));
    }

    public void addVideo(String movieName) {
        this.videoCount++;
        this.videos.add(new Video(movieName));
    }

    public void checkOutVideo(Video video) {
        videoCount--;
        videos.remove(video.title);
    }

    public void returnCheckedOutVideo(Video video) {
        videoCount++;
    }

    public ArrayList<Video> getVideos() {
        return this.videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }

    public int getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(int videoCount) {
        this.videoCount = videoCount;
    }

    public static void takeUserRating(int rating) {


    }

}