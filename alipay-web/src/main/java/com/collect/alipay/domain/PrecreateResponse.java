package com.collect.alipay.domain;

import java.io.Serializable;

public class PrecreateResponse implements Serializable{

	private static final long serialVersionUID = -7369224341469907641L;
	
	/**
	 * 请求是否成功。请求成功不代表业务处理成功。
	 * T代表成功   F代表失败 
	 */
	private String success;
	
	/**
	 * 请求成功时,不存在本参 数; 请求失败时,本参数为错误 代码,参见“10.2 接入错 误码”和“10.3 系统错误 码”。
	 */
	private String error;

	/**
	 * 预下单处理结果响应码。SUCCESS:预下单成功   FAIL:预下单失败  UNKNOWN:结果未知
	 */
	private String resultCode;

	/**
	 * 对应商户网站的订单系统中的 唯一订单号,非支付宝交易号。需保证在商户网站中的唯一性。是请求时对应的参数,原样返回。
	 */
	private String outTradeNo;
	
	/**
	 * 二维码码串的内容。
	 */
	private String qrCode;
	
	private String picUrl;
	
	private String bigPicUrl;
	
	private String smallPicUrl;
	
	/**
	 * 详细错误码
	 */
	private String detailErrorCode;
	
	/**
	 * 详细错误 描述
	 */
	private String detailErrorDesc;
	
	/**
	 * 凭证类型,目前仅支持 qrcode (二维码)。
	 */
	private String voucherType;
	
	private String bigPicArray;
	
	private String bigPicLocal;
	
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

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getBigPicUrl() {
		return bigPicUrl;
	}

	public void setBigPicUrl(String bigPicUrl) {
		this.bigPicUrl = bigPicUrl;
	}

	public String getSmallPicUrl() {
		return smallPicUrl;
	}

	public void setSmallPicUrl(String smallPicUrl) {
		this.smallPicUrl = smallPicUrl;
	}

	public String getDetailErrorCode() {
		return detailErrorCode;
	}

	public void setDetailErrorCode(String detailErrorCode) {
		this.detailErrorCode = detailErrorCode;
	}


	public String getVoucherType() {
		return voucherType;
	}

	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

	public String getDetailErrorDesc() {
		return detailErrorDesc;
	}

	public void setDetailErrorDesc(String detailErrorDesc) {
		this.detailErrorDesc = detailErrorDesc;
	}

	public String getBigPicArray() {
		return bigPicArray;
	}

	public void setBigPicArray(String bigPicArray) {
		this.bigPicArray = bigPicArray;
	}

	public String getBigPicLocal() {
		return bigPicLocal;
	}

	public void setBigPicLocal(String bigPicLocal) {
		this.bigPicLocal = bigPicLocal;
	}


	
	
}
