package de.lgohlke.jmx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * User: lars
 */
@Configuration
// workaround for Spring <3.2
@ImportResource("classpath:mbeans.xml")
// since Spring >= 3.2
//@EnableMBeanExport
public class CachingConfig {

  @Bean
  public Cache c() {
    return new Cache();
  }
}
