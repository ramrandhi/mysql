package com.example.mysql;

public class WildCards {
	
	/*
	 * 
	 * 		%
	 * 
	 * 	select * from employees where first_name like "s%";
	 * 
	 * 		explanation -> this says when we search a first_name that starts with s then wild cards are used in this case it checks
	 * 						for any first_name that starts with s and % says after s an number of characters can be present
	 * 
	 * 						when using wild cards to search for patterns we need to use like operator
	 */
	
	/*
	 * 
	 * 			_ (underscore) -> it searches for words that have random letter in its position and pattern that comes with it.
	 * 
	 * 
	 * 		example -> select * from employees where job like "_ook";
	 * 		explanation -> here in this case the above query searches for any job column that has pattern that has any letter that
	 * 						in start but ends with ook and reurns those columns
	 */
	
	
	/*
	 * 
	 * 		combining these wild cards "_a%"
	 * 		explanation -> first letter can be anything second letter is a and can have any letters in the end
	 */

}
