package io.duotech.beans;

import java.util.List;
import java.util.Map;

import io.duotech.utilities.DatabaseUtils;
import io.duotech.utilities.ExcelUtils;

public class UtilityTester {

	public static void main(String[] args) {
		
//		
//		ExcelUtils sheet = new ExcelUtils("Data.xlsx", "sheet1");
//		List<Map<String,String>> dataAsList = sheet.getDataAsList();
//		System.out.println(dataAsList.toString());


		DatabaseUtils.createConnection();
		
		System.out.println("Connection Succesful!");
		
		System.out.println(DatabaseUtils.getColumnNames("select created_at, concat(first_name, \" \", last_name) as FULL_NAME from tbl_user \r\n" + 
				"where created_at between '2021-01-19' and '2021-01-22' order by created_at desc;"));
		
		System.out.println(DatabaseUtils.getRowCount());
		
		List<List<Object>> queryResultList = DatabaseUtils.getQueryResultList("select created_at, concat(first_name, \" \", last_name) as FULL_NAME from tbl_user \r\n" + 
				"where created_at between '2021-01-19' and '2021-01-22' order by created_at desc;");
		
		for (List<Object> list : queryResultList) {
			System.out.println(list);
		}
//		
//		
//		List<Map<String, Object>> queryResultMap = DatabaseUtils.getQueryResultMap("select first_name, last_name from employees limit 50");
//
//		//System.out.println(queryResultMap);
//		
//		
//		for (Map<String, Object> map : queryResultMap) {
//			System.out.println(map);
//		}
		
	}

}
