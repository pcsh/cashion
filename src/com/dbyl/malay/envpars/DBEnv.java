package com.dbyl.malay.envpars;

import java.util.HashMap;
import java.util.Map;

public class DBEnv {
	

	
	public Map<String, String> envDB(int env,int type)
	{
		//url,user,pwd
		//"jdbc:postgresql://172.16.6.171:5432/onlyou3", "vop", "vop"
		//env:0-SIT;1-Beta
		//type:0-VOP;1-ONLYOU
		 String strUrl = "jdbc:postgresql://172.16.11.35:5432/vop_accounting_test";
         String strUser ="vop_test";     
         String strPwd ="vop_test";
         if(env == 0 && type == 0){          //SIT
    		 strUrl = "jdbc:postgresql://172.16.11.35:5432/vop_accounting_test";
             strUser ="vop_test";     
             strPwd ="vop_test";
         }
         else if(env == 1 && type == 0){ //Beta
         //Beta:
    		 strUrl = "jdbc:postgresql://172.16.11.35:5432/vop_accounting_uat";
             strUser ="vop_uat";     
             strPwd ="vop_uat";
         }
         Map<String, String> result = new HashMap<String, String>();
         result.put("strUrlP", strUrl);
         result.put("strUserP", strUser);
         result.put("strPwdP", strPwd);
		return result;
	}
	
	
	
}
