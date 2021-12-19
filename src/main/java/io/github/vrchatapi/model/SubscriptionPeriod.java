/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.6.5
 * Contact: me@ruby.js.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets SubscriptionPeriod
 */
@JsonAdapter(SubscriptionPeriod.Adapter.class)
public enum SubscriptionPeriod {
  
  HOUR("hour"),
  
  DAY("day"),
  
  WEEK("week"),
  
  MONTH("month"),
  
  YEAR("year");

  private String value;

  SubscriptionPeriod(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SubscriptionPeriod fromValue(String value) {
    for (SubscriptionPeriod b : SubscriptionPeriod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<SubscriptionPeriod> {
    @Override
    public void write(final JsonWriter jsonWriter, final SubscriptionPeriod enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SubscriptionPeriod read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SubscriptionPeriod.fromValue(value);
    }
  }
}

