package cn.wenhe9.aggregatedataserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class AggregateDataServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AggregateDataServerApplication.class, args);
    }

}
