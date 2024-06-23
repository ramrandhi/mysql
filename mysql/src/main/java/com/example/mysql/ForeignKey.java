package com.example.mysql;

public class ForeignKey {
	
	/*
	 * 		used for creating link between the tables and act as an link between two where when we want to delete or drop main table
	 * 		the action is not done as first we need to delete item from child tables
	 */
	
	/*		// CREATE TABLE STATEMENT
	 * 		create table customer
	 * 		(id int, name varchar(50));
	 * 
	 * 		syntax -> create table transactions
	 * 		(id int, 
	 * 		transaction_date datetime, 
	 * 		customer_id int, 
	 * 		foreign key(customer_id) references customer(id));
	 * 	
	 */
	
	/*		// alter statement
	 * 
	 * 		alter table transactions add constraint fK_customer_id foreign key(customer_id) references customer(id);
	 */
	
	/*			DELETE A FOREIGN KEY
	 * 
	 * 		alter table transactions drop foreign key fk_customer_id;
	 * 
	 * 
	 			=> set foreign_key_checks=1;
	 			
	 			this is by default 1 to make sure the parent row is not deleted before child row gets deleted
	 			
	 			
	 			=> set foreign_key_checks=0;
	 			
	 			this makes the parent table delete a column even if it is present inside the other table as foreign key constraint
	 			
	 * 
	 */

}
