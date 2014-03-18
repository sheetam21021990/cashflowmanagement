package com.cashflowmanagement.resource;

public class Query {

	public enum WithdrawalFromBank{

		SELECT("SELECT 	sl_no, cheque_no, amount_withdrawn, bank_name, DATE  FROM withdrawal_from_bank WHERE id = ? "),
		
		SELECTALL("SELECT 	sl_no, cheque_no, amount_withdrawn, bank_name, DATE  FROM withdrawal_from_bank WHERE id IN (?) "),
		
		INSERT("INSERT INTO withdrawal_from_bank ( cheque_no, amount_withdrawn, bank_name, DATE ) VALUES ( ?, ?, ?, ? )"),
		
		UPDATE("UPDATE withdrawal_from_bank SET cheque_no = ? , amount_withdrawn = ? , bank_name = ? , DATE = ?  WHERE sl_no = ? "),
		
		DELETE("DELETE FROM cashflow_management.cash_expenditure WHERE sl_no = ? "),
		
		DELETEALL("DELETE FROM cashflow_management.cash_expenditure WHERE sl_no IN (?) ");
		
		private String query;
		WithdrawalFromBank(String query){
			this.query = query;
		}
		
		public String getQuery(){
			return query;
		}
	}
	
	
}
