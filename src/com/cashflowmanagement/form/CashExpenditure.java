package com.cashflowmanagement.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.struts.action.ActionForm;

import com.cashflowmanagement.vo.CashExpenditureVo;

/**
 * The persistent class for the cash_expenditure database table.
 * 
 */

public class CashExpenditure extends ActionForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	private Date date;

	private String particulars;

	private int slNo;

	private List<CashExpenditureVo> cashExpenditureVo;
	
	public CashExpenditure(int slNo, String particulars, BigDecimal amount, Date date) {
		this.slNo = slNo;	
		this.particulars = particulars;
		this.amount = amount;
		this.date = date;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public Date getDate() {
		return date;
	}

	public String getParticulars() {
		return particulars;
	}

	public int getSlNo() {
		return slNo;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public List<CashExpenditureVo> getCashExpenditureVo() {
		return cashExpenditureVo;
	}

	public void setCashExpenditureVo(List<CashExpenditureVo> cashExpenditureVo) {
		this.cashExpenditureVo = cashExpenditureVo;
	}

}