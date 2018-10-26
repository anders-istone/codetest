package com.istone.codetest;


import com.istone.codetest.channel.DatabaseChannel;
import com.istone.codetest.channel.QueueChannel;
import com.istone.codetest.channel.SlackChannel;

public class BootStrap {
    private String dbUser;
    private String dbPassword;
    private String queueName;
    private String slackKey;
    private String channel;

    private SlackChannel slackChannel;
    private DatabaseChannel databaseChannel;
    private QueueChannel queueChannel;

    public BootStrap() {
        databaseChannel = new DatabaseChannel(getDbUser(), getDbPassword());
        queueChannel = new QueueChannel(getQueueName());
        slackChannel = new SlackChannel(getSlackKey(), getChannel());
    }

    public SlackChannel getSlackChannel() {
        return slackChannel;
    }

    public DatabaseChannel getDatabaseChannel() {
        return databaseChannel;
    }

    public QueueChannel getQueueeChannel() {
        return queueChannel;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getSlackKey() {
        return slackKey;
    }

    public void setSlackKey(String slackKey) {
        this.slackKey = slackKey;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

}
