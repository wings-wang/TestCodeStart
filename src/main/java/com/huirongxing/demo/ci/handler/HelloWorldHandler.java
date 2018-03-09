package com.huirongxing.demo.ci.handler;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.huirongxing.demo.ci.GatewayResponse;


/**
 * Handler for requests to Lambda function.
 *
 * @author   <a href="mailto:wings.wang@hrx.ai">Wings Wang</a>
 * @version  $Revision$, 03/09/2018
 */
public class HelloWorldHandler implements RequestHandler<Object, Object> {
  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * @see  com.amazonaws.services.lambda.runtime.RequestHandler#handleRequest(java.lang.Object, com.amazonaws.services.lambda.runtime.Context)
   */
  @Override
  public Object handleRequest(final Object input, final Context context) {
    Map<String, String> headers = new HashMap<>();
    headers.put("Content-Type", "application/json");

    return new GatewayResponse(new JSONObject().put("Output", "Hello World! I am Lambda 2!").toString(), headers, 200);
  }
}
