package com.example.mysql;

public class SubQueries {
	
	/*
	 		a subquery is a query within another query
	 		example: query(subquery)
	 		
	 		
	 		using subquery is like calling making two conditions work for us;
	 		Example: we have transactions table where customer_id is foreign key and it is primary key to customers;
	 		
	 		 
	 		 now i want all the customers name who have made transactions so what i can do is
	 		 
	 		 select first_name, last_name from customers in (select distinct customer_id from transactions where customer_id is not null);
	 		 it works same as => select first_name, last_name from customers in (1,2,3);
	 		 
	 		 we use sub queries to retrive data which has two process steps to go through
	 */

}
