package com.analytics;

public class Main {
    public static void main(String[] args) {
        YouTubeTracker tracker = new YouTubeTracker();
        
        // Add your actual channels (update with real numbers)
        Channel malleshMally = new Channel("Mallesh Mally", 1440, 500000, 85);
        Channel bhaktiDevs = new Channel("Bhakti Devs", 347, 50000, 60);
        
        tracker.addChannel(malleshMally);
        tracker.addChannel(bhaktiDevs);
        
        // Display all channels
        tracker.displayAllChannels();
        
        // Find top channel
        Channel top = tracker.findTopChannel();
        System.out.println("🏆 TOP CHANNEL: " + top.getChannelName() + 
                          " with " + top.getSubscribers() + " subscribers");
        
        // Total subscribers
        System.out.println("\n📊 TOTAL SUBSCRIBERS: " + tracker.getTotalSubscribers());
    }
}