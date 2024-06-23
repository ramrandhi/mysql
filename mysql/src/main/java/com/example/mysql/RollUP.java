package com.example.mysql;

public class RollUP {
	
	/*
	 			=> Rollup, extenison of the group by clause
	 			-> produces another row and shows the grand total(super aggregate value)
	 			
	 		example:
	 		
	 		mysql> select sum(amount) as amount_sum, order_date from transactions group by(order_date) with rollup;
					+------------+------------+
					| amount_sum | order_date |
					+------------+------------+
					|       8.51 | 2024-06-15 |
					|      13.35 | 2024-06-16 |
					|       8.79 | 2024-06-17 |
					|      30.65 | NULL       |
					+------------+------------+
					
				=> that last row was the rollup which is grand total
	 */

}
