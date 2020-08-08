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

    @Subscribe("msg.device.test")
    public void message5(String s){
        System.out.println("message1" + s);
    }

    @Subscribe("msg.#")
    public void message6(String s){
        System.out.println("message2" + s);
    }

    @Subscribe("msg.*.test")
    public void message7(String s){
        System.out.println("message3" + s);
    }

    @Subscribe("msg.33.*")
    public void message8(String s){
        System.out.println("message4" + s);
    }

    @Subscribe("msg.device.test")
    public void message9(String s){
        System.out.println("message1" + s);
    }

    @Subscribe("msg.#")
    public void message10(String s){
        System.out.println("message2" + s);
    }

    @Subscribe("msg.*.test")
    public void message11(String s){
        System.out.println("message3" + s);
    }

    @Subscribe("msg.33.*")
    public void message12(String s){
        System.out.println("message4" + s);
    }

    @Subscribe("msg.device.test")
    public void message13(String s){
        System.out.println("message1" + s);
    }

    @Subscribe("msg.#")
    public void message14(String s){
        System.out.println("message2" + s);
    }

    @Subscribe("msg.*.test")
    public void message15(String s){
        System.out.println("message3" + s);
    }

    @Subscribe("msg.33.*")
    public void message16(String s){
        System.out.println("message4" + s);
    }

    @Subscribe("msg.device.test")
    public void message17(String s){
        System.out.println("message1" + s);
    }

    @Subscribe("msg.#")
    public void message18(String s){
        System.out.println("message2" + s);
    }

    @Subscribe("msg.*.test")
    public void message19(String s){
        System.out.println("message3" + s);
    }

    @Subscribe("msg.33.*")
    public void message20(String s){
        System.out.println("message4" + s);
    }

    @Subscribe("msg.device.test")
    public void message21(String s){
        System.out.println("message1" + s);
    }

    @Subscribe("msg.#")
    public void message22(String s){
        System.out.println("message2" + s);
    }

    @Subscribe("msg.*.test")
    public void message23(String s){
        System.out.println("message3" + s);
    }

    @Subscribe("msg.33.*")
    public void message24(String s){
        System.out.println("message4" + s);
    }

    @Subscribe("msg.device.test")
    public void message25(String s){
        System.out.println("message1" + s);
    }

    @Subscribe("msg.#")
    public void message26(String s){
        System.out.println("message2" + s);
    }

    @Subscribe("msg.*.test")
    public void message27(String s){
        System.out.println("message3" + s);
    }

    @Subscribe("msg.33.*")
    public void message28(String s){
        System.out.println("message4" + s);
    }

    @Subscribe("msg.device.test")
    public void message29(String s){
        System.out.println("message1" + s);
    }

    @Subscribe("msg.#")
    public void message30(String s){
        System.out.println("message2" + s);
    }

    @Subscribe("msg.*.test")
    public void message31(String s){
        System.out.println("message3" + s);
    }

    @Subscribe("msg.33.*")
    public void message32(String s){
        System.out.println("message4" + s);
    }

    @Subscribe("msg.device.test")
    public void message33(String s){
        System.out.println("message1" + s);
    }

    @Subscribe("msg.#")
    public void message34(String s){
        System.out.println("message2" + s);
    }

    @Subscribe("msg.*.test")
    public void message35(String s){
        System.out.println("message3" + s);
    }

    @Subscribe("msg.33.*")
    public void message36(String s){
        System.out.println("message4" + s);
    }

    @Subscribe("msg.device.test")
    public void message37(String s){
        System.out.println("message1" + s);
    }

    @Subscribe("msg.#")
    public void message38(String s){
        System.out.println("message2" + s);
    }

    @Subscribe("msg.*.test")
    public void message39(String s){
        System.out.println("message3" + s);
    }

    @Subscribe("msg.33.*")
    public void message40(String s){
        System.out.println("message4" + s);
    }

    @Subscribe("msg.device.test")
    public void message41(String s){
        System.out.println("message1" + s);
    }

    @Subscribe("msg.#")
    public void message42(String s){
        System.out.println("message2" + s);
    }

    @Subscribe("msg.*.test")
    public void message43(String s){
        System.out.println("message3" + s);
    }

    @Subscribe("msg.33.*")
    public void message44(String s){
        System.out.println("message4" + s);
    }

    @Subscribe("msg.device.test")
    public void message45(String s){
        System.out.println("message1" + s);
    }

    @Subscribe("msg.#")
    public void message46(String s){
        System.out.println("message2" + s);
    }

    @Subscribe("msg.*.test")
    public void message47(String s){
        System.out.println("message3" + s);
    }

    @Subscribe("msg.33.*")
    public void message48(String s){
        System.out.println("message4" + s);
    }
}
