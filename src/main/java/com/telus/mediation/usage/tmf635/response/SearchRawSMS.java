/**
 * Generated from schema type t=SearchRawSMS@http://xmlschema.tmi.telus.com/srv/CMO/BillingInquiryMgmt/RawDataUsageServiceRequestResponse_v3
 */
package com.telus.mediation.usage.tmf635.response;

public class SearchRawSMS implements java.io.Serializable {

  private java.util.Calendar fromDate;

  public java.util.Calendar getFromDate() {
    return this.fromDate;
  }

  public void setFromDate(java.util.Calendar fromDate) {
    this.fromDate = fromDate;
  }

  private java.util.Calendar toDate;

  public java.util.Calendar getToDate() {
    return this.toDate;
  }

  public void setToDate(java.util.Calendar toDate) {
    this.toDate = toDate;
  }

  private java.lang.String callingPhoneNumber;

  public java.lang.String getCallingPhoneNumber() {
    return this.callingPhoneNumber;
  }

  public void setCallingPhoneNumber(java.lang.String callingPhoneNumber) {
    this.callingPhoneNumber = callingPhoneNumber;
  }

  private java.lang.String calledPhoneNumber;

  public java.lang.String getCalledPhoneNumber() {
    return this.calledPhoneNumber;
  }

  public void setCalledPhoneNumber(java.lang.String calledPhoneNumber) {
    this.calledPhoneNumber = calledPhoneNumber;
  }

  private java.lang.String statusCd;

  public java.lang.String getStatusCd() {
    return this.statusCd;
  }

  public void setStatusCd(java.lang.String statusCd) {
    this.statusCd = statusCd;
  }

}
