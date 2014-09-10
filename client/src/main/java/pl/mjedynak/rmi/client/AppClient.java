package pl.mjedynak.rmi.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.mjedynak.rmi.api.TimeService;

public class AppClient {

    private static Logger logger = LoggerFactory.getLogger(AppClient.class);

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppClientConfig.class);
        TimeService timeService = context.getBean(TimeService.class);
        logger.debug(timeService.getCurrentTime().toString());
    }
}
