package com.istone.codetest.channel;


import com.istone.codetest.data.AlertData;

public class DatabaseChannel {

    private String username;

    public DatabaseChannel(String username, String password)
    {
        this.username = username;
        System.out.println("Created database channel: " + username + "/" + password);
    }

    public void send(AlertData alertData) {
        System.out.println("DatabaseChannel:" + alertData.getType() + ": " + alertData.getMessage());
    }

    public String getStatus() {
        return "green";
    }
}
