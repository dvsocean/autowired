package com.autowired.autowired.initializers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Forwarder {

    public String forwardDataToController(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
        BeanPath bp = (BeanPath) ctx.getBean("beanPath");
        return bp.produceRelevantNames();
    }
}
