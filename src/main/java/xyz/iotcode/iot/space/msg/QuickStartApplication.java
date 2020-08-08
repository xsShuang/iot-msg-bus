package xyz.iotcode.iot.space.msg;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.iotcode.iot.space.msg.config.rabbit.IEnableRabbit;

/**
 * @author xieshuang
 */
@IEnableRabbit
@RestController
@EnableAsync
@SpringBootApplication
public class QuickStartApplication {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public static void main(String[] args) {
        SpringApplication.run(QuickStartApplication.class, args);
    }

    @GetMapping("/test")
    public String test(String a, String key){
        for (int i = 0; i < 10; i++) {
            rabbitTemplate.convertAndSend("iot.space.topic", key, a + i);
        }
        return "ok";
    }

}
