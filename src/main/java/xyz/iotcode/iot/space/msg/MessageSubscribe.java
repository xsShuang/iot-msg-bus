package xyz.iotcode.iot.space.msg;

import org.springframework.stereotype.Component;
import xyz.iotcode.iot.space.msg.config.rabbit.Subscribe;

/**
 * @author xieshuang
 * @date 2020-08-08 11:23
 */
@Component
public class MessageSubscribe {

    @Subscribe(topic = "amq.topic", value = "ssss")
    public void message(String s){
        System.out.println(s);
    }

    @Subscribe("msg.device.test")
    public void message1(String s){
        System.out.println("message1" + s);
    }

    @Subscribe("msg.#")
    public void message2(String s){
        System.out.println("message2" + s);
    }

    @Subscribe("msg.*.test")
    public void message3(String s){
        System.out.println("message3" + s);
    }

    @Subscribe("msg.33.*")
    public void message4(String s){
        System.out.println("message4" + s);
    }
}
