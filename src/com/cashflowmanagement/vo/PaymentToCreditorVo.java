package com.cashflowmanagement.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the payment_to_creditors database table.
 * 
 */
public class PaymentToCreditorVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private String creditorName;

	private BigDecimal amountPaid;

	private Date date;

	public PaymentToCreditorVo() {
	}

	public PaymentToCreditorVo(int slNo, String creditorName,
			BigDecimal amountPaid, Date date) {
		this.slNo = slNo;
		this.creditorName = creditorName;
		this.amountPaid = amountPaid;
		this.date = date;
	}

	public int getSlNo() {
		return this.slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public BigDecimal getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountPaid(BigDecimal amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getCreditorName() {
		return this.creditorName;
	}

	public void setCreditorName(String creditorName) {
		this.creditorName = creditorName;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}