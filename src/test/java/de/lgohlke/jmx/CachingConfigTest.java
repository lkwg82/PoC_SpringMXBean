package de.lgohlke.jmx;

import org.jminix.console.tool.StandaloneMiniConsole;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User: lars
 */
public class CachingConfigTest {

  @Test
  public void test() throws InterruptedException {
    new StandaloneMiniConsole(8088); // start jmx-restlet browser
    new AnnotationConfigApplicationContext(CachingConfig.class);
    Thread.sleep(100*1000);
  }
}
