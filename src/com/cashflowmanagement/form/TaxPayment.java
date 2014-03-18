package com.cashflowmanagement.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.cashflowmanagement.vo.TaxPaymentVo;


/**
 * The persistent class for the tax_payment database table.
 * 
 */
public class TaxPayment implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private Date date;

	private BigDecimal taxPaid;

	private List<TaxPaymentVo> taxPaymentVo;
	
	public TaxPayment() {
	}

	
	
	public List<TaxPaymentVo> getTaxPaymentVo() {
		return taxPaymentVo;
	}



	public void setTaxPaymentVo(List<TaxPaymentVo> taxPaymentVo) {
		this.taxPaymentVo = taxPaymentVo;
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