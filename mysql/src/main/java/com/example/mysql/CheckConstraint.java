package com.example.mysql;

public class CheckConstraint {
	
	/*   
	 *   check constraint is bascially used for when we want the entered value to be minimum value to insert value into	 *   
	 *      
	*/
	
	
	/*
	in a company if the minimum wage is 100 rupees then we can add a check constraint so that the minimum wage
	a worker gets is not below the 100 rupees
	*/
	
	
	/*
	example :
		create table truckers(id int, name varchar(25), wage decimal(5,3), constraint daily_wage check(wage >= 100);
	 */
	
	
	/*
	 * 		ADD that to a table 
	 * 
	 * 		alter table truckers add constraint daily_wage check(wage >= 100);
	 * 
	 * 
	 */
	
	
	/*
	 *   to delete that check
	 *   
	 *   alter table truckers drop check daily_wage;
	 * 
	 * 
	 */

}
