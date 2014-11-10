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
 * Model definition for PresentationWrapper.
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
public final class PresentationWrapper extends com.google.api.client.json.GenericJson {

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
  private java.lang.String companyId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime creationDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DistributionItemWrapper> distribution;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> embeddedIds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isTemplate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String layout;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer publish;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer revisionStatus;

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getChangeDate() {
    return changeDate;
  }

  /**
   * @param changeDate changeDate or {@code null} for none
   */
  public PresentationWrapper setChangeDate(com.google.api.client.util.DateTime changeDate) {
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
  public PresentationWrapper setChangedBy(java.lang.String changedBy) {
    this.changedBy = changedBy;
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
  public PresentationWrapper setCompanyId(java.lang.String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCreationDate() {
    return creationDate;
  }

  /**
   * @param creationDate creationDate or {@code null} for none
   */
  public PresentationWrapper setCreationDate(com.google.api.client.util.DateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<DistributionItemWrapper> getDistribution() {
    return distribution;
  }

  /**
   * @param distribution distribution or {@code null} for none
   */
  public PresentationWrapper setDistribution(java.util.List<DistributionItemWrapper> distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEmbeddedIds() {
    return embeddedIds;
  }

  /**
   * @param embeddedIds embeddedIds or {@code null} for none
   */
  public PresentationWrapper setEmbeddedIds(java.util.List<java.lang.String> embeddedIds) {
    this.embeddedIds = embeddedIds;
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
  public PresentationWrapper setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsTemplate() {
    return isTemplate;
  }

  /**
   * @param isTemplate isTemplate or {@code null} for none
   */
  public PresentationWrapper setIsTemplate(java.lang.Boolean isTemplate) {
    this.isTemplate = isTemplate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLayout() {
    return layout;
  }

  /**
   * @param layout layout or {@code null} for none
   */
  public PresentationWrapper setLayout(java.lang.String layout) {
    this.layout = layout;
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
  public PresentationWrapper setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPublish() {
    return publish;
  }

  /**
   * @param publish publish or {@code null} for none
   */
  public PresentationWrapper setPublish(java.lang.Integer publish) {
    this.publish = publish;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRevisionStatus() {
    return revisionStatus;
  }

  /**
   * @param revisionStatus revisionStatus or {@code null} for none
   */
  public PresentationWrapper setRevisionStatus(java.lang.Integer revisionStatus) {
    this.revisionStatus = revisionStatus;
    return this;
  }

  @Override
  public PresentationWrapper set(String fieldName, Object value) {
    return (PresentationWrapper) super.set(fieldName, value);
  }

  @Override
  public PresentationWrapper clone() {
    return (PresentationWrapper) super.clone();
  }

}
