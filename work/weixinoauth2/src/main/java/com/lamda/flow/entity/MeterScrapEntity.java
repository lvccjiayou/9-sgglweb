package com.lamda.flow.entity;

import org.springframework.stereotype.Component;

/**   
 * @Title: Entity
 * @Description: 量仪报废
 * @author onlineGenerator
 * @date 2020-10-20 13:28:22
 * @version V1.0   
 *
 */
@Component
@SuppressWarnings("serial")
public class MeterScrapEntity implements java.io.Serializable {
	/**主键*/
	private String id;
	/**基地*/
	private String company;
	private String area;
	private String factory;
	private String line;
	private String meterNo;
	private String materialCode;
	private String materialName;
	private String model;
	private String productionDate;
	private String supplierName;
	private String applyById;
	private String applyByName;
	private String applyByTime;

	private String scrapProject;
	private String reason;
	private String sureById;
	private String sureByName;
	private String sureByTime;
	private String sureRemark;
	private String scrapResult;
	private String standardToolNumber;
	private String standardToolName;
	private String status;
	private String remark;
	private String bpmStatus;
	private String flowName;
	private String flowId;

	private String verifyById;
	private String verifyByName;
	private String verifyByTime;
	private String verifyRemark;

	private String meterId;

	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	public String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(String id){
		this.id = id;
	}

	public String getCompany(){
		return this.company;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  基地
	 */
	public void setCompany(String company){
		this.company = company;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getApplyById() {
		return applyById;
	}

	public void setApplyById(String applyById) {
		this.applyById = applyById;
	}

	public String getApplyByName() {
		return applyByName;
	}

	public void setApplyByName(String applyByName) {
		this.applyByName = applyByName;
	}

	public String getApplyByTime() {
		return applyByTime;
	}

	public void setApplyByTime(String applyByTime) {
		this.applyByTime = applyByTime;
	}


	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  量仪条码
	 */

	public String getMeterNo(){
		return this.meterNo;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  量仪条码
	 */
	public void setMeterNo(String meterNo){
		this.meterNo = meterNo;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  物料编码
	 */

	public String getMaterialCode(){
		return this.materialCode;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  物料编码
	 */
	public void setMaterialCode(String materialCode){
		this.materialCode = materialCode;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  量仪名称
	 */

	public String getMaterialName(){
		return this.materialName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  量仪名称
	 */
	public void setMaterialName(String materialName){
		this.materialName = materialName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  量仪规格
	 */

	public String getModel(){
		return this.model;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  量仪规格
	 */
	public void setModel(String model){
		this.model = model;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  生产日期
	 */

	public String getProductionDate(){
		return this.productionDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  生产日期
	 */
	public void setProductionDate(String productionDate){
		this.productionDate = productionDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  量仪厂家
	 */

	public String getSupplierName(){
		return this.supplierName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  量仪厂家
	 */
	public void setSupplierName(String supplierName){
		this.supplierName = supplierName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  检定结果
	 */

	public String getScrapProject() {
		return scrapProject;
	}

	public void setScrapProject(String scrapProject) {
		this.scrapProject = scrapProject;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSureById() {
		return sureById;
	}

	public void setSureById(String sureById) {
		this.sureById = sureById;
	}

	public String getSureByName() {
		return sureByName;
	}

	public void setSureByName(String sureByName) {
		this.sureByName = sureByName;
	}

	public String getSureByTime() {
		return sureByTime;
	}

	public void setSureByTime(String sureByTime) {
		this.sureByTime = sureByTime;
	}

	public String getStandardToolNumber() {
		return standardToolNumber;
	}

	public void setStandardToolNumber(String standardToolNumber) {
		this.standardToolNumber = standardToolNumber;
	}

	public String getStandardToolName() {
		return standardToolName;
	}

	public void setStandardToolName(String standardToolName) {
		this.standardToolName = standardToolName;
	}


	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  状态
	 */

	public String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  状态
	 */
	public void setStatus(String status){
		this.status = status;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */

	public String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  流程状态
	 */

	public String getBpmStatus(){
		return this.bpmStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流程状态
	 */
	public void setBpmStatus(String bpmStatus){
		this.bpmStatus = bpmStatus;
	}

	public String getFlowId() {
		return flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}


	public String getFlowName() {
		return flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}

	public String getMeterId() {
		return meterId;
	}

	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

	public String getSureRemark() {
		return sureRemark;
	}

	public void setSureRemark(String sureRemark) {
		this.sureRemark = sureRemark;
	}

	public String getScrapResult() {
		return scrapResult;
	}

	public void setScrapResult(String scrapResult) {
		this.scrapResult = scrapResult;
	}

	public String getVerifyById() {
		return verifyById;
	}

	public void setVerifyById(String verifyById) {
		this.verifyById = verifyById;
	}

	public String getVerifyByName() {
		return verifyByName;
	}

	public void setVerifyByName(String verifyByName) {
		this.verifyByName = verifyByName;
	}

	public String getVerifyByTime() {
		return verifyByTime;
	}

	public void setVerifyByTime(String verifyByTime) {
		this.verifyByTime = verifyByTime;
	}

	public String getVerifyRemark() {
		return verifyRemark;
	}

	public void setVerifyRemark(String verifyRemark) {
		this.verifyRemark = verifyRemark;
	}

	@Override
	public String toString() {
		return "MeterScrapEntity{" +
				"id='" + id + '\'' +
				", company='" + company + '\'' +
				", area='" + area + '\'' +
				", factory='" + factory + '\'' +
				", line='" + line + '\'' +
				", meterNo='" + meterNo + '\'' +
				", materialCode='" + materialCode + '\'' +
				", materialName='" + materialName + '\'' +
				", model='" + model + '\'' +
				", productionDate='" + productionDate + '\'' +
				", supplierName='" + supplierName + '\'' +
				", applyById='" + applyById + '\'' +
				", applyByName='" + applyByName + '\'' +
				", applyByTime='" + applyByTime + '\'' +
				", scrapProject='" + scrapProject + '\'' +
				", reason='" + reason + '\'' +
				", sureById='" + sureById + '\'' +
				", sureByName='" + sureByName + '\'' +
				", sureByTime='" + sureByTime + '\'' +
				", sureRemark='" + sureRemark + '\'' +
				", scrapResult='" + scrapResult + '\'' +
				", standardToolNumber='" + standardToolNumber + '\'' +
				", standardToolName='" + standardToolName + '\'' +
				", status='" + status + '\'' +
				", remark='" + remark + '\'' +
				", bpmStatus='" + bpmStatus + '\'' +
				", flowName='" + flowName + '\'' +
				", flowId='" + flowId + '\'' +
				", verifyById='" + verifyById + '\'' +
				", verifyByName='" + verifyByName + '\'' +
				", verifyByTime='" + verifyByTime + '\'' +
				", verifyRemark='" + verifyRemark + '\'' +
				", meterId='" + meterId + '\'' +
				'}';
	}
}