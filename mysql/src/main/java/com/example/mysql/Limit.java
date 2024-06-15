package com.example.mysql;

public class Limit {
	
	/*
	 * 		limit clause is used to limit the number of records
	 * 		useful if you're working with lot of data
	 * 		can be used to display a large data on pages (Pagination) 
	 * 
	 */
	
	/*
	 * 		EXAMPLE - select * from employees limit 1;
	 * 		
	 * 		can be used with order by -> select * from employees order by first_name limit 10;
	 */
	
	/*
	 * 		OFFSET
	 * 
	 * 		select * from emploees limit 1,1;
	 * 		EXPLANATION -> here first 1 is offset that means data will be retrived after 1st column, 2nd 1 says how many records
	 * 		to be retrived 
	 */

}
