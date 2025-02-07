package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import step_1.application.Step1Service;

@Configuration
@EnableWebMvc
@ComponentScan
public class BeanConfiguration {

    @Bean
    public Step1Service Step1Service() {
        return Step1Service();
    }

}
