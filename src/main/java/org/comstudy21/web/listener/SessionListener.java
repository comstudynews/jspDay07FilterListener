package org.comstudy21.web.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class SessionListener implements HttpSessionListener {
	private static int activeSessions = 0;

    public SessionListener() {
    	System.out.println("SessionListener 생성자");
    }

    public void sessionCreated(HttpSessionEvent se)  {
    	activeSessions++;
    	System.out.println(">>> 새로운 세션이 생성되었습니다.");
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	activeSessions--;
    	System.out.println(">>> 세션이 소멸되었습니다.");
    }
    
    public static int getActiveSessions() {
        return activeSessions;
    }
}
