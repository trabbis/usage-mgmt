/**
 * Generated from schema type t|e=rawDataUsageDetail|t=DataServiceEvent@http://xmlschema.tmi.telus.com/xsd/Resource/Resource/RawDataServiceUsageCommonResource_v4
 */
package com.telus.mediation.usage.tmf635.response.model;

public class RawDataUsageDetail implements java.io.Serializable {

  private MobileInternetDataUsage mobileInternetDataUsage;

  public MobileInternetDataUsage getMobileInternetDataUsage() {
    return this.mobileInternetDataUsage;
  }

  public void setMobileInternetDataUsage(MobileInternetDataUsage mobileInternetDataUsage) {
    this.mobileInternetDataUsage = mobileInternetDataUsage;
  }

  private MessagingDataUsage messagingDataUsage;

  public MessagingDataUsage getMessagingDataUsage() {
    return this.messagingDataUsage;
  }

  public void setMessagingDataUsage(MessagingDataUsage messagingDataUsage) {
    this.messagingDataUsage = messagingDataUsage;
  }

}
