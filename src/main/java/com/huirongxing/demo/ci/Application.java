package com.huirongxing.demo.ci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Simple class to start up the application.
 *
 * @SpringBootApplication    adds:
 * @Configuration            DOCUMENT ME!
 * @EnableAutoConfiguration  DOCUMENT ME!
 * @ComponentScan            DOCUMENT ME!
 * @author                   <a href="mailto:wings.wang@hrx.ai">Wings Wang</a>
 * @version                  $Revision$, 03/09/2018
 */
@SpringBootApplication
public class Application {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  args  DOCUMENT ME!
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
