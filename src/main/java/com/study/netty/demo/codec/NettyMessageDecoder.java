package com.study.netty.demo.codec;

import java.util.List;

import com.study.netty.demo.dto.NettyMessage;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

public class NettyMessageDecoder extends MessageToMessageDecoder<NettyMessage> {

	@Override
	protected void decode(ChannelHandlerContext ctx, NettyMessage msg, List<Object> out) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
