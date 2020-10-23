package com.heima.canal_demo;


import com.google.protobuf.InvalidProtocolBufferException;
import com.heima.protobuf.DemoModel;

/**
 * @author: bunny
 * @date: 2020/6/6 15:49
 */
public class ProtoBufDemo {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        //需求1：给定数据，序列化成字节码数据
        DemoModel.User.Builder builder = DemoModel.User.newBuilder();

        //给对象赋值操作
        builder.setId(1);
        builder.setName("bunny");
        builder.setSex("女");
        byte[] bytes = builder.build().toByteArray();
        for (byte b : bytes) {
            System.out.println(b);
        }
        //需求2. 将序列化字节码数据反序列化为原始数据
        DemoModel.User user = DemoModel.User.parseFrom(bytes);
        //user是一个对象，需要调用方法
        System.out.println(user.getSex());

    }


}
