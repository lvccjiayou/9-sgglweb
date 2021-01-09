package com.lamda.flow.entity;


import org.springframework.stereotype.Component;

/**
 * @Title: Entity
 * @Description: 量仪校对
 * @author onlineGenerator
 * @date 2020-10-20 13:28:22
 * @version V1.0   
 *
 */
@Component
@SuppressWarnings("serial")
public class MeterAdjustEntity implements java.io.Serializable {
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
	private String standardToolNumber;
	private String standardToolName;
	private String applyById;
	private String applyByName;
	private String applyByTime;

	private String checkProject;
	private String reason;

	private String checkById;
	private String checkByName;
	private String checkByTime;
	private String checkRemark;
	private String checkResult;

	private String repairById;
	private String repairByName;
	private String repairByTime;
	private String repairRemark;
	private String repairResult;

	private String bossById;
	private String bossByName;
	private String bossByTime;
	private String bossRemark;
	private String bossResult;

	private String remark;
	private String bpmStatus;
	private String flowName;
	private String flowId;

	private String meterId;

	private String triggerId;

	
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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

	public String getCheckProject() {
		return checkProject;
	}

	public void setCheckProject(String checkProject) {
		this.checkProject = checkProject;
	}

	public String getCheckById() {
		return checkById;
	}

	public void setCheckById(String checkById) {
		this.checkById = checkById;
	}

	public String getCheckByName() {
		return checkByName;
	}

	public void setCheckByName(String checkByName) {
		this.checkByName = checkByName;
	}

	public String getCheckByTime() {
		return checkByTime;
	}

	public void setCheckByTime(String checkByTime) {
		this.checkByTime = checkByTime;
	}

	public String getCheckRemark() {
		return checkRemark;
	}

	public void setCheckRemark(String checkRemark) {
		this.checkRemark = checkRemark;
	}

	public String getCheckResult() {
		return checkResult;
	}

	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}

	public String getRepairById() {
		return repairById;
	}

	public void setRepairById(String repairById) {
		this.repairById = repairById;
	}

	public String getRepairByName() {
		return repairByName;
	}

	public void setRepairByName(String repairByName) {
		this.repairByName = repairByName;
	}

	public String getRepairByTime() {
		return repairByTime;
	}

	public void setRepairByTime(String repairByTime) {
		this.repairByTime = repairByTime;
	}

	public String getRepairRemark() {
		return repairRemark;
	}

	public void setRepairRemark(String repairRemark) {
		this.repairRemark = repairRemark;
	}

	public String getRepairResult() {
		return repairResult;
	}

	public void setRepairResult(String repairResult) {
		this.repairResult = repairResult;
	}

	public String getTriggerId() {
		return triggerId;
	}

	public void setTriggerId(String triggerId) {
		this.triggerId = triggerId;
	}

	public String getBossById() {
		return bossById;
	}

	public void setBossById(String bossById) {
		this.bossById = bossById;
	}

	public String getBossByName() {
		return bossByName;
	}

	public void setBossByName(String bossByName) {
		this.bossByName = bossByName;
	}

	public String getBossByTime() {
		return bossByTime;
	}

	public void setBossByTime(String bossByTime) {
		this.bossByTime = bossByTime;
	}

	public String getBossRemark() {
		return bossRemark;
	}

	public void setBossRemark(String bossRemark) {
		this.bossRemark = bossRemark;
	}

	public String getBossResult() {
		return bossResult;
	}

	public void setBossResult(String bossResult) {
		this.bossResult = bossResult;
	}

	@Override
	public String toString() {
		return "MeterAdjustEntity{" +
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
				", standardToolNumber='" + standardToolNumber + '\'' +
				", standardToolName='" + standardToolName + '\'' +
				", applyById='" + applyById + '\'' +
				", applyByName='" + applyByName + '\'' +
				", applyByTime='" + applyByTime + '\'' +
				", checkProject='" + checkProject + '\'' +
				", reason='" + reason + '\'' +
				", checkById='" + checkById + '\'' +
				", checkByName='" + checkByName + '\'' +
				", checkByTime='" + checkByTime + '\'' +
				", checkRemark='" + checkRemark + '\'' +
				", checkResult='" + checkResult + '\'' +
				", repairById='" + repairById + '\'' +
				", repairByName='" + repairByName + '\'' +
				", repairByTime='" + repairByTime + '\'' +
				", repairRemark='" + repairRemark + '\'' +
				", repairResult='" + repairResult + '\'' +
				", bossById='" + bossById + '\'' +
				", bossByName='" + bossByName + '\'' +
				", bossByTime='" + bossByTime + '\'' +
				", bossRemark='" + bossRemark + '\'' +
				", bossResult='" + bossResult + '\'' +
				", remark='" + remark + '\'' +
				", bpmStatus='" + bpmStatus + '\'' +
				", flowName='" + flowName + '\'' +
				", flowId='" + flowId + '\'' +
				", meterId='" + meterId + '\'' +
				", triggerId='" + triggerId + '\'' +
				'}';
	}
}