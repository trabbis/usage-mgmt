/**
 * Generated from schema type t=SearchRawUsageDetail@http://xmlschema.tmi.telus.com/srv/CMO/BillingInquiryMgmt/RawDataUsageServiceRequestResponse_v3
 */
package com.telus.mediation.usage.tmf635.response;

public class SearchRawUsageDetail implements java.io.Serializable {

  private java.util.Calendar dataServiceEventTime;

  public java.util.Calendar getDataServiceEventTime() {
    return this.dataServiceEventTime;
  }

  public void setDataServiceEventTime(java.util.Calendar dataServiceEventTime) {
    this.dataServiceEventTime = dataServiceEventTime;
  }

  private long dataServiceEventId;

  public long getDataServiceEventId() {
    return this.dataServiceEventId;
  }

  public void setDataServiceEventId(long dataServiceEventId) {
    this.dataServiceEventId = dataServiceEventId;
  }

  private java.lang.String dataServiceEventTypeCd;

  public java.lang.String getDataServiceEventTypeCd() {
    return this.dataServiceEventTypeCd;
  }

  public void setDataServiceEventTypeCd(java.lang.String dataServiceEventTypeCd) {
    this.dataServiceEventTypeCd = dataServiceEventTypeCd;
  }

}
