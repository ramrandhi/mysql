package com.example.mysql;

public class Unions {
	
	/*
	 * 		UNION - > 
	 * 		1. to union two tables it should contain same number of columns
	 * 		EXAMPLE - select * from customers union select * from employees;
	 * 		=> here in the above example if customers have 3 same named columns and employees have 4 same named columns it wont work insted 
	 * 		what we can do is
	 * 		select first_name, last_name from customers union select first_name, last_name from employees;( this will work )
	 * 
	 *  	=> union wont allow duplicates -> it means if same first_name and last_name is present in both tables it wont work
	 * 		
	 */
	
	/*
	 * 
	 * 		UNION ALL ->
	 * 		unlike union, union all accepts dupliates that is the difference between union and union all
	 */

}
