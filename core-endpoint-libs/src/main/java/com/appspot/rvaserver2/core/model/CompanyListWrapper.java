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
 * on 2014-11-10 at 22:31:45 UTC 
 * Modify at your own risk.
 */

package com.appspot.rvaserver2.core.model;

/**
 * Model definition for CompanyListWrapper.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Rise Core API (experimental). For a detailed
 * explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CompanyListWrapper extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime changeDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String changedBy;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String city;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer companyStatus;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime companyStatusChangeDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fax;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> notificationEmails;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postalCode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String province;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sellerId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String street;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String telephone;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * @param address address or {@code null} for none
   */
  public CompanyListWrapper setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getChangeDate() {
    return changeDate;
  }

  /**
   * @param changeDate changeDate or {@code null} for none
   */
  public CompanyListWrapper setChangeDate(com.google.api.client.util.DateTime changeDate) {
    this.changeDate = changeDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getChangedBy() {
    return changedBy;
  }

  /**
   * @param changedBy changedBy or {@code null} for none
   */
  public CompanyListWrapper setChangedBy(java.lang.String changedBy) {
    this.changedBy = changedBy;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCity() {
    return city;
  }

  /**
   * @param city city or {@code null} for none
   */
  public CompanyListWrapper setCity(java.lang.String city) {
    this.city = city;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCompanyStatus() {
    return companyStatus;
  }

  /**
   * @param companyStatus companyStatus or {@code null} for none
   */
  public CompanyListWrapper setCompanyStatus(java.lang.Integer companyStatus) {
    this.companyStatus = companyStatus;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCompanyStatusChangeDate() {
    return companyStatusChangeDate;
  }

  /**
   * @param companyStatusChangeDate companyStatusChangeDate or {@code null} for none
   */
  public CompanyListWrapper setCompanyStatusChangeDate(com.google.api.client.util.DateTime companyStatusChangeDate) {
    this.companyStatusChangeDate = companyStatusChangeDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * @param country country or {@code null} for none
   */
  public CompanyListWrapper setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFax() {
    return fax;
  }

  /**
   * @param fax fax or {@code null} for none
   */
  public CompanyListWrapper setFax(java.lang.String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public CompanyListWrapper setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public CompanyListWrapper setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNotificationEmails() {
    return notificationEmails;
  }

  /**
   * @param notificationEmails notificationEmails or {@code null} for none
   */
  public CompanyListWrapper setNotificationEmails(java.util.List<java.lang.String> notificationEmails) {
    this.notificationEmails = notificationEmails;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getParentId() {
    return parentId;
  }

  /**
   * @param parentId parentId or {@code null} for none
   */
  public CompanyListWrapper setParentId(java.lang.String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPostalCode() {
    return postalCode;
  }

  /**
   * @param postalCode postalCode or {@code null} for none
   */
  public CompanyListWrapper setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProvince() {
    return province;
  }

  /**
   * @param province province or {@code null} for none
   */
  public CompanyListWrapper setProvince(java.lang.String province) {
    this.province = province;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSellerId() {
    return sellerId;
  }

  /**
   * @param sellerId sellerId or {@code null} for none
   */
  public CompanyListWrapper setSellerId(java.lang.String sellerId) {
    this.sellerId = sellerId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStreet() {
    return street;
  }

  /**
   * @param street street or {@code null} for none
   */
  public CompanyListWrapper setStreet(java.lang.String street) {
    this.street = street;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTelephone() {
    return telephone;
  }

  /**
   * @param telephone telephone or {@code null} for none
   */
  public CompanyListWrapper setTelephone(java.lang.String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * @param timeZone timeZone or {@code null} for none
   */
  public CompanyListWrapper setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * @param unit unit or {@code null} for none
   */
  public CompanyListWrapper setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  @Override
  public CompanyListWrapper set(String fieldName, Object value) {
    return (CompanyListWrapper) super.set(fieldName, value);
  }

  @Override
  public CompanyListWrapper clone() {
    return (CompanyListWrapper) super.clone();
  }

}
