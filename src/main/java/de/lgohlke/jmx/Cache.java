package de.lgohlke.jmx;

import org.springframework.jmx.export.annotation.*;
import org.springframework.stereotype.Component;

/**
 * User: lars
 */
@Component
@ManagedResource(objectName = "mbeans:name=myJmxDemoBean", description = "s")
public class Cache {
  private String serverName2= "x";

  @ManagedAttribute
  public String getServerName2() {
    return serverName2;
  }

  private long sessionTimeout;
  private String serverName = "My Server";

  @ManagedAttribute
  public String getServerName() {
    return serverName;
  }

  @ManagedAttribute
  public long getSessionTimeout() {
    return sessionTimeout;
  }

  @ManagedAttribute(description = "Session timeout in Seconds")
  public void setSessionTimeout(long sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
  }

  public void aHiddenMethod() {
    System.out.println("I'm hidden");
  }

  @ManagedOperation(description = "Add two numbers")
  @ManagedOperationParameters({
      @ManagedOperationParameter(name = "x", description = "The first number"),
      @ManagedOperationParameter(name = "y", description = "The second number")})
  public int add(int x, int y) {
    return x + y;
  }

  @ManagedOperation
  public void reload() {
    System.out.println("reload configuration");
  }
}
