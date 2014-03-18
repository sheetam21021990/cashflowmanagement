package com.cashflowmanagement.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the deposit_in_bank database table.
 * 
 */
public class DepositInBank implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private BigDecimal amountDeposited;

	private Date date;

	private String nameOfTheBank;

	private List<DepositInBank> depositInBank;
	
	
	
	public List<DepositInBank> getDepositInBank() {
		return depositInBank;
	}

	public void setDepositInBank(List<DepositInBank> depositInBank) {
		this.depositInBank = depositInBank;
	}

	public DepositInBank() {
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