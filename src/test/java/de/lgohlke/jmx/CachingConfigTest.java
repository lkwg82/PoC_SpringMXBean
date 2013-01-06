package de.lgohlke.jmx;

import org.jminix.console.tool.StandaloneMiniConsole;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: lars
 */
public class CachingConfigTest {
//  private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CachingConfig.class);

  @Test
  public void test() throws InterruptedException {
    new StandaloneMiniConsole(8088);
    new AnnotationConfigApplicationContext(CachingConfig.class);
    Thread.sleep(100*1000);
  }
}
