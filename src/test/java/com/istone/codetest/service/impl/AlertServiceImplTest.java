package com.istone.codetest.service.impl;

import com.istone.codetest.BootStrap;
import com.istone.codetest.channel.DatabaseChannel;
import com.istone.codetest.channel.QueueChannel;
import com.istone.codetest.channel.SlackChannel;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

public class AlertServiceImplTest {

    AlertServiceImpl underTest;

    @Mock
    private BootStrap bootStrap;

    @Mock
    private DatabaseChannel databaseChannel;

    @Mock
    private QueueChannel queueChannel;

    @Mock
    private SlackChannel slackChannel;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        underTest = new AlertServiceImpl();
        underTest.setBootStrap(bootStrap);

        given(bootStrap.getDatabaseChannel()).willReturn(databaseChannel);
        given(bootStrap.getQueueeChannel()).willReturn(queueChannel);
        given(bootStrap.getSlackChannel()).willReturn(slackChannel);
    }

    @Test
    public void test() {
        given(queueChannel.getStatus()).willReturn("red");
        given(databaseChannel.getStatus()).willReturn("green");
        given(slackChannel.getStatus()).willReturn("yellow");

        String status = underTest.getStatus();

        assertEquals("green,red,yellow", status);
    }

    // TODO add more tests

}