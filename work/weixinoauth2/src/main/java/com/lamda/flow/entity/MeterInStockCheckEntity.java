package com.lamda.flow.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

/**   
 * @Title: Entity
 * @Description: 量仪入库检定
 * @author onlineGenerator
 * @date 2020-10-20 13:28:22
 * @version V1.0   
 *
 */
@Component
@SuppressWarnings("serial")
public class MeterInStockCheckEntity implements java.io.Serializable {
	/**主键*/
	private String id;
	/**创建人名称*/
	private String createName;
	/**创建人工号*/
	private String createBy;
	/**创建日期*/
	private String createDate;
	/**基地*/
	private String company;
	/**量仪条码*/
	private String meterNo;
	/**物料编码*/
	private String materialCode;
	/**量仪名称*/
	private String materialName;
	/**量仪规格*/
	private String model;
	/**生产日期*/
	private String productionDate;
	/**量仪厂家*/
	private String supplierName;
	/**检定结果*/
	private String checkResult;
	/**检定人工号*/
	private String checkById;
	/**检定人名称*/
	private String checkByName;
	/**检定时间*/
	private String checkByTime;

	/**仓管员工号*/
	private String warehouseById;
	/**仓管员名称*/
	private String warehouseByName;
	/**入库时间*/
	private String warehouseByTime;

	/**状态*/
	private String status;
	/**备注*/
	private String remark;
	/**流程状态*/
	private String bpmStatus;


	private String flowName;

	private String flowId;

	private String place;

	private String location;

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
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */

	public String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人工号
	 */

	public String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人工号
	 */
	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */

	public String getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(String createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  基地
	 */

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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMeterId() {
		return meterId;
	}

	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

	@Override
	public String toString() {
		return "MeterInStockCheckEntity{" +
				"id='" + id + '\'' +
				", createName='" + createName + '\'' +
				", createBy='" + createBy + '\'' +
				", createDate=" + createDate +
				", company='" + company + '\'' +
				", meterNo='" + meterNo + '\'' +
				", materialCode='" + materialCode + '\'' +
				", materialName='" + materialName + '\'' +
				", model='" + model + '\'' +
				", productionDate='" + productionDate + '\'' +
				", supplierName='" + supplierName + '\'' +
				", checkResult='" + checkResult + '\'' +
				", checkById='" + checkById + '\'' +
				", checkByName='" + checkByName + '\'' +
				", checkByTime='" + checkByTime + '\'' +
				", warehouseById='" + warehouseById + '\'' +
				", warehouseByName='" + warehouseByName + '\'' +
				", warehouseByTime='" + warehouseByTime + '\'' +
				", status='" + status + '\'' +
				", remark='" + remark + '\'' +
				", bpmStatus='" + bpmStatus + '\'' +
				", flowName='" + flowName + '\'' +
				", flowId='" + flowId + '\'' +
				", place='" + place + '\'' +
				", location='" + location + '\'' +
				", meterId='" + meterId + '\'' +
				'}';
	}
}