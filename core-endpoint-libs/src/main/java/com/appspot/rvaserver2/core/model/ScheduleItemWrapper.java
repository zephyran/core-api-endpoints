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
 * on 2014-11-03 at 22:05:18 UTC 
 * Modify at your own risk.
 */

package com.appspot.rvaserver2.core.model;

/**
 * Model definition for ScheduleItemWrapper.
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
public final class ScheduleItemWrapper extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean distributeToAll;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> distribution;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer duration;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectReference;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean recurrenceAbsolute;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer recurrenceDayOfMonth;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer recurrenceDayOfWeek;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> recurrenceDaysOfWeek;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer recurrenceFrequency;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer recurrenceMonthOfYear;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recurrenceType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer recurrenceWeekOfMonth;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean timeDefined;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDistributeToAll() {
    return distributeToAll;
  }

  /**
   * @param distributeToAll distributeToAll or {@code null} for none
   */
  public ScheduleItemWrapper setDistributeToAll(java.lang.Boolean distributeToAll) {
    this.distributeToAll = distributeToAll;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDistribution() {
    return distribution;
  }

  /**
   * @param distribution distribution or {@code null} for none
   */
  public ScheduleItemWrapper setDistribution(java.util.List<java.lang.String> distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDuration() {
    return duration;
  }

  /**
   * @param duration duration or {@code null} for none
   */
  public ScheduleItemWrapper setDuration(java.lang.Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEndDate() {
    return endDate;
  }

  /**
   * @param endDate endDate or {@code null} for none
   */
  public ScheduleItemWrapper setEndDate(java.lang.String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEndTime() {
    return endTime;
  }

  /**
   * @param endTime endTime or {@code null} for none
   */
  public ScheduleItemWrapper setEndTime(java.lang.String endTime) {
    this.endTime = endTime;
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
  public ScheduleItemWrapper setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectReference() {
    return objectReference;
  }

  /**
   * @param objectReference objectReference or {@code null} for none
   */
  public ScheduleItemWrapper setObjectReference(java.lang.String objectReference) {
    this.objectReference = objectReference;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRecurrenceAbsolute() {
    return recurrenceAbsolute;
  }

  /**
   * @param recurrenceAbsolute recurrenceAbsolute or {@code null} for none
   */
  public ScheduleItemWrapper setRecurrenceAbsolute(java.lang.Boolean recurrenceAbsolute) {
    this.recurrenceAbsolute = recurrenceAbsolute;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRecurrenceDayOfMonth() {
    return recurrenceDayOfMonth;
  }

  /**
   * @param recurrenceDayOfMonth recurrenceDayOfMonth or {@code null} for none
   */
  public ScheduleItemWrapper setRecurrenceDayOfMonth(java.lang.Integer recurrenceDayOfMonth) {
    this.recurrenceDayOfMonth = recurrenceDayOfMonth;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRecurrenceDayOfWeek() {
    return recurrenceDayOfWeek;
  }

  /**
   * @param recurrenceDayOfWeek recurrenceDayOfWeek or {@code null} for none
   */
  public ScheduleItemWrapper setRecurrenceDayOfWeek(java.lang.Integer recurrenceDayOfWeek) {
    this.recurrenceDayOfWeek = recurrenceDayOfWeek;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRecurrenceDaysOfWeek() {
    return recurrenceDaysOfWeek;
  }

  /**
   * @param recurrenceDaysOfWeek recurrenceDaysOfWeek or {@code null} for none
   */
  public ScheduleItemWrapper setRecurrenceDaysOfWeek(java.util.List<java.lang.String> recurrenceDaysOfWeek) {
    this.recurrenceDaysOfWeek = recurrenceDaysOfWeek;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRecurrenceFrequency() {
    return recurrenceFrequency;
  }

  /**
   * @param recurrenceFrequency recurrenceFrequency or {@code null} for none
   */
  public ScheduleItemWrapper setRecurrenceFrequency(java.lang.Integer recurrenceFrequency) {
    this.recurrenceFrequency = recurrenceFrequency;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRecurrenceMonthOfYear() {
    return recurrenceMonthOfYear;
  }

  /**
   * @param recurrenceMonthOfYear recurrenceMonthOfYear or {@code null} for none
   */
  public ScheduleItemWrapper setRecurrenceMonthOfYear(java.lang.Integer recurrenceMonthOfYear) {
    this.recurrenceMonthOfYear = recurrenceMonthOfYear;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRecurrenceType() {
    return recurrenceType;
  }

  /**
   * @param recurrenceType recurrenceType or {@code null} for none
   */
  public ScheduleItemWrapper setRecurrenceType(java.lang.String recurrenceType) {
    this.recurrenceType = recurrenceType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRecurrenceWeekOfMonth() {
    return recurrenceWeekOfMonth;
  }

  /**
   * @param recurrenceWeekOfMonth recurrenceWeekOfMonth or {@code null} for none
   */
  public ScheduleItemWrapper setRecurrenceWeekOfMonth(java.lang.Integer recurrenceWeekOfMonth) {
    this.recurrenceWeekOfMonth = recurrenceWeekOfMonth;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStartDate() {
    return startDate;
  }

  /**
   * @param startDate startDate or {@code null} for none
   */
  public ScheduleItemWrapper setStartDate(java.lang.String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStartTime() {
    return startTime;
  }

  /**
   * @param startTime startTime or {@code null} for none
   */
  public ScheduleItemWrapper setStartTime(java.lang.String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTimeDefined() {
    return timeDefined;
  }

  /**
   * @param timeDefined timeDefined or {@code null} for none
   */
  public ScheduleItemWrapper setTimeDefined(java.lang.Boolean timeDefined) {
    this.timeDefined = timeDefined;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public ScheduleItemWrapper setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public ScheduleItemWrapper set(String fieldName, Object value) {
    return (ScheduleItemWrapper) super.set(fieldName, value);
  }

  @Override
  public ScheduleItemWrapper clone() {
    return (ScheduleItemWrapper) super.clone();
  }

}