package mars.hatton.jsf;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;
import jakarta.faces.bean.ManagedProperty;

@ManagedBean(name = "helloJSF", eager = true)
@RequestScoped
public class HelloJSF {

    @ManagedProperty(value = "#{messageBean}")
    private MessageBean messageBean;

    private String message;

    public HelloJSF() {
        System.out.println("HelloJSF started!");
    }

    public String getMessage() {
        if (messageBean != null) {
            message = messageBean.getMessage();
        }
        return message;
    }

    public void setMessageBean(MessageBean message) {
        this.messageBean = message;
    }
}
