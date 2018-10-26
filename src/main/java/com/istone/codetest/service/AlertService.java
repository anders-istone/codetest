package com.istone.codetest.service;

import com.istone.codetest.data.AlertData;

public interface AlertService {

    /**
     * Sends an alert.
     *
     * @param alertData
     */
    void sendAlert(AlertData alertData);

    /**
     * Returns the operating status of the different output channels and indicates this by returning 'green', 'yellow' or 'red'.
     *
     * @return a comma-separated string of the status for all channels: DatabaseChannel, QueueChannel, SlackChannel
     */
    String getStatus();

}
