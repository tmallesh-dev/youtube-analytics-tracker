package com.analytics;

public class Channel {
    private String channelName;
    private long subscribers;
    private long totalViews;
    private int videoCount;
    
    public Channel(String channelName, long subscribers, long totalViews, int videoCount) {
        this.channelName = channelName;
        this.subscribers = subscribers;
        this.totalViews = totalViews;
        this.videoCount = videoCount;
    }
    
    public void displayInfo() {
        System.out.println("Channel: " + channelName);
        System.out.println("Subscribers: " + subscribers);
        System.out.println("Total Views: " + totalViews);
        System.out.println("Videos: " + videoCount);
        System.out.println("-------------------");
    }
    
    // Getters
    public String getChannelName() { return channelName; }
    public long getSubscribers() { return subscribers; }
    public long getTotalViews() { return totalViews; }
    public int getVideoCount() { return videoCount; }
}