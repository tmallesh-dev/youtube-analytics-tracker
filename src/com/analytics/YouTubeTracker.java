package com.analytics;

import java.util.ArrayList;
import java.util.List;

public class YouTubeTracker {
    private List<Channel> channels;
    
    public YouTubeTracker() {
        this.channels = new ArrayList<>();
    }
    
    public void addChannel(Channel channel) {
        channels.add(channel);
        System.out.println("Channel added: " + channel.getChannelName());
    }
    
    public void displayAllChannels() {
        System.out.println("\n=== YOUTUBE CHANNEL ANALYTICS ===\n");
        for (Channel channel : channels) {
            channel.displayInfo();
        }
    }
    
    public Channel findTopChannel() {
        Channel top = channels.get(0);
        for (Channel channel : channels) {
            if (channel.getSubscribers() > top.getSubscribers()) {
                top = channel;
            }
        }
        return top;
    }
    
    public long getTotalSubscribers() {
        long total = 0;
        for (Channel channel : channels) {
            total += channel.getSubscribers();
        }
        return total;
    }
}