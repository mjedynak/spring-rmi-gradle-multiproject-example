package pl.mjedynak.rmi.server;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppServer {

    public static void main(String[] args) throws InterruptedException {
        new AnnotationConfigApplicationContext(AppServerConfig.class);
    }
}
