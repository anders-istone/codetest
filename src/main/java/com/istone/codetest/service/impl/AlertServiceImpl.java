package com.istone.codetest.service.impl;

import com.istone.codetest.BootStrap;
import com.istone.codetest.channel.DatabaseChannel;
import com.istone.codetest.channel.QueueChannel;
import com.istone.codetest.channel.SlackChannel;
import com.istone.codetest.data.AlertData;
import com.istone.codetest.service.AlertService;

import javax.annotation.Resource;

public class AlertServiceImpl implements AlertService {

    @Resource
    BootStrap bootStrap;

    @Override
    public void sendAlert(AlertData alertData) {
        DatabaseChannel databaseChannel = bootStrap.getDatabaseChannel();
        QueueChannel queueChannel = bootStrap.getQueueeChannel();
        SlackChannel slackChannel = bootStrap.getSlackChannel();

        if (alertData.getChannel().equals("database")) {
            databaseChannel.send(alertData);
        } else if (alertData.getChannel().equals("queue")) {
            queueChannel.send(alertData);
        } else if (alertData.getChannel().equals("slack")) {
            slackChannel.send(alertData);
        } else {
            throw new RuntimeException("Unknown channel: " + alertData.getChannel());
        }
    }

    @Override
    public String getStatus() {
        DatabaseChannel databaseChannel = bootStrap.getDatabaseChannel();
        QueueChannel queueChannel = bootStrap.getQueueeChannel();
        SlackChannel slackChannel = bootStrap.getSlackChannel();

        return databaseChannel.getStatus() + "," + queueChannel.getStatus() + "," + slackChannel.getStatus();
    }

    public void setBootStrap(BootStrap bootStrap) {
        this.bootStrap = bootStrap;
    }
}
