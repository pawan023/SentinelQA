package com.sentinelqa.config;

import org.aeonbits.owner.Config;

@Config.Sources({
    "file:${user.dir}/src/main/resources/test.properties"
})
public interface FrameworkConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("headless")
    @DefaultValue("false")
    boolean headless();
}
