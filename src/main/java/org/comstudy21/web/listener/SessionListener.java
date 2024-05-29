package org.comstudy21.web.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {

    public SessionListener() {
    	System.out.println("SessionListener 생성자");
    }

    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println(">>> 새로운 세션이 생성되었습니다.");
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println(">>> 세션이 소멸되었습니다.");
    }
}
