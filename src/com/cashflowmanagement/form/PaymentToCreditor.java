package com.cashflowmanagement.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the payment_to_creditors database table.
 * 
 */
public class PaymentToCreditor implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private BigDecimal amountPaid;

	private String creditorName;

	private Date date;

	private List<PaymentToCreditor> paymentToCreditor;
	
	
	
	public List<PaymentToCreditor> getPaymentToCreditor() {
		return paymentToCreditor;
	}

	public void setPaymentToCreditor(List<PaymentToCreditor> paymentToCreditor) {
		this.paymentToCreditor = paymentToCreditor;
	}

	public PaymentToCreditor() {
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