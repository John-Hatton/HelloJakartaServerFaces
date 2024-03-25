package mars.hatton.jsf;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;

@ManagedBean(name = "messageBean", eager = true)
@RequestScoped
public class MessageBean {
    private String message = "Hello, Jakarta Server Faces!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}