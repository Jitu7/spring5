package beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component // cant create multiple instance of the class using @Component
public class MyBean {

    private String text;

    public MyBean() {
        System.out.println("MyBean Object created ***");
    }

    /**
     * @PostConstruct managed by spring
     * if the instance is available in Spring Context
     * then only it is called
     */
    @PostConstruct
    private void init() {
        System.out.println("PostConstruct() ***");
        this.text = "HELLO!!";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
