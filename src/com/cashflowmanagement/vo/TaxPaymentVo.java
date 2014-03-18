package com.cashflowmanagement.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the tax_payment database table.
 * 
 */
public class TaxPaymentVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private BigDecimal taxPaid;
	
	private Date date;

	public TaxPaymentVo() {
	}

	
	
	
	public TaxPaymentVo(int slNo, BigDecimal taxPaid, Date date) {
		this.slNo = slNo;
		this.taxPaid = taxPaid;
		this.date = date;
	}




	public int getSlNo() {
		return this.slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getTaxPaid() {
		return this.taxPaid;
	}

	public void setTaxPaid(BigDecimal taxPaid) {
		this.taxPaid = taxPaid;
	}

}