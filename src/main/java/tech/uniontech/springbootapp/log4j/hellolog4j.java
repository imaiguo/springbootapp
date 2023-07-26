package tech.uniontech.springbootapp.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class hellolog4j {
    public void printLog(){
        Logger logger = LoggerFactory.getLogger("R");
        logger.trace("--trace level");
        logger.debug("--debug level");
        logger.info("--info level");
        logger.warn("--warn level");
        logger.error("--error level");
    }    
}
