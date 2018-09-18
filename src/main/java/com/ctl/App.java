package com.ctl;

import com.google.pubsub.v1.ProjectSubscriptionName;

import org.slf4j.*;
/**
 * Hello world!
 *
 */
public class App 
{
    final static Logger logger = LoggerFactory.getLogger(App.class);
    final static String PROJECT = "simple01-216520";
    final static String SUBSCRIPTION = "forwork-test";


    public void readMessage() {
        ProjectSubscriptionName subscriptionName =
                ProjectSubscriptionName.of(PROJECT, SUBSCRIPTION);
        )
    }
    public static void main( String[] args )
    {
        logger.info("hi");
        System.out.println( "Hello World!" );
    }
}
