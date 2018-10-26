package com.istone.codetest.channel;


import com.istone.codetest.data.AlertData;

public class SlackChannel {

    public SlackChannel(String slackKey, String slackChannel) {
        System.out.println("Created slack channel: " + slackKey + "/" + slackChannel);
    }

    public void send(AlertData alertData) {
        System.out.println("SlackChannel:" + alertData.getType() + ": " + alertData.getMessage());
    }

    public String getStatus() {
        return "yellow";
    }
}
