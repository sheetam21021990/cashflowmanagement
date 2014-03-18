package com.cashflowmanagement.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the deposit_in_bank database table.
 * 
 */

public class DepositInBankVo implements Serializable {
	private static final long serialVersionUID = 1L;


	private int slNo;

	private BigDecimal amountDeposited;

	private String nameOfTheBank;
	
	private Date date;

	public DepositInBankVo() {
	}

	public DepositInBankVo(int slNo, BigDecimal amountDeposited,String nameOfTheBank, Date date) {
		this.slNo = slNo;
		this.amountDeposited = amountDeposited;
		this.nameOfTheBank = nameOfTheBank;
		this.date = date;
	}

	public int getSlNo() {
		return this.slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public BigDecimal getAmountDeposited() {
		return this.amountDeposited;
	}

	public void setAmountDeposited(BigDecimal amountDeposited) {
		this.amountDeposited = amountDeposited;
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

}