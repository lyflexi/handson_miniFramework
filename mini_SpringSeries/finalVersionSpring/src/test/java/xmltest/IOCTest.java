package xmltest;


import org.lyflexi.framework.context.ClassPathXmlApplicationContext;
import org.lyflexi.frameworktest.service.AService;
import org.lyflexi.frameworktest.service.BaseService;
import org.lyflexi.frameworktest.service.BaseBaseService;

public class IOCTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//        SimpleService simpleService;
        AService aService;
        BaseService baseService;
        BaseBaseService basebaseService;
        try {
//            simpleService = (SimpleService) ctx.getBean("simpleservice");
//            simpleService.sayHello();

            aService = (AService) ctx.getBean("aservice");
            aService.sayHello();
            baseService = (BaseService) ctx.getBean("baseservice");
            baseService.sayHello();
            basebaseService = (BaseBaseService) ctx.getBean("basebaseservice");
            basebaseService.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
