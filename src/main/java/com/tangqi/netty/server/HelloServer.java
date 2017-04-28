package com.tangqi.netty.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @Auhtor: tangqi@otasim.com
 * @Description:
 * @Date: Create in 10:28 2017/4/28
 * @Modified By:
 */
public class HelloServer {

    /**
     * 服务端监听的端口地址
     */
    private static  final  int portNumber = 7878;

    public HelloServer() {
    }

    public static void main(String[] args) throws InterruptedException {

        //开启两个事件循环组，事件循环组会自动构建EventLoop,服务器一般开启两个，提高效率
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            //netty的引导类，用于简化开发
            ServerBootstrap bootstrap = new ServerBootstrap();
            //把事件循环组加入引导程序
            bootstrap.group(bossGroup, workerGroup);
            //开启socket
            bootstrap.channel(NioServerSocketChannel.class);
            //加入业务控制器，这里加入一个初始化类，其中包含了很多业务控制器
            bootstrap.childHandler(new HelloServerInitialize());

            //服务器绑定端口监听
            ChannelFuture channelFuture = bootstrap.bind(portNumber).sync();
            //监听服务器关闭监听
            channelFuture.channel().closeFuture().sync();
        }finally {
            //netty 优雅退出
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
