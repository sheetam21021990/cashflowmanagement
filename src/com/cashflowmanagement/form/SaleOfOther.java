package com.cashflowmanagement.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.cashflowmanagement.vo.SaleOfOtherVo;


/**
 * The persistent class for the sale_of_others database table.
 * 
 */
public class SaleOfOther implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private Date date;

	private String partyName;

	private BigDecimal saleAmount;

	private BigDecimal taxAmount;

	//bi-directional many-to-one association to CashSale
	private CashSale cashSale;

	private List<SaleOfOtherVo> saleOfOtherVo;
	
	
	public SaleOfOther() {
	}

	
	
	
	public List<SaleOfOtherVo> getSaleOfOtherVo() {
		return saleOfOtherVo;
	}




	public void setSaleOfOtherVo(List<SaleOfOtherVo> saleOfOtherVo) {
		this.saleOfOtherVo = saleOfOtherVo;
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

	public String getPartyName() {
		return this.partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public BigDecimal getSaleAmount() {
		return this.saleAmount;
	}

	public void setSaleAmount(BigDecimal saleAmount) {
		this.saleAmount = saleAmount;
	}

	public BigDecimal getTaxAmount() {
		return this.taxAmount;
	}

	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	public CashSale getCashSale() {
		return this.cashSale;
	}

	public void setCashSale(CashSale cashSale) {
		this.cashSale = cashSale;
	}

}