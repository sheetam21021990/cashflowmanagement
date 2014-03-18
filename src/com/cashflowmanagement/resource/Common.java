package com.cashflowmanagement.resource;

public class Common {

	
	public enum SESSIONKEYS{
		USERID,USERNAME
	}
	
	
	public enum ACTION{
		SELECT,SELECTALL,INSERT,INSERTALL,UPDATE,UPDATEALL,DELETE,DELETEALL
	}
	
	
	
	public enum MESSAGES{
		S000("0000","SUCCESSFULLY RETRIVED DATA"),
		E111("1111","UNABLE TO RETRIVE DATA"),
		E001("1001","WRONG USERNAME AND PASSWORD");
		
		private String code;
		private String msg;
		
		private MESSAGES(String code,String msg) {
	        this.code = code;
	        this.msg = msg;
	    }
		
		public String getCode(){
			return this.code;
		}
		
		public String getMsg(){
			return this.msg;
		}
		
	}
	
}
