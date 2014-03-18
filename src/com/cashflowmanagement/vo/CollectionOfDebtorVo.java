package com.cashflowmanagement.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the collection_of_debtors database table.
 * 
 */
public class CollectionOfDebtorVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private BigDecimal payment;

	private BigDecimal amount;

	private Date date;


	public CollectionOfDebtorVo(int slNo, BigDecimal payment, BigDecimal amount, Date date) {
		this.slNo = slNo;
		this.payment = payment;
		this.amount = amount;
		this.date = date;
	}

	public CollectionOfDebtorVo() {
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

	public BigDecimal getPayment() {
		return this.payment;
	}

	public void setPayment(BigDecimal payment) {
		this.payment = payment;
	}

}