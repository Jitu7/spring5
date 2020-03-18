package main;

import beans.MyBean;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    /**
     * XML
     * Annotations
     */
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

//            by type (incase of this we have to use @Primary)
            var bean1 = context.getBean(MyBean.class);
            var bean2 = context.getBean(MyBean.class);
            var bean3 = context.getBean(MyBean.class);

//            by name
/*
            var bean1 = context.getBean("myBean1", MyBean.class);
            var bean2 = context.getBean("myBean2", MyBean.class);
            var bean3 = context.getBean("myBean1", MyBean.class);
*/



            System.out.println(bean1.getText());
            System.out.println(bean2.getText());
            System.out.println(bean3.getText());

        }

//        PostConstruct will not be called
/*
        var bean = new MyBean();
        System.out.println(bean.getText()); // null
*/

    }
}
