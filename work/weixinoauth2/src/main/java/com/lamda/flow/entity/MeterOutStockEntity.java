package com.lamda.flow.entity;

import org.springframework.stereotype.Component;

/**
 * @Title: Entity
 * @Description: 量仪出库检定
 * @author onlineGenerator
 * @date 2020-10-20 13:28:22
 * @version V1.0   
 *
 */
@Component
@SuppressWarnings("serial")
public class MeterOutStockEntity implements java.io.Serializable {
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
	private String warehouseById;
	private String warehouseByName;
	private String warehouseByTime;
	private String checkResult;
	private String checkById;
	private String checkByName;
	private String checkByTime;
	private String checkContent;
	private String bossById;
	private String bossByName;
	private String bossByTime;
	private String bossRemark;
	private String factoryWarehouseById;
	private String factoryWarehouseByName;
	private String factoryWarehouseByTime;
	private String factoryWarehouseLocation;
	private String status;
	private String remark;
	private String bpmStatus;
	private String flowName;
	private String flowId;

	private String meterId;

	private String cycleCheckId;
	
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

	public String getCheckResult(){
		return this.checkResult;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  检定结果
	 */
	public void setCheckResult(String checkResult){
		this.checkResult = checkResult;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  检定人工号
	 */

	public String getCheckById(){
		return this.checkById;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  检定人工号
	 */
	public void setCheckById(String checkById){
		this.checkById = checkById;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  检定人名称
	 */

	public String getCheckByName(){
		return this.checkByName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  检定人名称
	 */
	public void setCheckByName(String checkByName){
		this.checkByName = checkByName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  检定时间
	 */

	public String getCheckByTime(){
		return this.checkByTime;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  检定时间
	 */
	public void setCheckByTime(String checkByTime){
		this.checkByTime = checkByTime;
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

	public String getWarehouseById() {
		return warehouseById;
	}

	public void setWarehouseById(String warehouseById) {
		this.warehouseById = warehouseById;
	}

	public String getWarehouseByName() {
		return warehouseByName;
	}

	public void setWarehouseByName(String warehouseByName) {
		this.warehouseByName = warehouseByName;
	}

	public String getWarehouseByTime() {
		return warehouseByTime;
	}

	public void setWarehouseByTime(String warehouseByTime) {
		this.warehouseByTime = warehouseByTime;
	}

	public String getFlowName() {
		return flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
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

	public String getCheckContent() {
		return checkContent;
	}

	public void setCheckContent(String checkContent) {
		this.checkContent = checkContent;
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

	public String getFactoryWarehouseById() {
		return factoryWarehouseById;
	}

	public void setFactoryWarehouseById(String factoryWarehouseById) {
		this.factoryWarehouseById = factoryWarehouseById;
	}

	public String getFactoryWarehouseByName() {
		return factoryWarehouseByName;
	}

	public void setFactoryWarehouseByName(String factoryWarehouseByName) {
		this.factoryWarehouseByName = factoryWarehouseByName;
	}

	public String getFactoryWarehouseByTime() {
		return factoryWarehouseByTime;
	}

	public void setFactoryWarehouseByTime(String factoryWarehouseByTime) {
		this.factoryWarehouseByTime = factoryWarehouseByTime;
	}

	public String getFactoryWarehouseLocation() {
		return factoryWarehouseLocation;
	}

	public void setFactoryWarehouseLocation(String factoryWarehouseLocation) {
		this.factoryWarehouseLocation = factoryWarehouseLocation;
	}

	public String getMeterId() {
		return meterId;
	}

	public void setMeterId(String meterId) {
		this.meterId = meterId;
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

	public String getCycleCheckId() {
		return cycleCheckId;
	}

	public void setCycleCheckId(String cycleCheckId) {
		this.cycleCheckId = cycleCheckId;
	}

	@Override
	public String toString() {
		return "MeterOutStockEntity{" +
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
				", warehouseById='" + warehouseById + '\'' +
				", warehouseByName='" + warehouseByName + '\'' +
				", warehouseByTime='" + warehouseByTime + '\'' +
				", checkResult='" + checkResult + '\'' +
				", checkById='" + checkById + '\'' +
				", checkByName='" + checkByName + '\'' +
				", checkByTime='" + checkByTime + '\'' +
				", checkContent='" + checkContent + '\'' +
				", bossById='" + bossById + '\'' +
				", bossByName='" + bossByName + '\'' +
				", bossByTime='" + bossByTime + '\'' +
				", bossRemark='" + bossRemark + '\'' +
				", factoryWarehouseById='" + factoryWarehouseById + '\'' +
				", factoryWarehouseByName='" + factoryWarehouseByName + '\'' +
				", factoryWarehouseByTime='" + factoryWarehouseByTime + '\'' +
				", factoryWarehouseLocation='" + factoryWarehouseLocation + '\'' +
				", status='" + status + '\'' +
				", remark='" + remark + '\'' +
				", bpmStatus='" + bpmStatus + '\'' +
				", flowName='" + flowName + '\'' +
				", flowId='" + flowId + '\'' +
				", meterId='" + meterId + '\'' +
				", cycleCheckId='" + cycleCheckId + '\'' +
				'}';
	}
}