package xyz.iotcode.iot.space.msg.config.rabbit;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.annotation.Order;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author xieshuang
 */
@AutoConfigureAfter({ConnectionFactory.class, AmqpAdmin.class})
@Order
public class MyRabbitListenerConfigurationSelector implements DeferredImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[] { MyRabbitBootstrapConfiguration.class.getName() };
	}

}