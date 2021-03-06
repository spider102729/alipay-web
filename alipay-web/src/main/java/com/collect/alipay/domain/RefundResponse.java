package com.collect.alipay.domain;
import java.io.Serializable;

public class RefundResponse implements Serializable{

	private static final long serialVersionUID = 2367857355523052747L;
	
	/**
	 * 请求是否成功。请求成功不代表业务处理成功。
	 * T代表成功   F代表失败 
	 */
	private String success;
	
	/**
	 * 错误代码
	 */
	private String error;

	/**
	 * 查询处理结果响应码。
      * SUCCESS:查询成功
      * FAIL:查询失败
      * PROCESS_EXCEPTION:处理异常
	 */
	private String resultCode;
	
	/**
	 * 详细错误码
	 * 当 result_code 响应码为 SUCCESS 时,不返回该参数。
	 */
	private String detailErrorCode;
	
	/**
	 * 详细错误描述
	 * 当 result_code 响应码为 SUCCESS 时,不返回该参数。
	 */
	private String detailErrorDesc;
	
	/**
	 * 商户网站唯一订单号
	 */
	private String outTradeNo;
	
	/**
	 * 该交易在支付宝系统中的交易流水号。
	 */
	private String tradeNo;
	
	/**
	 * 买家支付 宝用户号
	 */
	private String buyerUserId;
	
	/**
	 * 买家支付 宝账号
	 */
	private String buyerLogonId;
	
	/**
	 * 对同一个商户退款请求,如果该笔退款已退款过,则直接返回上一次的退款结果。同时,返回本次请求是否发生了资金变动的标识。  
	 * Y:本次退款请求发生资金 变动;
	 *   N:本次退款请求未发送资 金变动。
	 */
	private String fundChange;

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getDetailErrorCode() {
		return detailErrorCode;
	}

	public void setDetailErrorCode(String detailErrorCode) {
		this.detailErrorCode = detailErrorCode;
	}

	public String getDetailErrorDesc() {
		return detailErrorDesc;
	}

	public void setDetailErrorDesc(String detailErrorDesc) {
		this.detailErrorDesc = detailErrorDesc;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getBuyerUserId() {
		return buyerUserId;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getBuyerLogonId() {
		return buyerLogonId;
	}

	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}

	public String getFundChange() {
		return fundChange;
	}

	public void setFundChange(String fundChange) {
		this.fundChange = fundChange;
	}
	
	

}
