package com.cashflowmanagement.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.struts.action.ActionForm;

import com.cashflowmanagement.dbconnect.DBConnect;
import com.cashflowmanagement.form.CashExpenditure;
import com.cashflowmanagement.interfaces.Impl;
import com.cashflowmanagement.vo.CashExpenditureVo;

public class CashExpenditureImpl implements Impl {

	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	@Override
	public void select(ActionForm form) {

		
		CashExpenditure exp = (CashExpenditure) form ; 
		
		try {
			con = DBConnect.openConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT sl_no, particulars, amount, DATE  FROM cashflow_management.cash_expenditure ");

			ArrayList<CashExpenditureVo> volist = new ArrayList<CashExpenditureVo>();
			
			while (rs.next()) {
				
				CashExpenditureVo vo = new CashExpenditureVo(
						rs.getInt(1), 
						rs.getString(2), rs.getBigDecimal(3), rs.getDate(4));
				
				volist.add(vo);
				
				
			}
			
			exp.setCashExpenditureVo(volist);
			
			
			
			DBConnect.closeConnection(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}

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
		// TODO Auto-generated method stub

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