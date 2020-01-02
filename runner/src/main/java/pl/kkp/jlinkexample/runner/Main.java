package pl.kkp.jlinkexample.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "pl.kkp.jlinkexample")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
