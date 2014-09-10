package pl.mjedynak.rmi.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import pl.mjedynak.rmi.api.TimeService;

@Configuration
public class AppClientConfig {

    @Bean
    public RmiProxyFactoryBean rmiProxyFactoryBean() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceInterface(TimeService.class);
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1099/timeService");
        return rmiProxyFactoryBean;
    }
}
