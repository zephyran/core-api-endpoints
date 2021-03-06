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
 * (build: 2014-11-17 18:43:33 UTC)
 * on 2014-11-26 at 19:48:31 UTC 
 * Modify at your own risk.
 */

package com.appspot.rvaserver2.core.model;

/**
 * Model definition for DisplayListWrapper.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Rise Core API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DisplayListWrapper extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String addressDescription;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime blockExpiry;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer browserUpgradeMode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String browserVersion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cacheVersion;

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
  private java.lang.String companyId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String companyName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean connected;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullAddress;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String installerVersion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime lastActivityDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime lastConnectionDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double latitude;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double longitude;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean monitoringEnabled;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String os;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer playerStatus;

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
  private java.lang.Boolean restartEnabled;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String restartTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer status;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String street;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timeZoneOffset;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useCompanyAddress;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAddressDescription() {
    return addressDescription;
  }

  /**
   * @param addressDescription addressDescription or {@code null} for none
   */
  public DisplayListWrapper setAddressDescription(java.lang.String addressDescription) {
    this.addressDescription = addressDescription;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getBlockExpiry() {
    return blockExpiry;
  }

  /**
   * @param blockExpiry blockExpiry or {@code null} for none
   */
  public DisplayListWrapper setBlockExpiry(com.google.api.client.util.DateTime blockExpiry) {
    this.blockExpiry = blockExpiry;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBrowserUpgradeMode() {
    return browserUpgradeMode;
  }

  /**
   * @param browserUpgradeMode browserUpgradeMode or {@code null} for none
   */
  public DisplayListWrapper setBrowserUpgradeMode(java.lang.Integer browserUpgradeMode) {
    this.browserUpgradeMode = browserUpgradeMode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getBrowserVersion() {
    return browserVersion;
  }

  /**
   * @param browserVersion browserVersion or {@code null} for none
   */
  public DisplayListWrapper setBrowserVersion(java.lang.String browserVersion) {
    this.browserVersion = browserVersion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCacheVersion() {
    return cacheVersion;
  }

  /**
   * @param cacheVersion cacheVersion or {@code null} for none
   */
  public DisplayListWrapper setCacheVersion(java.lang.String cacheVersion) {
    this.cacheVersion = cacheVersion;
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
  public DisplayListWrapper setChangeDate(com.google.api.client.util.DateTime changeDate) {
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
  public DisplayListWrapper setChangedBy(java.lang.String changedBy) {
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
  public DisplayListWrapper setCity(java.lang.String city) {
    this.city = city;
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
  public DisplayListWrapper setCompanyId(java.lang.String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCompanyName() {
    return companyName;
  }

  /**
   * @param companyName companyName or {@code null} for none
   */
  public DisplayListWrapper setCompanyName(java.lang.String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getConnected() {
    return connected;
  }

  /**
   * @param connected connected or {@code null} for none
   */
  public DisplayListWrapper setConnected(java.lang.Boolean connected) {
    this.connected = connected;
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
  public DisplayListWrapper setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFullAddress() {
    return fullAddress;
  }

  /**
   * @param fullAddress fullAddress or {@code null} for none
   */
  public DisplayListWrapper setFullAddress(java.lang.String fullAddress) {
    this.fullAddress = fullAddress;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * @param height height or {@code null} for none
   */
  public DisplayListWrapper setHeight(java.lang.Integer height) {
    this.height = height;
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
  public DisplayListWrapper setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getInstallerVersion() {
    return installerVersion;
  }

  /**
   * @param installerVersion installerVersion or {@code null} for none
   */
  public DisplayListWrapper setInstallerVersion(java.lang.String installerVersion) {
    this.installerVersion = installerVersion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getLastActivityDate() {
    return lastActivityDate;
  }

  /**
   * @param lastActivityDate lastActivityDate or {@code null} for none
   */
  public DisplayListWrapper setLastActivityDate(com.google.api.client.util.DateTime lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getLastConnectionDate() {
    return lastConnectionDate;
  }

  /**
   * @param lastConnectionDate lastConnectionDate or {@code null} for none
   */
  public DisplayListWrapper setLastConnectionDate(com.google.api.client.util.DateTime lastConnectionDate) {
    this.lastConnectionDate = lastConnectionDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getLatitude() {
    return latitude;
  }

  /**
   * @param latitude latitude or {@code null} for none
   */
  public DisplayListWrapper setLatitude(java.lang.Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getLongitude() {
    return longitude;
  }

  /**
   * @param longitude longitude or {@code null} for none
   */
  public DisplayListWrapper setLongitude(java.lang.Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMonitoringEnabled() {
    return monitoringEnabled;
  }

  /**
   * @param monitoringEnabled monitoringEnabled or {@code null} for none
   */
  public DisplayListWrapper setMonitoringEnabled(java.lang.Boolean monitoringEnabled) {
    this.monitoringEnabled = monitoringEnabled;
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
  public DisplayListWrapper setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOs() {
    return os;
  }

  /**
   * @param os os or {@code null} for none
   */
  public DisplayListWrapper setOs(java.lang.String os) {
    this.os = os;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPlayerStatus() {
    return playerStatus;
  }

  /**
   * @param playerStatus playerStatus or {@code null} for none
   */
  public DisplayListWrapper setPlayerStatus(java.lang.Integer playerStatus) {
    this.playerStatus = playerStatus;
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
  public DisplayListWrapper setPostalCode(java.lang.String postalCode) {
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
  public DisplayListWrapper setProvince(java.lang.String province) {
    this.province = province;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRestartEnabled() {
    return restartEnabled;
  }

  /**
   * @param restartEnabled restartEnabled or {@code null} for none
   */
  public DisplayListWrapper setRestartEnabled(java.lang.Boolean restartEnabled) {
    this.restartEnabled = restartEnabled;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRestartTime() {
    return restartTime;
  }

  /**
   * @param restartTime restartTime or {@code null} for none
   */
  public DisplayListWrapper setRestartTime(java.lang.String restartTime) {
    this.restartTime = restartTime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStatus() {
    return status;
  }

  /**
   * @param status status or {@code null} for none
   */
  public DisplayListWrapper setStatus(java.lang.Integer status) {
    this.status = status;
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
  public DisplayListWrapper setStreet(java.lang.String street) {
    this.street = street;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimeZoneOffset() {
    return timeZoneOffset;
  }

  /**
   * @param timeZoneOffset timeZoneOffset or {@code null} for none
   */
  public DisplayListWrapper setTimeZoneOffset(java.lang.Integer timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
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
  public DisplayListWrapper setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseCompanyAddress() {
    return useCompanyAddress;
  }

  /**
   * @param useCompanyAddress useCompanyAddress or {@code null} for none
   */
  public DisplayListWrapper setUseCompanyAddress(java.lang.Boolean useCompanyAddress) {
    this.useCompanyAddress = useCompanyAddress;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * @param width width or {@code null} for none
   */
  public DisplayListWrapper setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public DisplayListWrapper set(String fieldName, Object value) {
    return (DisplayListWrapper) super.set(fieldName, value);
  }

  @Override
  public DisplayListWrapper clone() {
    return (DisplayListWrapper) super.clone();
  }

}
