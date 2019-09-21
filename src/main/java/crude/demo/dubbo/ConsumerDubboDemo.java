package crude.demo.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tomas.StockService;
import org.springframework.stereotype.Component;

@Component
public class ConsumerDubboDemo {
    @Reference
    StockService stockService;

    public String sayHello(String name){


        String s = stockService.sayHello(name);
        System.out.println(s);
        return s;

    }


    public int queryStock(String productId){

        int a = stockService.queryStock(productId);
        System.out.println(a);
        return a;

    }


}
