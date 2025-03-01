package com.whale;

import com.whale.client.RpcClient;
import com.whale.protocol.RpcMessageDecoder;
import com.whale.protocol.RpcMessageEncoder;
import com.whale.server.RpcServer;
import com.whale.util.RpcConf;
import io.netty.bootstrap.ServerBootstrap;

/**
 * Rpc context.
 * for create rpc clientFactory、rpc server
 */
public class RpcContext {

  private RpcConf conf;

  private static final RpcMessageEncoder encoder = RpcMessageEncoder.INSTANCE;
  private static final RpcMessageDecoder decoder = RpcMessageDecoder.INSTANCE;

  public RpcServer createRpcServer() {
    // todo
    return null;
  }

  public RpcClient createRpcClient() {
    // todo
    ServerBootstrap
    return null;
  }

  public RpcConf getConf() {
    return conf;
  }
}
