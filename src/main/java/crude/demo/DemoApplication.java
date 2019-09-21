package crude.demo;

import crude.demo.dubbo.ConsumerDubboDemo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})

public class DemoApplication {




    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

//        ConsumerDubboDemo consumerDubboDemo = new ConsumerDubboDemo();
//        consumerDubboDemo.sayHello("success");
//        consumerDubboDemo.queryStock("1");


    }





}
