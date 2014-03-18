package com.cashflowmanagement.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.cashflowmanagement.vo.ChequeReceiptVo;


/**
 * The persistent class for the cheque_receipt database table.
 * 
 */
public class ChequeReceipt implements Serializable {
	private static final long serialVersionUID = 1L;

	private int chequeNo;

	private BigDecimal amount;

	private Date date;

	private List<ChequePayment> chequePayments;

	private List<WithdrawalFromBank> withdrawalFromBanks;

	private List<ChequeReceiptVo> chequeReceiptVo;
	
	
	
	public List<ChequeReceiptVo> getChequeReceiptVo() {
		return chequeReceiptVo;
	}

	public void setChequeReceiptVo(List<ChequeReceiptVo> chequeReceiptVo) {
		this.chequeReceiptVo = chequeReceiptVo;
	}

	public ChequeReceipt() {
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

	public ChequePayment addChequePayment(ChequePayment chequePayment) {
		getChequePayments().add(chequePayment);
		chequePayment.setChequeReceipt(this);

		return chequePayment;
	}

	public ChequePayment removeChequePayment(ChequePayment chequePayment) {
		getChequePayments().remove(chequePayment);
		chequePayment.setChequeReceipt(null);

		return chequePayment;
	}

	public List<WithdrawalFromBank> getWithdrawalFromBanks() {
		return this.withdrawalFromBanks;
	}

	public void setWithdrawalFromBanks(List<WithdrawalFromBank> withdrawalFromBanks) {
		this.withdrawalFromBanks = withdrawalFromBanks;
	}

}