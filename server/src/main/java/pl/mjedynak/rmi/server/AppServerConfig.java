package pl.mjedynak.rmi.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import pl.mjedynak.rmi.api.TimeService;
import pl.mjedynak.rmi.api.TimeServiceImpl;

@Configuration
public class AppServerConfig {

    @Bean
    public RmiServiceExporter rmiServiceExporter() {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("timeService");
        rmiServiceExporter.setService(timeService());
        rmiServiceExporter.setServiceInterface(TimeService.class);
        return rmiServiceExporter;
    }

    @Bean
    public TimeService timeService() {
        return new TimeServiceImpl();
    }
}
