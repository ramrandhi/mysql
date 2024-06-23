package com.example.mysql;

public class Index {
		/*
		 		Index is a bTree data structure
		 		-> Indexes are used to find values within a specific column more quickly
		 		-> MYSQL normally searches sequencually through a column
		 		-> the longer the data in the column the more expensive the operation is
		 		-> update takes more time, select takes less time
		 		
		 			
		 	To check the index we can do 
		 	->  show indexes from customers;
+-----------+------------+----------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
| Table     | Non_unique | Key_name | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
+-----------+------------+----------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
| customers |          0 | PRIMARY  |            1 | customer_id | A         |           3 |     NULL |   NULL |      | BTREE      |         |
 | YES     | NULL       |
+-----------+------------+----------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+

		here in the column_name customer_id we already have index as it is primary key it is by default set as index for this table
		
		
		CREATE INDEX TO LAST NAME
		=> CREATE INDEX LAST_NAME_IDX ON customers(last_name);
		
		
		mysql> show indexes from customers;
+-----------+------------+---------------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
| Table     | Non_unique | Key_name      | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
+-----------+------------+---------------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
| customers |          0 | PRIMARY       |            1 | customer_id | A         |           3 |     NULL |   NULL |      | BTREE      |         |
      | YES     | NULL       |
| customers |          1 | LAST_NAME_IDX |            1 | last_name   | A         |           3 |     NULL |   NULL | YES  | BTREE      |         |
      | YES     | NULL       |
+-----------+------------+---------------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+

			here now as we added index to last_name it is way faster to retrive data using that column last_name now
			
			
		=>	we dont actually retrive data using single column so we use 2 columns to retrive data sometimes so we can
			use multi column index
			
		=> MULTI COLUMN INDEX: 
			Create index last_name_first_name_idx on customers(last_name, first_name);
			
		mysql> show indexes from customers;
+-----------+------------+--------------------------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
| Table     | Non_unique | Key_name                 | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
+-----------+------------+--------------------------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
| customers |          0 | PRIMARY                  |            1 | customer_id | A         |           3 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| customers |          1 | LAST_NAME_IDX            |            1 | last_name   | A         |           3 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |
| customers |          1 | last_name_first_name_idx |            1 | last_name   | A         |           3 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |
| customers |          1 | last_name_first_name_idx |            2 | first_name  | A         |           3 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |
+-----------+------------+--------------------------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
		 			
		 	=> To drop a index from a table we can use
		 	
		 	-> alter table customers drop index last_name_idx;
		 	

mysql> show indexes from customers;
+-----------+------------+--------------------------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
| Table     | Non_unique | Key_name                 | Seq_in_index | Column_name | Collation | Cardinality | Sub_part | Packed | Null | Index_type | Comment | Index_comment | Visible | Expression |
+-----------+------------+--------------------------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
| customers |          0 | PRIMARY                  |            1 | customer_id | A         |           3 |     NULL |   NULL |      | BTREE      |         |               | YES     | NULL       |
| customers |          1 | last_name_first_name_idx |            1 | last_name   | A         |           3 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |
| customers |          1 | last_name_first_name_idx |            2 | first_name  | A         |           3 |     NULL |   NULL | YES  | BTREE      |         |               | YES     | NULL       |
+-----------+------------+--------------------------+--------------+-------------+-----------+-------------+----------+--------+------+------------+---------+---------------+---------+------------+
		 => now we can use both last_name and first_name for searching elements inside this table more quickly using multi column index;
		 
		 
		 */
}
