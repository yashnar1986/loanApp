package io.duotech.beans;

import java.util.List;
import java.util.Map;

import io.duotech.utilities.DatabaseUtils;

public class UtilityTester {

	public static void main(String[] args) {


		DatabaseUtils.createConnection();
		
		System.out.println("Connection Succesful!");
		
		System.out.println(DatabaseUtils.getColumnNames("select first_name, last_name from employees"));
		
		System.out.println(DatabaseUtils.getRowCount());
		
		List<List<Object>> queryResultList = DatabaseUtils.getQueryResultList("select first_name, last_name from employees limit 100");
		
		for (List<Object> list : queryResultList) {
			System.out.println(list);
		}
		
		
		List<Map<String, Object>> queryResultMap = DatabaseUtils.getQueryResultMap("select first_name, last_name from employees limit 50");

		//System.out.println(queryResultMap);
		
		
		for (Map<String, Object> map : queryResultMap) {
			System.out.println(map);
		}
		
	}

}
