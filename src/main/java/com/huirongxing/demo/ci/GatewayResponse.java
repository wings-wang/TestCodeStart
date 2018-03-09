package com.huirongxing.demo.ci;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/**
 * POJO containing response object for API Gateway.
 *
 * @author   <a href="mailto:wings.wang@hrx.ai">Wings Wang</a>
 * @version  $Revision$, 03/09/2018
 */
public class GatewayResponse {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  private final String              body;
  private final Map<String, String> headers;
  private final int                 statusCode;

  //~ Constructors -----------------------------------------------------------------------------------------------------

  /**
   * Creates a new GatewayResponse object.
   *
   * @param  body        DOCUMENT ME!
   * @param  headers     DOCUMENT ME!
   * @param  statusCode  DOCUMENT ME!
   */
  public GatewayResponse(final String body, final Map<String, String> headers, final int statusCode) {
    this.statusCode = statusCode;
    this.body       = body;
    this.headers    = Collections.unmodifiableMap(new HashMap<>(headers));
  }

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getBody() {
    return body;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Map<String, String> getHeaders() {
    return headers;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public int getStatusCode() {
    return statusCode;
  }
} // end class GatewayResponse
