package com.example.mysql;

public class SelfJoins {
		
	
	/*
	 * 		Self joins is a way we show single table as two tables using aliasis and identify the what is happening
	 * 
	 * 		+-------------+------------+-------------+-------------+
			| customer_id | first_name | last_name   | referral_id |
			+-------------+------------+-------------+-------------+
			|           1 | suresh     | raju        |        NULL |
			|           2 | mouni      | priya       |           1 |
			|           3 | ram        | ram krishna |           2 |
			+-------------+------------+-------------+-------------+
			
			here using self joins we can say which customer referred which customer
			
			
			by using self joins we can differenciate this -> 
			select * from customers as a inner join customers as b on a.referral_id = b.customer_id;
			
			+-------------+------------+-------------+-------------+-------------+------------+-----------+-------------+
			| customer_id | first_name | last_name   | referral_id | customer_id | first_name | last_name | referral_id |
			+-------------+------------+-------------+-------------+-------------+------------+-----------+-------------+
			|           2 | mouni      | priya       |           1 |           1 | suresh     | raju      |        NULL |
			|           3 | ram        | ram krishna |           2 |           2 | mouni      | priya     |           1 |
			+-------------+------------+-------------+-------------+-------------+------------+-----------+-------------+
			
			this tabel has no clarity then what we can do is take columns individually
			
			 select a.customer_id, a.first_name, a.last_name, concat(b.first_name," ", b.last_name) as "referred_by" from 
			 customers as a inner join customers as b on a.referral_id = b.customer_id;
			 
				+-------------+------------+-------------+-------------+
				| customer_id | first_name | last_name   | referred_by |
				+-------------+------------+-------------+-------------+
				|           2 | mouni      | priya       | suresh raju |
				|           3 | ram        | ram krishna | mouni priya |
				+-------------+------------+-------------+-------------+
				
				=> with this table we can get good clarity which employee referred who and by that we can understand the data and use data
	 */
}
