package com.cashflowmanagement.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.struts.action.ActionForm;

import com.cashflowmanagement.vo.WithdrawalFromBankVo;


public class WithdrawalFromBank extends ActionForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private int checkNo;

	private BigDecimal amountWithdrawn;

	private String bankName;

	private Date date;

	private String action;
	
	private String actionOn;
	
	private int actionOnId;

	private List<WithdrawalFromBankVo> WithdrawalFromBankVo;
	
	public WithdrawalFromBank() {
	}
	
	

	


	public List<WithdrawalFromBankVo> getWithdrawalFromBankVo() {
		return WithdrawalFromBankVo;
	}






	public void setWithdrawalFromBankVo(
			List<WithdrawalFromBankVo> withdrawalFromBankVo) {
		WithdrawalFromBankVo = withdrawalFromBankVo;
	}






	public String getAction() {
		return action;
	}



	public void setAction(String action) {
		this.action = action;
	}



	public String getActionOn() {
		return actionOn;
	}



	public void setActionOn(String actionOn) {
		this.actionOn = actionOn;
	}



	public int getActionOnId() {
		return actionOnId;
	}



	public void setActionOnId(int actionOnId) {
		this.actionOnId = actionOnId;
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


}