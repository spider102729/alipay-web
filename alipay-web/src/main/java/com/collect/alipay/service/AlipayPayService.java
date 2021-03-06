package com.collect.alipay.service;

import javax.jws.WebService;

import com.collect.alipay.domain.CancelRequest;
import com.collect.alipay.domain.CancelResponse;
import com.collect.alipay.domain.CloseRequest;
import com.collect.alipay.domain.CloseResponse;
import com.collect.alipay.domain.CreateandpayRequest;
import com.collect.alipay.domain.CreateandpayResponse;
import com.collect.alipay.domain.PrecreateRequest;
import com.collect.alipay.domain.PrecreateResponse;
import com.collect.alipay.domain.QueryRequest;
import com.collect.alipay.domain.QueryResponse;
import com.collect.alipay.domain.RefundRequest;
import com.collect.alipay.domain.RefundResponse;

@WebService
public interface AlipayPayService {

	/**
	 * 通过唯一商品号查询订单状态
	 * 
	 * @param tradeNo
	 * @return
	 */
	public QueryResponse alipayQuery(QueryRequest queryRequest);

	/**
	 * 统一预下单接口
	 * 
	 * @param precreateRequest
	 * @return
	 */
	public PrecreateResponse alipayPrecreate(PrecreateRequest precreateRequest);

	/**
	 * 统一预下单返回图片地址
	 * 
	 * @return
	 */
	public PrecreateResponse alipayPrecreatePic(PrecreateRequest precreateRequest);

	/**
	 * 统一预下单返回图片数组
	 * 
	 * @param precreateRequest
	 * @return
	 */
	public PrecreateResponse alipayPrecreatePicArray(PrecreateRequest precreateRequest);

	/**
	 * 统一预下单并支付
	 * 
	 * @param createandpayRequest
	 * @return
	 */
	public CreateandpayResponse alipayCreateandPay(CreateandpayRequest createandpayRequest);

	/**
	 * 商户可对已经存在且交易状态为待付款的的交易进行关闭
	 * 
	 * @param closeResponse
	 * @return
	 */
	public CloseResponse alipayClose(CloseRequest closeRequest);

	/**
	 * 商户可撤销已经存在的交易。 如果交易不存在,直接返回撤销成功; 如果交易存在,且交易状态为待付款,则关闭交易; 
	 * 如果交易存在,切交易状态为已付款,则对交易进行全额退款;  如果交易存在,且交易状态为成功结束,无法进行逆向资金操作,则返回撤销失败。
	 * 
	 * @param cancelRequest
	 * @return
	 */
	public CancelResponse alipayCancel(CancelRequest cancelRequest);

	/**
	 * 退款请求
	 * 
	 * @param refundRequest
	 * @return
	 */
	public RefundResponse alipayRefund(RefundRequest refundRequest);


}
