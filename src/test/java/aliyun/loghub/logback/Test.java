package aliyun.loghub.logback;

/**
 * Created by hlw01 on 2016/9/28.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    public static void main (String[] args) {
        Logger LOGGER = LoggerFactory.getLogger(Test.class);
        LOGGER.info("182.48.117.2,RT,readLicZoneSize,123456@126.com,d98384df3f2246f7bf97ca0e2a2865f7,0700000000000098,2016-09-29 14:10:00,250");
    }
}
