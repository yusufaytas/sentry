/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sentry.provider.db.service.thrift;

import java.util.HashMap;
import java.util.Map;

import javax.security.sasl.Sasl;
import com.google.common.collect.ImmutableMap;

public class Constants {

  private static final ImmutableMap<String, String> SASL_PROPERTIES;

  static {
    Map<String, String> saslProps = new HashMap<String, String>();
    saslProps.put(Sasl.SERVER_AUTH, "true");
    saslProps.put(Sasl.QOP, "auth-conf");
    SASL_PROPERTIES = ImmutableMap.copyOf(saslProps);
  }

  public static class ServerArgs {
    public static final String CONFIG_FILE = "--conf-file";
  }
  public static class ServerConfig {
    public static final ImmutableMap<String, String> SASL_PROPERTIES = Constants.SASL_PROPERTIES;
    public static final String PRINCIPAL = "sentry.service.server.principal";
    public static final String KEY_TAB = "sentry.service.server.keytab";
    public static final String RPC_PORT = "sentry.service.server.rpc-port";
    public static final int RPC_PORT_DEFAULT = 8038;
    public static final String RPC_ADDRESS = "sentry.service.server.rpc-address";
    public static final String RPC_ADDRESS_DEFAULT = "0.0.0.0";
    public static final String RPC_MAX_THREADS = "sentry.service.server-max-threads";
    public static final int RPC_MAX_THREADS_DEFAULT = 500;
    public static final String RPC_MIN_THREADS = "sentry.service.server-min-threads";
    public static final int RPC_MIN_THREADS_DEFAULT = 10;
    public static final String ALLOW_CONNECT = "sentry.service.allow.connect";
  }
  public static class ClientConfig {
    public static final ImmutableMap<String, String> SASL_PROPERTIES = Constants.SASL_PROPERTIES;
    public static final String SERVER_RPC_PORT = "sentry.service.client.server.rpc-port";
    public static final int SERVER_RPC_PORT_DEFAULT = ServerConfig.RPC_PORT_DEFAULT;
    public static final String SERVER_RPC_ADDRESS = "sentry.service.client.server.rpc-address";
    public static final String SERVER_RPC_CONN_TIMEOUT = "sentry.service.client.server.rpc-connection-timeout";
    public static final int SERVER_RPC_CONN_TIMEOUT_DEFAULT = 200000;
  }

  /**
   * Thrift generates terrible constant class names
   */
  public static class ThriftConstants extends org.apache.sentry.service.api.sentry_storeConstants {
    public static final int TSENTRY_SERVICE_VERSION_CURRENT = TSENTRY_SERVICE_V1;
  }
}