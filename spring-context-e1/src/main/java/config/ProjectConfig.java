package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "beans")
public class ProjectConfig {

/*
//    @Primary
    @Bean
    public MyBean myBean1() {
        var myBean = new MyBean();
        myBean.setText("Hello !!");
        return myBean;
    }

    @Bean(value = "B")
    public MyBean myBean2() {
        var myBean = new MyBean();
        myBean.setText("World !!");
        return myBean;
    }
*/

}
