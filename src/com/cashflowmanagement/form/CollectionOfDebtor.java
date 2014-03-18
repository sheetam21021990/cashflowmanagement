package com.cashflowmanagement.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the collection_of_debtors database table.
 * 
 */
public class CollectionOfDebtor implements Serializable {
	private static final long serialVersionUID = 1L;

	private int slNo;

	private BigDecimal amount;

	private Date date;

	private BigDecimal payment;

	
	private List<CollectionOfDebtor> collectionOfDebtor;
	
	
	
	public List<CollectionOfDebtor> getCollectionOfDebtor() {
		return collectionOfDebtor;
	}

	public void setCollectionOfDebtor(List<CollectionOfDebtor> collectionOfDebtor) {
		this.collectionOfDebtor = collectionOfDebtor;
	}

	public CollectionOfDebtor() {
	}

	public int getSlNo() {
		return this.slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
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

	public BigDecimal getPayment() {
		return this.payment;
	}

	public void setPayment(BigDecimal payment) {
		this.payment = payment;
	}

}