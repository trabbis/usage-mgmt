/**
 * Generated from schema type t=SearchRawSMSDetail@http://xmlschema.tmi.telus.com/srv/CMO/BillingInquiryMgmt/RawDataUsageServiceRequestResponse_v3
 */
package com.telus.mediation.usage.tmf635.response;

public class SearchRawSMSDetail implements java.io.Serializable {

  private java.util.Calendar messagingEventTime;

  public java.util.Calendar getMessagingEventTime() {
    return this.messagingEventTime;
  }

  public void setMessagingEventTime(java.util.Calendar messagingEventTime) {
    this.messagingEventTime = messagingEventTime;
  }

  private long messagingEventId;

  public long getMessagingEventId() {
    return this.messagingEventId;
  }

  public void setMessagingEventId(long messagingEventId) {
    this.messagingEventId = messagingEventId;
  }

}
