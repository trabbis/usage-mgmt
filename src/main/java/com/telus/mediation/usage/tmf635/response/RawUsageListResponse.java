/**
 * Generated from schema type t=RawUsageListResponse@http://xmlschema.tmi.telus.com/srv/CMO/BillingInquiryMgmt/RawDataUsageServiceRequestResponse_v3
 */
package com.telus.mediation.usage.tmf635.response;

import com.telus.mediation.usage.tmf635.response.model.DataServiceEvent;

public class RawUsageListResponse implements java.io.Serializable {

  private BatchInfoType batchInfoType;

  public BatchInfoType getBatchInfoType() {
    return this.batchInfoType;
  }

  public void setBatchInfoType(BatchInfoType batchInfoType) {
    this.batchInfoType = batchInfoType;
  }

  //TODO2 need to convert to List, not arrays
  private DataServiceEvent[] rawUsageListType;

  public DataServiceEvent[] getRawUsageListType() {
    return this.rawUsageListType;
  }

  public void setRawUsageListType(DataServiceEvent[] rawUsageListType) {
    this.rawUsageListType = rawUsageListType;
  }

}
