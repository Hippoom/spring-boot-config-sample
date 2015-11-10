package configsample;

import configsample.host.HostConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.stringtemplate.v4.ST;

import javax.annotation.Resource;

@RestController
@SpringBootApplication
public class Application {

    @Resource
    private HostConfig host;

    @RequestMapping
    public String hello() {
        return new ST("hello, I'm <hostName>, you can call me <nickName>")
                .add("hostName", host.getName())
                .add("nickName", host.getNickName())
                .render();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}