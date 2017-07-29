package com.jlt.vote.bis.wx.entity;import com.xcrm.cloud.database.db.annotation.PrimaryKeyField;import com.xcrm.cloud.database.db.annotation.Table;import java.io.Serializable;import java.math.BigDecimal;import java.util.Date;@Table(tableName = "t_t_vote_pay_order")public class VotePayOrder implements Serializable {	private static final long serialVersionUID = 1L;	//field	@PrimaryKeyField	private Long id;	/**	 * 连锁店id	 */	private Long chainId;	/**	 * 用户id	 */	private Long userId;	/**	 * 礼物id	 */	private Long giftId;	/**	 * 礼物点数	 */	private Integer giftCount;	/** 	 * 支付订单号 	 */	private String payCode;	/** 	 * 支付内容 	 */	private String title;	/**	 * 支付状态 	 */	private String payStatus;	/** 	 * 订单编号 	 */	private String orderCode;	/** 	 * 支付金额 	 */	private BigDecimal payMoney;	/** 	 * 创建时间 	 */	private Date created;	/**	 * 第三方通知code 	 */	private String notifyId;	/** 	 * 交易号 	 */	private String tradeNo;	/** 	 * 交易状态 	 */	private String tradeStatus;	/** 	 * 买家用户号 	 */	private String buyerId;	/** 	 * 买家账号 	 */	private String buyerAccount;	/** 	 * 订单总金额(回调) 	 */	private BigDecimal totalFee;	/** 	 * 实收金额 	 */	private BigDecimal cashFee;	/** 	 * 支付时间 	 */	private Date payTime;	/** 	 * 付款银行 	 */	private String bankType;	/** 	 * 卖家id(微信mch_id) 	 */	private String sellerId;	/** 	 * 卖家支付宝账号 	 */	private String sellerEmail;	/** 	 * 开发者应用id 	 */	private String appId;	/** 	 * 是否关注公众账号 	 */	private String isSubscribe;	/** 	 * 删除标示 	 */	private Boolean dataStatus;		//method	public Long getId() {		return id;	}	public void setId(Long id) {		this.id = id;	}	public Long getChainId() {		return chainId;	}	public void setChainId(Long chainId) {		this.chainId = chainId;	}	public Long getUserId() {		return userId;	}	public void setUserId(Long userId) {		this.userId = userId;	}	public Long getGiftId() {		return giftId;	}	public void setGiftId(Long giftId) {		this.giftId = giftId;	}	public Integer getGiftCount() {		return giftCount;	}	public void setGiftCount(Integer giftCount) {		this.giftCount = giftCount;	}	public String getPayCode() {		return payCode;	}		public void setPayCode(String payCode) {		this.payCode = payCode;	}	public String getTitle() {		return title;	}	public void setTitle(String title) {		this.title = title;	}	public String getPayStatus() {		return payStatus;	}	public void setPayStatus(String payStatus) {		this.payStatus = payStatus;	}	public String getOrderCode() {		return orderCode;	}	public void setOrderCode(String orderCode) {		this.orderCode = orderCode;	}	public BigDecimal getPayMoney() {		return payMoney;	}	public void setPayMoney(BigDecimal payMoney) {		this.payMoney = payMoney;	}	public Date getCreated() {		return created;	}	public void setCreated(Date created) {		this.created = created;	}	public String getNotifyId() {		return notifyId;	}	public void setNotifyId(String notifyId) {		this.notifyId = notifyId;	}	public String getTradeNo() {		return tradeNo;	}	public void setTradeNo(String tradeNo) {		this.tradeNo = tradeNo;	}	public String getTradeStatus() {		return tradeStatus;	}	public void setTradeStatus(String tradeStatus) {		this.tradeStatus = tradeStatus;	}	public String getBuyerId() {		return buyerId;	}	public void setBuyerId(String buyerId) {		this.buyerId = buyerId;	}	public String getBuyerAccount() {		return buyerAccount;	}	public void setBuyerAccount(String buyerAccount) {		this.buyerAccount = buyerAccount;	}	public BigDecimal getTotalFee() {		return totalFee;	}	public void setTotalFee(BigDecimal totalFee) {		this.totalFee = totalFee;	}	public BigDecimal getCashFee() {		return cashFee;	}	public void setCashFee(BigDecimal cashFee) {		this.cashFee = cashFee;	}	public Date getPayTime() {		return payTime;	}	public void setPayTime(Date payTime) {		this.payTime = payTime;	}	public String getBankType() {		return bankType;	}	public void setBankType(String bankType) {		this.bankType = bankType;	}	public String getSellerId() {		return sellerId;	}	public void setSellerId(String sellerId) {		this.sellerId = sellerId;	}	public String getSellerEmail() {		return sellerEmail;	}	public void setSellerEmail(String sellerEmail) {		this.sellerEmail = sellerEmail;	}	public String getAppId() {		return appId;	}	public void setAppId(String appId) {		this.appId = appId;	}	public String getIsSubscribe() {		return isSubscribe;	}	public void setIsSubscribe(String isSubscribe) {		this.isSubscribe = isSubscribe;	}	public Boolean getDataStatus() {		return dataStatus;	}	public void setDataStatus(Boolean dataStatus) {		this.dataStatus = dataStatus;	}	@Override	public String toString() {		final StringBuilder sb = new StringBuilder("VotePayOrder{");		sb.append("id=").append(id);		sb.append(", chainId=").append(chainId);		sb.append(", userId=").append(userId);		sb.append(", giftId=").append(giftId);		sb.append(", giftCount=").append(giftCount);		sb.append(", payCode='").append(payCode).append('\'');		sb.append(", title='").append(title).append('\'');		sb.append(", payStatus='").append(payStatus).append('\'');		sb.append(", orderCode='").append(orderCode).append('\'');		sb.append(", payMoney=").append(payMoney);		sb.append(", created=").append(created);		sb.append(", notifyId='").append(notifyId).append('\'');		sb.append(", tradeNo='").append(tradeNo).append('\'');		sb.append(", tradeStatus='").append(tradeStatus).append('\'');		sb.append(", buyerId='").append(buyerId).append('\'');		sb.append(", buyerAccount='").append(buyerAccount).append('\'');		sb.append(", totalFee=").append(totalFee);		sb.append(", cashFee=").append(cashFee);		sb.append(", payTime=").append(payTime);		sb.append(", bankType='").append(bankType).append('\'');		sb.append(", sellerId='").append(sellerId).append('\'');		sb.append(", sellerEmail='").append(sellerEmail).append('\'');		sb.append(", appId='").append(appId).append('\'');		sb.append(", isSubscribe='").append(isSubscribe).append('\'');		sb.append(", dataStatus=").append(dataStatus);		sb.append('}');		return sb.toString();	}}