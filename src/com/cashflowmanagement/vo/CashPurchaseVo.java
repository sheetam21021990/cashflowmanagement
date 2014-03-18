package com.cashflowmanagement.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.cashflowmanagement.form.CashSale;


/**
 * The persistent class for the cash_purchase database table.
 * 
 */
public class CashPurchaseVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private int billNo;

	private BigDecimal amount;

	private BigDecimal taxAmount;
	
	private Date date;

	private CashSale cashSale;

	public CashPurchaseVo() {
	}

	
	
	public CashPurchaseVo(int slNo, int billNo, BigDecimal amount, BigDecimal taxAmount, Date date) {
		this.slNo = slNo;
		this.billNo = billNo;
		this.amount = amount;
		this.taxAmount = taxAmount;
		this.date = date;
	}



	public int getBillNo() {
		return billNo;
	}



	public void setBillNo(int billNo) {
		this.billNo = billNo;
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

}