package com.collect.alipay.domain;

import java.io.Serializable;

public class QueryResponse implements Serializable{

	private static final long serialVersionUID = 6217991382035064230L;
	
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
	 * 买家支付宝账号,可以是 Email 或手机号码。
	 */
	private String buyerLogonId;
	
	/**
	 * 买家支付宝账号对应的支付宝唯一用户号。
	 * 以 2088 开头的纯 16 位数字。
	 */
	private String buyerUserId;
	
	/**
	 * 合作者身份ID
	 */
	private String partner;
	
	/**
	 * 交易目前所处的状态
	 * WAIT_BUYER_PAY 交易创建,等待买家付款。
	 * TRADE_CLOSED 在指定时间段内未支付时关闭的交易;   在交易完成全额退款成功时关闭的交易。
	 * TRADE_SUCCESS 交易成功,且可对该交易做操作,如:多级分润、退款等。
	 * TRADE_PENDING 等待卖家收款(买家付款后,如果卖家账号被冻结)。
	 * TRADE_FINISHED￼交易成功且结束,即不可再做任何操作。
	 */
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
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

	public String getBuyerLogonId() {
		return buyerLogonId;
	}

	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}

	public String getBuyerUserId() {
		return buyerUserId;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}


	
}
