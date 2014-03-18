package com.cashflowmanagement.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cash_sale database table.
 * 
 */
public class CashSale implements Serializable {
	private static final long serialVersionUID = 1L;

	private int billNo;

	private Date date;

	private BigDecimal saleAmount;

	private BigDecimal taxAmount;

	private List<CashPurchase> cashPurchases;

	private List<CreditSale> creditSales;

	private List<SaleOfGood> saleOfGoods;

	private List<SaleOfOther> saleOfOthers;
	
	private List<CashSale> cashSales;

	
	
	public List<CashSale> getCashSales() {
		return cashSales;
	}

	public void setCashSales(List<CashSale> cashSales) {
		this.cashSales = cashSales;
	}

	public CashSale() {
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

	public CashPurchase addCashPurchas(CashPurchase cashPurchas) {
		getCashPurchases().add(cashPurchas);
		cashPurchas.setCashSale(this);

		return cashPurchas;
	}

	public CashPurchase removeCashPurchas(CashPurchase cashPurchas) {
		getCashPurchases().remove(cashPurchas);
		cashPurchas.setCashSale(null);

		return cashPurchas;
	}

	public List<CreditSale> getCreditSales() {
		return this.creditSales;
	}

	public void setCreditSales(List<CreditSale> creditSales) {
		this.creditSales = creditSales;
	}

	public CreditSale addCreditSale(CreditSale creditSale) {
		getCreditSales().add(creditSale);
		creditSale.setCashSale(this);

		return creditSale;
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

	public SaleOfGood addSaleOfGood(SaleOfGood saleOfGood) {
		getSaleOfGoods().add(saleOfGood);
		saleOfGood.setCashSale(this);

		return saleOfGood;
	}

	public SaleOfGood removeSaleOfGood(SaleOfGood saleOfGood) {
		getSaleOfGoods().remove(saleOfGood);
		saleOfGood.setCashSale(null);

		return saleOfGood;
	}

	public List<SaleOfOther> getSaleOfOthers() {
		return this.saleOfOthers;
	}

	public void setSaleOfOthers(List<SaleOfOther> saleOfOthers) {
		this.saleOfOthers = saleOfOthers;
	}

	public SaleOfOther addSaleOfOther(SaleOfOther saleOfOther) {
		getSaleOfOthers().add(saleOfOther);
		saleOfOther.setCashSale(this);

		return saleOfOther;
	}

	public SaleOfOther removeSaleOfOther(SaleOfOther saleOfOther) {
		getSaleOfOthers().remove(saleOfOther);
		saleOfOther.setCashSale(null);

		return saleOfOther;
	}

}