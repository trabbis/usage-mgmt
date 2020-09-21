/**
 * Generated from schema type t=BatchInfoType@http://xmlschema.tmi.telus.com/srv/CMO/BillingInquiryMgmt/RawDataUsageServiceRequestResponse_v3
 */
package com.telus.mediation.usage.tmf635.response;

public class BatchInfoType implements java.io.Serializable {

  private java.math.BigInteger batchNumber;

  public java.math.BigInteger getBatchNumber() {
    return this.batchNumber;
  }

  public void setBatchNumber(java.math.BigInteger batchNumber) {
    this.batchNumber = batchNumber;
  }

  private boolean moreDataExistInd;

  public boolean getMoreDataExistInd() {
    return this.moreDataExistInd;
  }

  public boolean isMoreDataExistInd() {
    return this.moreDataExistInd;
  }

  public void setMoreDataExistInd(boolean moreDataExistInd) {
    this.moreDataExistInd = moreDataExistInd;
  }

}
