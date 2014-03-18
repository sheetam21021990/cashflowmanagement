package com.cashflowmanagement.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.cashflowmanagement.form.CashSale;


/**
 * The persistent class for the sale_of_others database table.
 * 
 */
public class SaleOfOtherVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private int billNo;
	
	private String partyName;
	
	private BigDecimal saleAmount;

	private BigDecimal taxAmount;

	private Date date;

	private CashSale cashSale;

	public SaleOfOtherVo() {
	}
	
	

	public SaleOfOtherVo(int slNo, int billNo, String partyName, BigDecimal saleAmount, BigDecimal taxAmount, Date date) {
		this.slNo = slNo;
		this.billNo = billNo;
		this.partyName = partyName;
		this.saleAmount = saleAmount;
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

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPartyName() {
		return this.partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public BigDecimal getSaleAmount() {
		return this.saleAmount;
	}

	public void setSaleAmount(BigDecimal saleAmount) {
		this.saleAmount = saleAmount;
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