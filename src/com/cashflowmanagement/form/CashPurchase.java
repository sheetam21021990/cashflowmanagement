package com.cashflowmanagement.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.cashflowmanagement.vo.CashPurchaseVo;


/**
 * The persistent class for the cash_purchase database table.
 * 
 */

public class CashPurchase implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private BigDecimal amount;

	private Date date;

	private BigDecimal taxAmount;

	private CashSale cashSale;

	private List<CashPurchaseVo> cashPurchaseVo;
	
	public CashPurchase() {
	}

	public int getSlNo() {
		return this.slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getTaxAmount() {
		return this.taxAmount;
	}

	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	public CashSale getCashSale() {
		return this.cashSale;
	}

	public void setCashSale(CashSale cashSale) {
		this.cashSale = cashSale;
	}

	public List<CashPurchaseVo> getCashPurchaseVo() {
		return cashPurchaseVo;
	}

	public void setCashPurchaseVo(List<CashPurchaseVo> cashPurchaseVo) {
		this.cashPurchaseVo = cashPurchaseVo;
	}

}