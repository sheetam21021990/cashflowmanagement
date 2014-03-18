package com.cashflowmanagement.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.cashflowmanagement.form.ChequeReceipt;


/**
 * The persistent class for the cheque_payment database table.
 * 
 */
public class ChequePaymentVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private int checkNo;

	private BigDecimal amountPaid;

	private String nameOfTheBank;

	private Date date;
	
	private ChequeReceipt chequeReceipt;

	public ChequePaymentVo() {
	}
	
	public ChequePaymentVo(int slNo, int checkNo, BigDecimal amountPaid, String nameOfTheBank, Date date) {
		this.slNo = slNo;
		this.checkNo = checkNo;
		this.amountPaid = amountPaid;
		this.nameOfTheBank = nameOfTheBank;
		this.date = date;
	}



	public int getCheckNo() {
		return checkNo;
	}



	public void setCheckNo(int checkNo) {
		this.checkNo = checkNo;
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

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNameOfTheBank() {
		return this.nameOfTheBank;
	}

	public void setNameOfTheBank(String nameOfTheBank) {
		this.nameOfTheBank = nameOfTheBank;
	}

	public ChequeReceipt getChequeReceipt() {
		return this.chequeReceipt;
	}

	public void setChequeReceipt(ChequeReceipt chequeReceipt) {
		this.chequeReceipt = chequeReceipt;
	}

}