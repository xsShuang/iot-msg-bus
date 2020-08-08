package xyz.iotcode.iot.space.msg.config.rabbit;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xieshuang
 * @since 2020/4/18 11:10
 */
@Configuration
@AutoConfigureAfter({ConnectionFactory.class, AmqpAdmin.class})
public class RabbitMqConfig {

    @Bean
    public TopicExchange iotSpaceTopicExchange(){
        return new TopicExchange("iot.space.topic");
    }
}
