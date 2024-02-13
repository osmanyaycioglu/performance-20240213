package training.performnace.strings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogRun {
    private static final Logger logger = LoggerFactory.getLogger(LogRun.class);

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            method("osman" +  i);
        }
    }

    public static void method(String xyz) {
        // 1. seçim
        if (logger.isDebugEnabled()){
            logger.debug("[LogRun][method]-> Method başladı :" + xyz);
        }
        // 2. seçim
        logger.debug("Method başladı : {} " , xyz);
        // 3. seçim
        logger.debug("Method başladı : " + xyz);
        // ....
        logger.debug("Method bitti : " + xyz);
    }

}
