/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-10-28 17:08:27 UTC)
 * on 2014-11-11 at 21:50:12 UTC 
 * Modify at your own risk.
 */

package com.appspot.rvaserver2.rise.model;

/**
 * Model definition for AccessVerificationWrapper.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Rise Core API (for internal use only). For a detailed
 * explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccessVerificationWrapper extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowedAccess;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String companyId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorMessage;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowedAccess() {
    return allowedAccess;
  }

  /**
   * @param allowedAccess allowedAccess or {@code null} for none
   */
  public AccessVerificationWrapper setAllowedAccess(java.lang.Boolean allowedAccess) {
    this.allowedAccess = allowedAccess;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCompanyId() {
    return companyId;
  }

  /**
   * @param companyId companyId or {@code null} for none
   */
  public AccessVerificationWrapper setCompanyId(java.lang.String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  /**
   * @param errorMessage errorMessage or {@code null} for none
   */
  public AccessVerificationWrapper setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  @Override
  public AccessVerificationWrapper set(String fieldName, Object value) {
    return (AccessVerificationWrapper) super.set(fieldName, value);
  }

  @Override
  public AccessVerificationWrapper clone() {
    return (AccessVerificationWrapper) super.clone();
  }

}
