package com.cashflowmanagement.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the cash_expenditure database table.
 * 
 */
public class CashExpenditureVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private String particulars;

	private BigDecimal amount;

	private Date date;

	public CashExpenditureVo() {
	}

	public CashExpenditureVo(int slNo, String particulars, BigDecimal amount, Date date) {
		this.slNo = slNo;
		this.particulars = particulars;
		this.amount = amount;
		this.date = date;
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

	public String getParticulars() {
		return this.particulars;
	}

	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}

}