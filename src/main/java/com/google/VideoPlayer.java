package com.google;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;
  private Video playingVideo;
  private boolean paused = false;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  private String videoDetail(Video video) {
    return String.format("%s (%s) [%s]",
            video.getTitle(),
            video.getVideoId(),
            video.getTags().stream().reduce(
                    (t, s) -> t + " " + s
            ).orElse(""))
            + (flags.containsKey(video.getVideoId())
            ? (" - FLAGGED (reason: " + flags.get(video.getVideoId()) + ")") : "");
  }

  public void showAllVideos() {
    System.out.println("Here's a list of all available videos:");
    List<Video> videos = videoLibrary.getVideos();
    videos.sort(Comparator.comparing(Video::getTitle));
    for (Video video : videos) {
      System.out.println(videoDetail(video));
    }
  }

  private void stopVideoIfPlaying() {
    if (playingVideo != null) {
      System.out.printf("Stopping video: %s%n", playingVideo.getTitle());
    }
    playingVideo = null;
  }

  private void playNewVideo(Video video) {
    //assert video != null;
    //String videoId = video.getVideoId();
    //if (flags.containsKey(videoId)) {
      //System.out.printf("Cannot play video: Video is currently flagged (reason: %s)%n",
              //flags.get(videoId));
      //return;
    //}
    //System.out.printf("Playing video: %s%n", video.getTitle());
    //playingVideo = video;
    //paused = false;
  }

  public void playVideo(String videoId) {
    Video video = videoLibrary.getVideo(videoId);
    if (video != null) {
      stopVideoIfPlaying();
      playNewVideo(video);
    } else {
      System.out.println("Cannot play video: Video does not exist");
    }
  }

  public void stopVideo() {
    if (playingVideo != null) {
      System.out.printf("Stopping video: %s%n", playingVideo.getTitle());
      playingVideo = null;
    } else {
      System.out.println("Cannot stop video: No video is currently playing");
    }
  }

  Random generator = new Random();

  public void playRandomVideo() {
    stopVideoIfPlaying();
    List<Video> videos = videoLibrary.getVideos().stream()
            .filter(x -> !flags.containsKey(x.getVideoId())).collect(Collectors.toList());
    if (videos.isEmpty()) {
      System.out.println("No videos available");
      return;
    }
    int index = generator.nextInt(videos.size());
    playNewVideo(videos.get(index));
  }

  public void pauseVideo() {

  }

  public void continueVideo() {

  }

  public void showPlaying() {

  }


  Map<String, VideoPlaylist> playListMap = new HashMap<>();

  public void createPlaylist(String playlistName) {

  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
  }

  public void showAllPlaylists() {

  }

  public void showPlaylist(String playlistName) {

  }

  public void removeFromPlaylist(String playlistName, String videoId) {

  }

  public void clearPlaylist(String playlistName) {

  }

  public void deletePlaylist(String playlistName) {

  }

  private void searchVideosBy(Predicate<Video> function, String searchString) {

  }

  public void searchVideos(String searchTerm) {


  public void searchVideosWithTag(String videoTag) {




  public void flagVideo(String videoId, String reason) {

  }

  public void allowVideo(String videoId) {

}
