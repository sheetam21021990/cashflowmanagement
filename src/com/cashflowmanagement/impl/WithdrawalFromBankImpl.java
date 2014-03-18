package com.cashflowmanagement.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.struts.action.ActionForm;

import com.cashflowmanagement.dbconnect.DBConnect;
import com.cashflowmanagement.interfaces.Impl;
import com.cashflowmanagement.resource.Query;

public class WithdrawalFromBankImpl implements Impl {

	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet resultSet = null;

	@Override
	public void selectAll(ActionForm form) {
		try {
		
			con = DBConnect.openConnection();
			pstmt = con.prepareStatement(Query.WithdrawalFromBank.SELECTALL.getQuery());
			DBConnect.closeConnection(con);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void select(ActionForm form) {
		try {
			
			con = DBConnect.openConnection();
			pstmt = con.prepareStatement(Query.WithdrawalFromBank.SELECT.getQuery());
			DBConnect.closeConnection(con);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void insert(ActionForm form) {
		try {
			
			con = DBConnect.openConnection();
			pstmt = con.prepareStatement(Query.WithdrawalFromBank.INSERT.getQuery());
			DBConnect.closeConnection(con);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(ActionForm form) {
		try {
			
			con = DBConnect.openConnection();
			pstmt = con.prepareStatement(Query.WithdrawalFromBank.UPDATE.getQuery());
			DBConnect.closeConnection(con);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(ActionForm form) {
		try {
			
			con = DBConnect.openConnection();
			pstmt = con.prepareStatement(Query.WithdrawalFromBank.DELETE.getQuery());
			DBConnect.closeConnection(con);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void insertAll(ActionForm form) {
		try {
			
			con = DBConnect.openConnection();
			
			
			pstmt = con.prepareStatement(Query.WithdrawalFromBank.INSERT.getQuery());
			
			DBConnect.closeConnection(con);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateAll(ActionForm form) {
		try {
			
			con = DBConnect.openConnection();
			pstmt = con.prepareStatement(Query.WithdrawalFromBank.UPDATE.getQuery());
			DBConnect.closeConnection(con);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteAll(ActionForm form) {
		try {
			
			con = DBConnect.openConnection();
			pstmt = con.prepareStatement(Query.WithdrawalFromBank.DELETEALL.getQuery());
			DBConnect.closeConnection(con);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



}