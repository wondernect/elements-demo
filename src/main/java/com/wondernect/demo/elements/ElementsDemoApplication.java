package com.wondernect.demo.elements;

import com.wondernect.elements.common.utils.ESStringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScans({
        @ComponentScan(basePackages = "com.wondernect.*")
})
@SpringBootApplication
public class ElementsDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ElementsDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (ESStringUtils.equalsIgnoreCase("1", "2")) {
            System.out.println("hello, wondernect elements YES !!!");
        } else {
            System.out.println("hello, wondernect elements NO !!!");
        }
    }
}
