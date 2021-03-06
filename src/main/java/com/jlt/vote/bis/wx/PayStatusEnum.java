package com.jlt.vote.bis.wx;

/**
 * 支付状态
* @author Brian   
* @date 2016年3月9日 下午4:01:12
 */
public enum PayStatusEnum {
	
	/**
	 * 交易创建，等待买家付款
	 */
	WAIT_BUYER_PAY("WAIT_BUYER_PAY"),
	/**
	 * 未付款交易超时关闭，或支付完成后全额退款
	 */
	TRADE_CLOSED("TRADE_CLOSED"),
	/**
	 * 交易支付成功
	 */
	TRADE_SUCCESS("TRADE_SUCCESS"),
	/**
	 * 交易结束，不可退款
	 */
	TRADE_FINISHED("TRADE_FINISHED");
	
	private final String value;
	
	private PayStatusEnum(final String value) {
		this.value = value;
	}
	
	public String value() {
		return this.value;
	}
}
