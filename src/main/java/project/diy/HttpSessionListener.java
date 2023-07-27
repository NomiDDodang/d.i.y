package project.diy;


import jakarta.servlet.http.HttpSessionEvent;
import org.springframework.context.event.EventListener;

public interface HttpSessionListener extends EventListener{

    public void sessionCreate(HttpSessionEvent sessionEvent);

    public void sessionDestroyed(HttpSessionEvent sessionEvent);
}
