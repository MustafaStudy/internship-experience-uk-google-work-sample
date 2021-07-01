package com.google;
import javax.swing.*;
import java.io.*;

package tangible;
import java.util.*;
import java.util.Random;

public class VideoPlayer {


  private final VideoLibrary videoLibrary;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() {


    System.out.print("Here's a list of all available vidos:");
    System.out.print("\n");
    ArrayList <Video> videos;
    videos = (ArrayList<String>) VideoLibrary.getVideos();


    for (int i = 0; i < videos.size(); i++) {
      String title = videos.get(i).getTitle();
      String videoId = videos.get(i).getVideoId();
      ArrayList<String> tagsVector = (ArrayList<String>) videos.get(i).getTags();
      String tagsString = new String();
      for (int j = 0; j < tagsVector.size(); j++) {
        if (j == 0) {
          tagsString += tagsVector.get(j);
        } else {
          tagsString += " " + tagsVector.get(j);
        }
      }


      System.out.print(title);
      System.out.print("(");
      System.out.print(videoId);
      System.out.print(")");
      System.out.print(tagsString);
      System.out.print("\n");


    }
  }

  public void playVideo(String videoId) {

    //System.out.println("playVideo needs implementation");


    switch (casem)
    {
      case 0:
        playVideo("funny_dogs_video_id");
        break;
      case 1:
      case 2:
      case 3:
      case 4:
        playVideo();
        break;
    }

  }

  public void stopVideo() {
    //System.out.println("stopVideo needs implementation");
    if (currentVideo != null) {
      System.out.println("Stopping video: " + currentVideo.getTitle());
      currentVideo = null;
    }
    else {
      System.out.println("Cannot stop video: No video is currently playing");
    }
  }

  public void playRandomVideo() {

    for (Video video : videoLibrary.getVideos()){

      Random rand = new Random();
      int range = rand.nextInt(videoLibrary.getVideos().size());
      playVideo(videoLibrary.getVideos().get(rand.nextInt(range)).getVideoId());
      System.out.println(video.getTitle());
      break;
    }

    //int rnd = new Random().nextInt(videoLibrary.getVideos().size());
    //return videoLibrary.getVideos;
  }

  public void pauseVideo() {
    System.out.println("pauseVideo needs implementation");
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
    System.out.println("showPlaying needs implementation");
  }

  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}