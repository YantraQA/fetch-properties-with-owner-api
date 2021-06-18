package com.yantraQA;

import org.aeonbits.owner.Config;

@Config.HotReload
public interface CoreConfig extends Config {

    @Key("browser.implicit.wait") @DefaultValue("20")
    int implicitWaitTimeOutInSec();

    @Key("browser.screenshot") @DefaultValue("Failure")
    String takeScreenShot();

    @Key("browser.close") @DefaultValue("true")
    boolean closeBrowser();


}
