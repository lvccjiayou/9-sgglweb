package com.lamda.flow.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

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
public class MeterFactoryLogEntity implements java.io.Serializable {
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

	private String itemName;
	private String productCode;
	private String productName;
	private String action;

	private String operateById;
	private String operateByName;
	private String operateByTime;

	private String warehouseById;
	private String warehouseByName;
	private String warehouseByTime;
	private String warehouseRemark;

	private String location;

	private String confirmById;
	private String confirmByName;
	private String confirmByTime;
	private String confirmRemark;

	private String checkById;
	private String checkByName;

	private String remark;
	private String bpmStatus;
	private String flowName;
	private String flowId;
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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getOperateById() {
		return operateById;
	}

	public void setOperateById(String operateById) {
		this.operateById = operateById;
	}

	public String getOperateByName() {
		return operateByName;
	}

	public void setOperateByName(String operateByName) {
		this.operateByName = operateByName;
	}

	public String getOperateByTime() {
		return operateByTime;
	}

	public void setOperateByTime(String operateByTime) {
		this.operateByTime = operateByTime;
	}

	public String getWarehouseRemark() {
		return warehouseRemark;
	}

	public void setWarehouseRemark(String warehouseRemark) {
		this.warehouseRemark = warehouseRemark;
	}

	public String getConfirmById() {
		return confirmById;
	}

	public void setConfirmById(String confirmById) {
		this.confirmById = confirmById;
	}

	public String getConfirmByName() {
		return confirmByName;
	}


	public void setConfirmByName(String confirmByName) {
		this.confirmByName = confirmByName;
	}

	public String getConfirmByTime() {
		return confirmByTime;
	}

	public void setConfirmByTime(String confirmByTime) {
		this.confirmByTime = confirmByTime;
	}

	public String getConfirmRemark() {
		return confirmRemark;
	}

	public void setConfirmRemark(String confirmRemark) {
		this.confirmRemark = confirmRemark;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "MeterFactoryLogEntity{" +
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
				", itemName='" + itemName + '\'' +
				", productCode='" + productCode + '\'' +
				", productName='" + productName + '\'' +
				", action='" + action + '\'' +
				", operateById='" + operateById + '\'' +
				", operateByName='" + operateByName + '\'' +
				", operateByTime='" + operateByTime + '\'' +
				", warehouseById='" + warehouseById + '\'' +
				", warehouseByName='" + warehouseByName + '\'' +
				", warehouseByTime='" + warehouseByTime + '\'' +
				", warehouseRemark='" + warehouseRemark + '\'' +
				", location='" + location + '\'' +
				", confirmById='" + confirmById + '\'' +
				", confirmByName='" + confirmByName + '\'' +
				", confirmByTime='" + confirmByTime + '\'' +
				", confirmRemark='" + confirmRemark + '\'' +
				", checkById='" + checkById + '\'' +
				", checkByName='" + checkByName + '\'' +
				", remark='" + remark + '\'' +
				", bpmStatus='" + bpmStatus + '\'' +
				", flowName='" + flowName + '\'' +
				", flowId='" + flowId + '\'' +
				", meterId='" + meterId + '\'' +
				'}';
	}
}