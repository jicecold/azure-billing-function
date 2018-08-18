/*
 * Enterprise Reporting APIs (preview)
 * The Reporting APIs enable Enterprise Azure customers to programmatically pull consumption and billing data into preferred data analysis tools. Generate API Key on Enterprise portal and follow the tutorial under Help - Reporting APIs. The first section under this help article explains how to generate\\retrieve the API key for the specified enrollment. <a href=\"https://docs.microsoft.com/en-us/azure/billing/billing-enterprise-api\" data-linktype=\"external\">Billing Enterprise API official documentation</a>
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;

import org.joda.time.DateTime;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * BillingPeriodV1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T20:02:06.353Z")
public class BillingPeriodV1 {
  @SerializedName("billingPeriodId")
  private String billingPeriodId = null;

  @SerializedName("billingStart")
  private DateTime billingStart = null;

  @SerializedName("billingEnd")
  private DateTime billingEnd = null;

  @SerializedName("balanceSummary")
  private String balanceSummary = null;

  @SerializedName("usageDetails")
  private String usageDetails = null;

  @SerializedName("marketplaceCharges")
  private String marketplaceCharges = null;

  @SerializedName("priceSheet")
  private String priceSheet = null;

  public BillingPeriodV1 billingPeriodId(String billingPeriodId) {
    this.billingPeriodId = billingPeriodId;
    return this;
  }

   /**
   * Get billingPeriodId
   * @return billingPeriodId
  **/
  @ApiModelProperty(value = "")
  public String getBillingPeriodId() {
    return billingPeriodId;
  }

  public void setBillingPeriodId(String billingPeriodId) {
    this.billingPeriodId = billingPeriodId;
  }

  public BillingPeriodV1 billingStart(DateTime billingStart) {
    this.billingStart = billingStart;
    return this;
  }

   /**
   * Get billingStart
   * @return billingStart
  **/
  @ApiModelProperty(value = "")
  public DateTime getBillingStart() {
    return billingStart;
  }

  public void setBillingStart(DateTime billingStart) {
    this.billingStart = billingStart;
  }

  public BillingPeriodV1 billingEnd(DateTime billingEnd) {
    this.billingEnd = billingEnd;
    return this;
  }

   /**
   * Get billingEnd
   * @return billingEnd
  **/
  @ApiModelProperty(value = "")
  public DateTime getBillingEnd() {
    return billingEnd;
  }

  public void setBillingEnd(DateTime billingEnd) {
    this.billingEnd = billingEnd;
  }

  public BillingPeriodV1 balanceSummary(String balanceSummary) {
    this.balanceSummary = balanceSummary;
    return this;
  }

   /**
   * Get balanceSummary
   * @return balanceSummary
  **/
  @ApiModelProperty(value = "")
  public String getBalanceSummary() {
    return balanceSummary;
  }

  public void setBalanceSummary(String balanceSummary) {
    this.balanceSummary = balanceSummary;
  }

  public BillingPeriodV1 usageDetails(String usageDetails) {
    this.usageDetails = usageDetails;
    return this;
  }

   /**
   * Get usageDetails
   * @return usageDetails
  **/
  @ApiModelProperty(value = "")
  public String getUsageDetails() {
    return usageDetails;
  }

  public void setUsageDetails(String usageDetails) {
    this.usageDetails = usageDetails;
  }

  public BillingPeriodV1 marketplaceCharges(String marketplaceCharges) {
    this.marketplaceCharges = marketplaceCharges;
    return this;
  }

   /**
   * Get marketplaceCharges
   * @return marketplaceCharges
  **/
  @ApiModelProperty(value = "")
  public String getMarketplaceCharges() {
    return marketplaceCharges;
  }

  public void setMarketplaceCharges(String marketplaceCharges) {
    this.marketplaceCharges = marketplaceCharges;
  }

  public BillingPeriodV1 priceSheet(String priceSheet) {
    this.priceSheet = priceSheet;
    return this;
  }

   /**
   * Get priceSheet
   * @return priceSheet
  **/
  @ApiModelProperty(value = "")
  public String getPriceSheet() {
    return priceSheet;
  }

  public void setPriceSheet(String priceSheet) {
    this.priceSheet = priceSheet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPeriodV1 billingPeriodV1 = (BillingPeriodV1) o;
    return Objects.equals(this.billingPeriodId, billingPeriodV1.billingPeriodId) &&
        Objects.equals(this.billingStart, billingPeriodV1.billingStart) &&
        Objects.equals(this.billingEnd, billingPeriodV1.billingEnd) &&
        Objects.equals(this.balanceSummary, billingPeriodV1.balanceSummary) &&
        Objects.equals(this.usageDetails, billingPeriodV1.usageDetails) &&
        Objects.equals(this.marketplaceCharges, billingPeriodV1.marketplaceCharges) &&
        Objects.equals(this.priceSheet, billingPeriodV1.priceSheet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPeriodId, billingStart, billingEnd, balanceSummary, usageDetails, marketplaceCharges, priceSheet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPeriodV1 {\n");
    
    sb.append("    billingPeriodId: ").append(toIndentedString(billingPeriodId)).append("\n");
    sb.append("    billingStart: ").append(toIndentedString(billingStart)).append("\n");
    sb.append("    billingEnd: ").append(toIndentedString(billingEnd)).append("\n");
    sb.append("    balanceSummary: ").append(toIndentedString(balanceSummary)).append("\n");
    sb.append("    usageDetails: ").append(toIndentedString(usageDetails)).append("\n");
    sb.append("    marketplaceCharges: ").append(toIndentedString(marketplaceCharges)).append("\n");
    sb.append("    priceSheet: ").append(toIndentedString(priceSheet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

