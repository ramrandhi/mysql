package com.example.mysql;

public class GroupBy {
		
	/*
	 		Group By -> aggregate all rows by a specific column often used with aggregate functions 
	 						ex: sum(), max(), min(), avg(), count().
	 						
	 		Example:
	 		
	 		mysql> select * from transactions;
						+----------------+--------+-------------+------------+
						| transaction_id | amount | customer_id | order_date |
						+----------------+--------+-------------+------------+
						|           1000 |   4.25 |           2 | 2024-06-15 |
						|           1001 |   4.26 |           1 | 2024-06-15 |
						|           1002 |   4.56 |           2 | 2024-06-16 |
						|           1003 |   4.23 |        NULL | 2024-06-16 |
						|           1004 |   4.56 |           3 | 2024-06-16 |
						|           1005 |   4.23 |           3 | 2024-06-17 |
						|           1006 |   4.56 |           1 | 2024-06-17 |
						+----------------+--------+-------------+------------+
						
				-> this is my transactions table, by using group by we got the that day transaction amount like wise we can use
						aggregate functions with group by
				
				
				mysql> select sum(amount) as amount_sum, order_date from transactions group by(order_date);
								+------------+------------+
								| amount_sum | order_date |
								+------------+------------+
								|       8.51 | 2024-06-15 |
								|      13.35 | 2024-06-16 |
								|       8.79 | 2024-06-17 |
								+------------+------------+
								
				=> with "group by" we cannot use "where" clause we can insted use having clause
				
				example:
				
				=> select sum(amount) as amount_sum, order_date from transactions group by(order_date) having count(amount) > 1 and 
							customer_id is not null
 	 */
}
