package com.tangqi.netty.server;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.string.StringDecoder;


/**
 * @Auhtor: tangqi@otasim.com
 * @Description: 继承netty提供的初始化类，只要实现其提供的方法即可
 * @Date: Create in 10:38 2017/4/28
 * @Modified By:
 */
public class HelloServerInitialize extends ChannelInitializer<SocketChannel> {

    protected void initChannel(SocketChannel socketChannel) throws Exception {
        //开启传输通道，这个通道的作用是管理控制器，行程一个责任链式管理
        ChannelPipeline channelPipeline =  socketChannel.pipeline();
        //以（"\n"）为结尾分割的 解码器
        channelPipeline.addLast("framer", new DelimiterBasedFrameDecoder(8192, Delimiters.lineDelimiter()));

        //字符串解码和编码
        channelPipeline.addLast("decoder", new StringDecoder());
        channelPipeline.addLast("encoder", new StringDecoder());

        //加入自定义header
        channelPipeline.addLast("header", new HelloServerHandler());
        //初始化类一般都是先加入编码解码器来解读传输来的消息，然后加入自定义类来处理业务逻辑
    }
}
