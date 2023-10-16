package hello;

import org.joda.time.LocalTime;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HelloAlem {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}