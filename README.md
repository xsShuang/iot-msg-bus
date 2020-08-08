# 物联网平台消息总线设计

一个物联网平台会有很多的消息类型，如设备上报的数据消息，设备离线，设备上线等消息。传统的消息处理无法满足错综复杂的物联网平台，基于主题订阅的消息模型是很适合用在物联网领域。

### 采用技术

本设计采用rabbitmq 实现基于topic的主题订阅消息模型

### 消息总线设计

所有设备相关消息的 routingKey 格式均为：device.{$productId}.{$deviceId}.{$messageType}.{$messageTypeId}

支持模糊匹配（\# 匹配一个或多个单词的情况，* 匹配一个单词的情况）

##### 说明：

{$productId}：设备产品id；

{$deviceId}：设备实例id；

{$messageType}：消息类型；

{$messageTypeId}：消息类型的具体内容id；

#####  例子：

device.123.456.event.789

表示产品id为123，设备id为456，消息类型为event，类型的具体内容id为789

##### 使用：

下面的代码表示监听所有设备的 **event** 消息

```java
@Subscribe("device.*.*.event.*")
public void message1(String s){
    System.out.println("message1" + s);
}
```

### 好处

无需关注rabbitmq 的相关配置，只需要一个注解即可开启消息订阅，屏蔽了底层的队列等具体细节。

### 实现方案

1.首先自定义注解，参考@RabbitListener，必须值，路由key（routingKey ）

2.参考@RabbitListener的实现，将所有 routingKey  绑定到一个单独匿名队列（名字随机，断开即自动销毁，不持久化）中

具体实现思路参考文章  [@RabbitListener源码解析](https://www.pianshen.com/article/7641200004/)

**源码地址：https://github.com/xsShuang/iot-msg-bus**

