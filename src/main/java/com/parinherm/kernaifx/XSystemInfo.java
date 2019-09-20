package com.parinherm.kernaifx;

@SuppressWarnings("all")
public class XSystemInfo {
  public static String javaVersion() {
    return System.getProperty("java.version");
  }
  
  public static String javafxVersion() {
    return System.getProperty("javafx.version");
  }
}
