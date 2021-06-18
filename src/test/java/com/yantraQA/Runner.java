package com.yantraQA;

import org.aeonbits.owner.ConfigFactory;

public class Runner {

    public static void main(String[] args){
        CoreConfig config = ConfigFactory.create(CoreConfig.class);

        System.out.println("Implicit wait time out: " + config.implicitWaitTimeOutInSec());
        System.out.println("Implicit wait time out: " + config.takeScreenShot());
        System.out.println("Implicit wait time out: " + config.closeBrowser());
    }

}
