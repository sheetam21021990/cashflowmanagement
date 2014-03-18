package com.cashflowmanagement.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.struts.action.ActionForm;

import com.cashflowmanagement.dbconnect.DBConnect;
import com.cashflowmanagement.interfaces.Impl;


/**
 * The persistent class for the tax_payment database table.
 * 
 */
public class TaxPaymentImpl implements Impl {
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	@Override
	public void select(ActionForm form) {
		con = DBConnect.openConnection();






		DBConnect.closeConnection(con);

	}

	@Override
	public void insert(ActionForm form) {
		con = DBConnect.openConnection();






		DBConnect.closeConnection(con);

	}

	@Override
	public void update(ActionForm form) {
		con = DBConnect.openConnection();






		DBConnect.closeConnection(con);

	}

	@Override
	public void delete(ActionForm form) {
		con = DBConnect.openConnection();






		DBConnect.closeConnection(con);

	}

	@Override
	public void selectAll(ActionForm form) {
		con = DBConnect.openConnection();






		DBConnect.closeConnection(con);

	}

	@Override
	public void insertAll(ActionForm form) {
		con = DBConnect.openConnection();






		DBConnect.closeConnection(con);

	}

	@Override
	public void updateAll(ActionForm form) {
		con = DBConnect.openConnection();






		DBConnect.closeConnection(con);

	}

	@Override
	public void deleteAll(ActionForm form) {
		con = DBConnect.openConnection();






		DBConnect.closeConnection(con);

	}
}