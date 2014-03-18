package com.cashflowmanagement.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.cashflowmanagement.form.CashPurchase;
import com.cashflowmanagement.form.CreditSale;
import com.cashflowmanagement.form.SaleOfGood;
import com.cashflowmanagement.form.SaleOfOther;


/**
 * The persistent class for the cash_sale database table.
 * 
 */
public class CashSaleVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int billNo;

	private BigDecimal saleAmount;

	private BigDecimal taxAmount;
	
	private Date date;

	private List<CashPurchase> cashPurchases;

	private List<CreditSale> creditSales;

	private List<SaleOfGood> saleOfGoods;

	private List<SaleOfOther> saleOfOthers;

	public CashSaleVo() {
	}

	public CashSaleVo(int billNo, BigDecimal saleAmount, BigDecimal taxAmount, Date date) {
		this.billNo = billNo;
		this.saleAmount = saleAmount;
		this.taxAmount = taxAmount;
		this.date = date;
	}



	public int getBillNo() {
		return this.billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public List<CashPurchase> getCashPurchases() {
		return this.cashPurchases;
	}

	public void setCashPurchases(List<CashPurchase> cashPurchases) {
		this.cashPurchases = cashPurchases;
	}


	public List<CreditSale> getCreditSales() {
		return this.creditSales;
	}

	public void setCreditSales(List<CreditSale> creditSales) {
		this.creditSales = creditSales;
	}


	public CreditSale removeCreditSale(CreditSale creditSale) {
		getCreditSales().remove(creditSale);
		creditSale.setCashSale(null);

		return creditSale;
	}

	public List<SaleOfGood> getSaleOfGoods() {
		return this.saleOfGoods;
	}

	public void setSaleOfGoods(List<SaleOfGood> saleOfGoods) {
		this.saleOfGoods = saleOfGoods;
	}


	public List<SaleOfOther> getSaleOfOthers() {
		return this.saleOfOthers;
	}

	public void setSaleOfOthers(List<SaleOfOther> saleOfOthers) {
		this.saleOfOthers = saleOfOthers;
	}


}