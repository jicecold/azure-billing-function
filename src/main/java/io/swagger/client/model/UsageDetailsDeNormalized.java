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
 * UsageDetailsDeNormalized
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T20:02:06.353Z")
public class UsageDetailsDeNormalized {
  @SerializedName("cost")
  private Double cost = null;

  @SerializedName("accountId")
  private Integer accountId = null;

  @SerializedName("productId")
  private Integer productId = null;

  @SerializedName("resourceLocationId")
  private Integer resourceLocationId = null;

  @SerializedName("consumedServiceId")
  private Integer consumedServiceId = null;

  @SerializedName("departmentId")
  private Integer departmentId = null;

  @SerializedName("accountOwnerEmail")
  private String accountOwnerEmail = null;

  @SerializedName("accountName")
  private String accountName = null;

  @SerializedName("serviceAdministratorId")
  private String serviceAdministratorId = null;

  @SerializedName("subscriptionId")
  private Long subscriptionId = null;

  @SerializedName("subscriptionGuid")
  private String subscriptionGuid = null;

  @SerializedName("subscriptionName")
  private String subscriptionName = null;

  @SerializedName("date")
  private DateTime date = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("meterId")
  private String meterId = null;

  @SerializedName("meterCategory")
  private String meterCategory = null;

  @SerializedName("meterSubCategory")
  private String meterSubCategory = null;

  @SerializedName("meterRegion")
  private String meterRegion = null;

  @SerializedName("meterName")
  private String meterName = null;

  @SerializedName("consumedQuantity")
  private Double consumedQuantity = null;

  @SerializedName("resourceRate")
  private Double resourceRate = null;

  @SerializedName("resourceLocation")
  private String resourceLocation = null;

  @SerializedName("consumedService")
  private String consumedService = null;

  @SerializedName("instanceId")
  private String instanceId = null;

  @SerializedName("serviceInfo1")
  private String serviceInfo1 = null;

  @SerializedName("serviceInfo2")
  private String serviceInfo2 = null;

  @SerializedName("additionalInfo")
  private String additionalInfo = null;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("storeServiceIdentifier")
  private String storeServiceIdentifier = null;

  @SerializedName("departmentName")
  private String departmentName = null;

  @SerializedName("costCenter")
  private String costCenter = null;

  @SerializedName("unitOfMeasure")
  private String unitOfMeasure = null;

  @SerializedName("resourceGroup")
  private String resourceGroup = null;

  public UsageDetailsDeNormalized cost(Double cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(value = "")
  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public UsageDetailsDeNormalized accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public UsageDetailsDeNormalized productId(Integer productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public UsageDetailsDeNormalized resourceLocationId(Integer resourceLocationId) {
    this.resourceLocationId = resourceLocationId;
    return this;
  }

   /**
   * Get resourceLocationId
   * @return resourceLocationId
  **/
  @ApiModelProperty(value = "")
  public Integer getResourceLocationId() {
    return resourceLocationId;
  }

  public void setResourceLocationId(Integer resourceLocationId) {
    this.resourceLocationId = resourceLocationId;
  }

  public UsageDetailsDeNormalized consumedServiceId(Integer consumedServiceId) {
    this.consumedServiceId = consumedServiceId;
    return this;
  }

   /**
   * Get consumedServiceId
   * @return consumedServiceId
  **/
  @ApiModelProperty(value = "")
  public Integer getConsumedServiceId() {
    return consumedServiceId;
  }

  public void setConsumedServiceId(Integer consumedServiceId) {
    this.consumedServiceId = consumedServiceId;
  }

  public UsageDetailsDeNormalized departmentId(Integer departmentId) {
    this.departmentId = departmentId;
    return this;
  }

   /**
   * Get departmentId
   * @return departmentId
  **/
  @ApiModelProperty(value = "")
  public Integer getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(Integer departmentId) {
    this.departmentId = departmentId;
  }

  public UsageDetailsDeNormalized accountOwnerEmail(String accountOwnerEmail) {
    this.accountOwnerEmail = accountOwnerEmail;
    return this;
  }

   /**
   * Get accountOwnerEmail
   * @return accountOwnerEmail
  **/
  @ApiModelProperty(value = "")
  public String getAccountOwnerEmail() {
    return accountOwnerEmail;
  }

  public void setAccountOwnerEmail(String accountOwnerEmail) {
    this.accountOwnerEmail = accountOwnerEmail;
  }

  public UsageDetailsDeNormalized accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @ApiModelProperty(value = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public UsageDetailsDeNormalized serviceAdministratorId(String serviceAdministratorId) {
    this.serviceAdministratorId = serviceAdministratorId;
    return this;
  }

   /**
   * Get serviceAdministratorId
   * @return serviceAdministratorId
  **/
  @ApiModelProperty(value = "")
  public String getServiceAdministratorId() {
    return serviceAdministratorId;
  }

  public void setServiceAdministratorId(String serviceAdministratorId) {
    this.serviceAdministratorId = serviceAdministratorId;
  }

  public UsageDetailsDeNormalized subscriptionId(Long subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @ApiModelProperty(value = "")
  public Long getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(Long subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public UsageDetailsDeNormalized subscriptionGuid(String subscriptionGuid) {
    this.subscriptionGuid = subscriptionGuid;
    return this;
  }

   /**
   * Get subscriptionGuid
   * @return subscriptionGuid
  **/
  @ApiModelProperty(value = "")
  public String getSubscriptionGuid() {
    return subscriptionGuid;
  }

  public void setSubscriptionGuid(String subscriptionGuid) {
    this.subscriptionGuid = subscriptionGuid;
  }

  public UsageDetailsDeNormalized subscriptionName(String subscriptionName) {
    this.subscriptionName = subscriptionName;
    return this;
  }

   /**
   * Get subscriptionName
   * @return subscriptionName
  **/
  @ApiModelProperty(value = "")
  public String getSubscriptionName() {
    return subscriptionName;
  }

  public void setSubscriptionName(String subscriptionName) {
    this.subscriptionName = subscriptionName;
  }

  public UsageDetailsDeNormalized date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public UsageDetailsDeNormalized product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public UsageDetailsDeNormalized meterId(String meterId) {
    this.meterId = meterId;
    return this;
  }

   /**
   * Get meterId
   * @return meterId
  **/
  @ApiModelProperty(value = "")
  public String getMeterId() {
    return meterId;
  }

  public void setMeterId(String meterId) {
    this.meterId = meterId;
  }

  public UsageDetailsDeNormalized meterCategory(String meterCategory) {
    this.meterCategory = meterCategory;
    return this;
  }

   /**
   * Get meterCategory
   * @return meterCategory
  **/
  @ApiModelProperty(value = "")
  public String getMeterCategory() {
    return meterCategory;
  }

  public void setMeterCategory(String meterCategory) {
    this.meterCategory = meterCategory;
  }

  public UsageDetailsDeNormalized meterSubCategory(String meterSubCategory) {
    this.meterSubCategory = meterSubCategory;
    return this;
  }

   /**
   * Get meterSubCategory
   * @return meterSubCategory
  **/
  @ApiModelProperty(value = "")
  public String getMeterSubCategory() {
    return meterSubCategory;
  }

  public void setMeterSubCategory(String meterSubCategory) {
    this.meterSubCategory = meterSubCategory;
  }

  public UsageDetailsDeNormalized meterRegion(String meterRegion) {
    this.meterRegion = meterRegion;
    return this;
  }

   /**
   * Get meterRegion
   * @return meterRegion
  **/
  @ApiModelProperty(value = "")
  public String getMeterRegion() {
    return meterRegion;
  }

  public void setMeterRegion(String meterRegion) {
    this.meterRegion = meterRegion;
  }

  public UsageDetailsDeNormalized meterName(String meterName) {
    this.meterName = meterName;
    return this;
  }

   /**
   * Get meterName
   * @return meterName
  **/
  @ApiModelProperty(value = "")
  public String getMeterName() {
    return meterName;
  }

  public void setMeterName(String meterName) {
    this.meterName = meterName;
  }

  public UsageDetailsDeNormalized consumedQuantity(Double consumedQuantity) {
    this.consumedQuantity = consumedQuantity;
    return this;
  }

   /**
   * Get consumedQuantity
   * @return consumedQuantity
  **/
  @ApiModelProperty(value = "")
  public Double getConsumedQuantity() {
    return consumedQuantity;
  }

  public void setConsumedQuantity(Double consumedQuantity) {
    this.consumedQuantity = consumedQuantity;
  }

  public UsageDetailsDeNormalized resourceRate(Double resourceRate) {
    this.resourceRate = resourceRate;
    return this;
  }

   /**
   * Get resourceRate
   * @return resourceRate
  **/
  @ApiModelProperty(value = "")
  public Double getResourceRate() {
    return resourceRate;
  }

  public void setResourceRate(Double resourceRate) {
    this.resourceRate = resourceRate;
  }

  public UsageDetailsDeNormalized resourceLocation(String resourceLocation) {
    this.resourceLocation = resourceLocation;
    return this;
  }

   /**
   * Get resourceLocation
   * @return resourceLocation
  **/
  @ApiModelProperty(value = "")
  public String getResourceLocation() {
    return resourceLocation;
  }

  public void setResourceLocation(String resourceLocation) {
    this.resourceLocation = resourceLocation;
  }

  public UsageDetailsDeNormalized consumedService(String consumedService) {
    this.consumedService = consumedService;
    return this;
  }

   /**
   * Get consumedService
   * @return consumedService
  **/
  @ApiModelProperty(value = "")
  public String getConsumedService() {
    return consumedService;
  }

  public void setConsumedService(String consumedService) {
    this.consumedService = consumedService;
  }

  public UsageDetailsDeNormalized instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @ApiModelProperty(value = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public UsageDetailsDeNormalized serviceInfo1(String serviceInfo1) {
    this.serviceInfo1 = serviceInfo1;
    return this;
  }

   /**
   * Get serviceInfo1
   * @return serviceInfo1
  **/
  @ApiModelProperty(value = "")
  public String getServiceInfo1() {
    return serviceInfo1;
  }

  public void setServiceInfo1(String serviceInfo1) {
    this.serviceInfo1 = serviceInfo1;
  }

  public UsageDetailsDeNormalized serviceInfo2(String serviceInfo2) {
    this.serviceInfo2 = serviceInfo2;
    return this;
  }

   /**
   * Get serviceInfo2
   * @return serviceInfo2
  **/
  @ApiModelProperty(value = "")
  public String getServiceInfo2() {
    return serviceInfo2;
  }

  public void setServiceInfo2(String serviceInfo2) {
    this.serviceInfo2 = serviceInfo2;
  }

  public UsageDetailsDeNormalized additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public UsageDetailsDeNormalized tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public UsageDetailsDeNormalized storeServiceIdentifier(String storeServiceIdentifier) {
    this.storeServiceIdentifier = storeServiceIdentifier;
    return this;
  }

   /**
   * Get storeServiceIdentifier
   * @return storeServiceIdentifier
  **/
  @ApiModelProperty(value = "")
  public String getStoreServiceIdentifier() {
    return storeServiceIdentifier;
  }

  public void setStoreServiceIdentifier(String storeServiceIdentifier) {
    this.storeServiceIdentifier = storeServiceIdentifier;
  }

  public UsageDetailsDeNormalized departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

   /**
   * Get departmentName
   * @return departmentName
  **/
  @ApiModelProperty(value = "")
  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public UsageDetailsDeNormalized costCenter(String costCenter) {
    this.costCenter = costCenter;
    return this;
  }

   /**
   * Get costCenter
   * @return costCenter
  **/
  @ApiModelProperty(value = "")
  public String getCostCenter() {
    return costCenter;
  }

  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }

  public UsageDetailsDeNormalized unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

   /**
   * Get unitOfMeasure
   * @return unitOfMeasure
  **/
  @ApiModelProperty(value = "")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public UsageDetailsDeNormalized resourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
    return this;
  }

   /**
   * Get resourceGroup
   * @return resourceGroup
  **/
  @ApiModelProperty(value = "")
  public String getResourceGroup() {
    return resourceGroup;
  }

  public void setResourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageDetailsDeNormalized usageDetailsDeNormalized = (UsageDetailsDeNormalized) o;
    return Objects.equals(this.cost, usageDetailsDeNormalized.cost) &&
        Objects.equals(this.accountId, usageDetailsDeNormalized.accountId) &&
        Objects.equals(this.productId, usageDetailsDeNormalized.productId) &&
        Objects.equals(this.resourceLocationId, usageDetailsDeNormalized.resourceLocationId) &&
        Objects.equals(this.consumedServiceId, usageDetailsDeNormalized.consumedServiceId) &&
        Objects.equals(this.departmentId, usageDetailsDeNormalized.departmentId) &&
        Objects.equals(this.accountOwnerEmail, usageDetailsDeNormalized.accountOwnerEmail) &&
        Objects.equals(this.accountName, usageDetailsDeNormalized.accountName) &&
        Objects.equals(this.serviceAdministratorId, usageDetailsDeNormalized.serviceAdministratorId) &&
        Objects.equals(this.subscriptionId, usageDetailsDeNormalized.subscriptionId) &&
        Objects.equals(this.subscriptionGuid, usageDetailsDeNormalized.subscriptionGuid) &&
        Objects.equals(this.subscriptionName, usageDetailsDeNormalized.subscriptionName) &&
        Objects.equals(this.date, usageDetailsDeNormalized.date) &&
        Objects.equals(this.product, usageDetailsDeNormalized.product) &&
        Objects.equals(this.meterId, usageDetailsDeNormalized.meterId) &&
        Objects.equals(this.meterCategory, usageDetailsDeNormalized.meterCategory) &&
        Objects.equals(this.meterSubCategory, usageDetailsDeNormalized.meterSubCategory) &&
        Objects.equals(this.meterRegion, usageDetailsDeNormalized.meterRegion) &&
        Objects.equals(this.meterName, usageDetailsDeNormalized.meterName) &&
        Objects.equals(this.consumedQuantity, usageDetailsDeNormalized.consumedQuantity) &&
        Objects.equals(this.resourceRate, usageDetailsDeNormalized.resourceRate) &&
        Objects.equals(this.resourceLocation, usageDetailsDeNormalized.resourceLocation) &&
        Objects.equals(this.consumedService, usageDetailsDeNormalized.consumedService) &&
        Objects.equals(this.instanceId, usageDetailsDeNormalized.instanceId) &&
        Objects.equals(this.serviceInfo1, usageDetailsDeNormalized.serviceInfo1) &&
        Objects.equals(this.serviceInfo2, usageDetailsDeNormalized.serviceInfo2) &&
        Objects.equals(this.additionalInfo, usageDetailsDeNormalized.additionalInfo) &&
        Objects.equals(this.tags, usageDetailsDeNormalized.tags) &&
        Objects.equals(this.storeServiceIdentifier, usageDetailsDeNormalized.storeServiceIdentifier) &&
        Objects.equals(this.departmentName, usageDetailsDeNormalized.departmentName) &&
        Objects.equals(this.costCenter, usageDetailsDeNormalized.costCenter) &&
        Objects.equals(this.unitOfMeasure, usageDetailsDeNormalized.unitOfMeasure) &&
        Objects.equals(this.resourceGroup, usageDetailsDeNormalized.resourceGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, accountId, productId, resourceLocationId, consumedServiceId, departmentId, accountOwnerEmail, accountName, serviceAdministratorId, subscriptionId, subscriptionGuid, subscriptionName, date, product, meterId, meterCategory, meterSubCategory, meterRegion, meterName, consumedQuantity, resourceRate, resourceLocation, consumedService, instanceId, serviceInfo1, serviceInfo2, additionalInfo, tags, storeServiceIdentifier, departmentName, costCenter, unitOfMeasure, resourceGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageDetailsDeNormalized {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    resourceLocationId: ").append(toIndentedString(resourceLocationId)).append("\n");
    sb.append("    consumedServiceId: ").append(toIndentedString(consumedServiceId)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    accountOwnerEmail: ").append(toIndentedString(accountOwnerEmail)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    serviceAdministratorId: ").append(toIndentedString(serviceAdministratorId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionGuid: ").append(toIndentedString(subscriptionGuid)).append("\n");
    sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    meterId: ").append(toIndentedString(meterId)).append("\n");
    sb.append("    meterCategory: ").append(toIndentedString(meterCategory)).append("\n");
    sb.append("    meterSubCategory: ").append(toIndentedString(meterSubCategory)).append("\n");
    sb.append("    meterRegion: ").append(toIndentedString(meterRegion)).append("\n");
    sb.append("    meterName: ").append(toIndentedString(meterName)).append("\n");
    sb.append("    consumedQuantity: ").append(toIndentedString(consumedQuantity)).append("\n");
    sb.append("    resourceRate: ").append(toIndentedString(resourceRate)).append("\n");
    sb.append("    resourceLocation: ").append(toIndentedString(resourceLocation)).append("\n");
    sb.append("    consumedService: ").append(toIndentedString(consumedService)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    serviceInfo1: ").append(toIndentedString(serviceInfo1)).append("\n");
    sb.append("    serviceInfo2: ").append(toIndentedString(serviceInfo2)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    storeServiceIdentifier: ").append(toIndentedString(storeServiceIdentifier)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    resourceGroup: ").append(toIndentedString(resourceGroup)).append("\n");
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

