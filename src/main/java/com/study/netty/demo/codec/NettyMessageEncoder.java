package com.study.netty.demo.codec;

import java.util.List;

import org.jboss.marshalling.MarshallingConfiguration;

import com.study.netty.demo.dto.NettyMessage;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.marshalling.MarshallerProvider;
import io.netty.handler.codec.marshalling.MarshallingEncoder;

public class NettyMessageEncoder  extends  MessageToMessageDecoder<NettyMessage> {
	
	
	private  MarshallingEncoder  marshallingEndcoder;
	
	private  MarshallerProvider  marshallerProvider;
	
	

	public NettyMessageEncoder() {
		super();
		MarshallingConfiguration  marshallingConfiguration  = new  MarshallingConfiguration();
		
		marshallingEndcoder = new   MarshallingEncoder(marshallerProvider);
	}





	@Override
	protected void decode(ChannelHandlerContext ctx, NettyMessage msg, List<Object> out) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
