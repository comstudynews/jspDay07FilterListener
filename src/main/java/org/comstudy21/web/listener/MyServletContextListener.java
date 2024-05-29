package org.comstudy21.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {

    public MyServletContextListener() {
        System.out.println(">>> MyServletContextListener 생성자");
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println(">>> contextDestroyed 소멸");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println(">>> contextInitialized 초기화");
    }
}
