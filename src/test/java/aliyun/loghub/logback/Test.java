package aliyun.loghub.logback;

/**
 * Created by hlw01 on 2016/9/28.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    public static void main (String[] args) {
        Logger LOGGER = LoggerFactory.getLogger(Test.class);
        LOGGER.info("Hello World");
		LOGGER.error("Exception Occurred", new RuntimeException("something error", new NullPointerException()));
    }
}
