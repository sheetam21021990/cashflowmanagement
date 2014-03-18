package com.cashflowmanagement.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.cashflowmanagement.form.ChequeReceipt;


/**
 * The persistent class for the withdrawal_from_bank database table.
 * 
 */
public class WithdrawalFromBankVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private int checkNo;

	private BigDecimal amountWithdrawn;

	private String bankName;

	private Date date;

	private ChequeReceipt chequeReceipt;

	public WithdrawalFromBankVo() {
	}

	public WithdrawalFromBankVo(int slNo, int checkNo,BigDecimal amountWithdrawn, String bankName, Date date) {
		this.slNo = slNo;
		this.checkNo = checkNo;
		this.amountWithdrawn = amountWithdrawn;
		this.bankName = bankName;
		this.date = date;
	}




	public int getSlNo() {
		return this.slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public BigDecimal getAmountWithdrawn() {
		return this.amountWithdrawn;
	}

	public void setAmountWithdrawn(BigDecimal amountWithdrawn) {
		this.amountWithdrawn = amountWithdrawn;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public ChequeReceipt getChequeReceipt() {
		return this.chequeReceipt;
	}

	public void setChequeReceipt(ChequeReceipt chequeReceipt) {
		this.chequeReceipt = chequeReceipt;
	}




	public int getCheckNo() {
		return checkNo;
	}




	public void setCheckNo(int checkNo) {
		this.checkNo = checkNo;
	}

	
}