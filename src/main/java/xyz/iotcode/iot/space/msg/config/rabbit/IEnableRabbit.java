package xyz.iotcode.iot.space.msg.config.rabbit;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author xieshuang
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyRabbitListenerConfigurationSelector.class)
public @interface IEnableRabbit {
}