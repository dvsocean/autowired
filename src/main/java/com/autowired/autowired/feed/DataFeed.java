package com.autowired.autowired.feed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("dataFeed")
public class DataFeed {

  private String syncedModel;
  private String releaseYear;

  @Value("${nameOfCompany}")
  String nameOfCompany;

  @Value("${startYear:2016}")
  int yearOfStartup;

  @Value("${postalCode}")
  int postalCode;

  @Value("${location}")
  String location;

  public String getNameOfCompany() {
    return nameOfCompany;
  }

  public int getYearOfStartup() {
    return yearOfStartup;
  }

  public int getPostalCode() {
    return postalCode;
  }

  public String getLocation() {
    return location;
  }

  private String lockheed;

  @Autowired
  private Environment env;

  public String getLockHeedMartinData(){
    lockheed = env.getProperty("statement");
    return this.lockheed;
  }

  public String getSyncedModel() {
    return syncedModel;
  }

  public void setSyncedModel(String syncedModel) {
    this.syncedModel = syncedModel;
  }

  public String getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(String releaseYear) {
    this.releaseYear = releaseYear;
  }
}
