package com.example.mysql;

public class OnDelete {
		
	/*
	 		=> on delete set null -> when a table's column is deleted in this table the other table where this table
	 								column is present as foreign key is set to null
	 		
	 		=> on delete cascade -> when a table's column is deleted in this table the other table where this table 
	 								column is present as foreign key is also deleted
	 								
	 								
	 		usage:
	 		
	 		 create table transactions 
	 		 (transaction_id int primary key auto_increment, amount decimal(5,2),customer_id int, order_date date,
	 		 foreign key(custome_id) references customers(customers_id) on delete set null);
	 		 
	 		 create table transactions 
	 		 (transaction_id int primary key auto_increment, amount decimal(5,2),customer_id int, order_date date,
	 		 foreign key(custome_id) references customers(customers_id) on delete cascade);
	 		 
	 		 
	 		 
	 		 => if we already have a foreign key constraint we need to drop that foreign key and add that foreign key
	 		  	with on delete set null or on delete cascade
	 		  	
	 		  	  
	 		  	 alter table transactions drop foreign key fk_customer_id;
	 		  	 
	 		  	 
	 		  	alter table transactions add constraint fk_customer_id foreign key(customer_id) references customers(customers_id)
	 		  	on delete set null;
	 		  	
	 		  	or 
	 		 	
	 		 	alter table transactions add constraint fk_customer_id foreign key(customer_id) references customers(customers_id)
	 		  	on delete cascade;
	 		 
	 		 
	 */
}
