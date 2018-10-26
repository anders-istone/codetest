package com.istone.codetest.channel;

import com.istone.codetest.data.AlertData;

public class QueueChannel {

    public QueueChannel(String queueName) {
        System.out.println("Created queue channel: " + queueName);
    }

    public void send(AlertData alertData) {
        System.out.println("QueueChannel:" + alertData.getType() + ": " + alertData.getMessage());
    }

    public String getStatus() {
        return "green";
    }
}
