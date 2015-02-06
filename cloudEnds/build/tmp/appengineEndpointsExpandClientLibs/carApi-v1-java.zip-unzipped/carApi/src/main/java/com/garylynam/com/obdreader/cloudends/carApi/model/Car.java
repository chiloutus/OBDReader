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
 * (build: 2015-01-14 17:53:03 UTC)
 * on 2015-02-05 at 23:00:29 UTC 
 * Modify at your own risk.
 */

package com.garylynam.com.obdreader.cloudends.carApi.model;

/**
 * Model definition for Car.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the carApi. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Car extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String color;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String make;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String model;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serial;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer year;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getColor() {
    return color;
  }

  /**
   * @param color color or {@code null} for none
   */
  public Car setColor(java.lang.String color) {
    this.color = color;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMake() {
    return make;
  }

  /**
   * @param make make or {@code null} for none
   */
  public Car setMake(java.lang.String make) {
    this.make = make;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getModel() {
    return model;
  }

  /**
   * @param model model or {@code null} for none
   */
  public Car setModel(java.lang.String model) {
    this.model = model;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSerial() {
    return serial;
  }

  /**
   * @param serial serial or {@code null} for none
   */
  public Car setSerial(java.lang.String serial) {
    this.serial = serial;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getYear() {
    return year;
  }

  /**
   * @param year year or {@code null} for none
   */
  public Car setYear(java.lang.Integer year) {
    this.year = year;
    return this;
  }

  @Override
  public Car set(String fieldName, Object value) {
    return (Car) super.set(fieldName, value);
  }

  @Override
  public Car clone() {
    return (Car) super.clone();
  }

}