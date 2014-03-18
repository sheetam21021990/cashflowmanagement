package com.cashflowmanagement.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.cashflowmanagement.vo.ChequePaymentVo;


/**
 * The persistent class for the cheque_payment database table.
 * 
 */
public class ChequePayment implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private BigDecimal amountPaid;

	private Date date;

	private String nameOfTheBank;

	private ChequeReceipt chequeReceipt;

	private List<ChequePaymentVo> chequePaymentVo;
	
	
	
	
	public List<ChequePaymentVo> getChequePaymentVo() {
		return chequePaymentVo;
	}

	public void setChequePaymentVo(List<ChequePaymentVo> chequePaymentVo) {
		this.chequePaymentVo = chequePaymentVo;
	}

	public ChequePayment() {
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