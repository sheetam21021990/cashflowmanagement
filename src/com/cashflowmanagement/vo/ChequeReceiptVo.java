package com.cashflowmanagement.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.cashflowmanagement.form.ChequePayment;
import com.cashflowmanagement.form.WithdrawalFromBank;


/**
 * The persistent class for the cheque_receipt database table.
 * 
 */
public class ChequeReceiptVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int chequeNo;

	private BigDecimal amount;

	private Date date;

	private List<ChequePayment> chequePayments;

	private List<WithdrawalFromBank> withdrawalFromBanks;


	
	
	public ChequeReceiptVo(int chequeNo, BigDecimal amount, Date date) {
		this.chequeNo = chequeNo;
		this.amount = amount;
		this.date = date;
	}

	public ChequeReceiptVo() {
	}

	public int getChequeNo() {
		return this.chequeNo;
	}

	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
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

	public List<ChequePayment> getChequePayments() {
		return this.chequePayments;
	}

	public void setChequePayments(List<ChequePayment> chequePayments) {
		this.chequePayments = chequePayments;
	}

	public List<WithdrawalFromBank> getWithdrawalFromBanks() {
		return this.withdrawalFromBanks;
	}

	public void setWithdrawalFromBanks(List<WithdrawalFromBank> withdrawalFromBanks) {
		this.withdrawalFromBanks = withdrawalFromBanks;
	}
}