package com.example.mysql;

public class Views {
	
	/*
	 	VIEWS : 
	 	1. a virtual table based on the result-set of an SQL statement
	 	2. the fields in a view are fields from one or more real tables in the database
	 	3. they're not real tables, but can be interacted with as if they were
	 	
	 	Example:
	 	
	 	this is my table 
	 	
	 			mysql> show tables;
								+---------------------+
								| Tables_in_mydb      |
								+---------------------+
								| customers           |
								| project_assignments |
								| truckers            |
								| workers             |
								+---------------------+
						4 rows in set (0.01 sec)
						
						mysql> select * from customers;
						+-------------+------------+-------------+-------------+
						| customer_id | first_name | last_name   | referral_id |
						+-------------+------------+-------------+-------------+
						|           1 | suresh     | raju        |        NULL |
						|           2 | mouni      | priya       |           1 |
						|           3 | ram        | ram krishna |           2 |
						+-------------+------------+-------------+-------------+
						
				i can create view which is a duplicate table where data is extracted from above table
				
			Creating view syntax:
				create view customers_frequency AS select first_name, last_name from customers;
				
				
				-> this is a virtual table which is stored in views
				
				 mysql> select * from customers_frequency;
					+------------+-------------+
					| first_name | last_name   |
					+------------+-------------+
					| suresh     | raju        |
					| mouni      | priya       |
					| ram        | ram krishna |
					+------------+-------------+
					
					
					we can query that view to retrive changes
					
					
					manipulate that data in view aswell
					
			update customers_frequency set last_name = 'kannayay' where first_name = 'suresh';
			
			
					mysql> select * from customers_frequency;
						+------------+-------------+
						| first_name | last_name   |
						+------------+-------------+
						| suresh     | kannayay    |
						| mouni      | priya       |
						| ram        | ram krishna |
						+------------+-------------+
						
			**=> if we update view the data in original table will also be updated and wiseversa
						
				we can drop a view as well
				
				example : drop view customers_frequency;
	 */

}
