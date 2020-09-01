package com.study.netty.demo.echo.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class EchoClientHandler extends ChannelInboundHandlerAdapter {

	private final ByteBuf firstMessage;

	public EchoClientHandler() {
		firstMessage = Unpooled.buffer(5);
		for (int i = 0; i < 5; i++) {
			firstMessage.writeByte((byte) i);
		}
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		ctx.writeAndFlush(firstMessage);
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		// TODO Auto-generated method stub
		ctx.write(msg);
		byte[]  d  = new  byte[5];
		((ByteBuf)msg).getBytes(0, d  );
		System.out.println(new String(d));
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		
		ctx.flush();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		ctx.close();
	}

}
