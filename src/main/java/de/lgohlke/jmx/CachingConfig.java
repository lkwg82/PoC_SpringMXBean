package de.lgohlke.jmx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;

/**
 * User: lars
 */
@ComponentScan(basePackages = "de.lgohlke.jmx")
@Configuration
@EnableMBeanExport
public class CachingConfig {

           @Bean
           public String x(){
             return           "";
           }
}
