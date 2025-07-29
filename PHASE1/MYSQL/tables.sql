mysql> use cis_estore;
Database changed

mysql> show tables;
Empty set (0.04 sec)

mysql> 


mysql> CREATE TABLE Persons (PersonID int, LastName varchar(255), FirstName varchar(255), Address varchar(255), City varchar(255) ) ;
Query OK, 0 rows affected (1.48 sec)

mysql> show tables;
+----------------------+
| Tables_in_cis_estore |
+----------------------+
| persons              |
+----------------------+
1 row in set (0.00 sec)

mysql>


# DATA INSERTION

mysql> SELECT * FROM Persons;
+----------+----------+-----------+-------------+------+
| PersonID | LastName | FirstName | Address     | City |
+----------+----------+-----------+-------------+------+
|        1 | Krishna  | Murli     | 23 HYD, IND | HYD  |
+----------+----------+-----------+-------------+------+
1 row in set (0.00 sec)

mysql> INSERT INTO Persons values ( 2, 'Krishna', 'Manohar', '273 Vendor Street, IND', 'KOL');
Query OK, 1 row affected (0.10 sec)

mysql> SELECT * FROM Persons;
+----------+----------+-----------+------------------------+------+
| PersonID | LastName | FirstName | Address                | City |
+----------+----------+-----------+------------------------+------+
|        1 | Krishna  | Murli     | 23 HYD, IND            | HYD  |
|        2 | Krishna  | Manohar   | 273 Vendor Street, IND | KOL  |
+----------+----------+-----------+------------------------+------+
2 rows in set (0.00 sec)

mysql>


#UPDATING DATA. Execute the following on your mysql terminal.
#Update data
USE CIS_ESTORE;

UPDATE Persons
SET LastName = 'Mohan' , city = 'MEERUT'
WHERE PersonID=1;

mysql> SELECT * FROM Persons;
+----------+----------+-----------+------------------------+--------+
| PersonID | LastName | FirstName | Address                | City   |
+----------+----------+-----------+------------------------+--------+
|        1 | Mohan    | Murli     | 23 HYD, IND            | MEERUT |
|        2 | Krishna  | Manohar   | 273 Vendor Street, IND | KOL    |
+----------+----------+-----------+------------------------+--------+
2 rows in set (0.00 sec)

mysql>


# DELETING Table DATA
mysql> DELETE FROM Persons WHERE city = 'MEERUT';
Query OK, 1 row affected (0.14 sec)

mysql> SELECT * FROM Persons;
+----------+----------+-----------+------------------------+------+
| PersonID | LastName | FirstName | Address                | City |
+----------+----------+-----------+------------------------+------+
|        2 | Krishna  | Manohar   | 273 Vendor Street, IND | KOL  |
+----------+----------+-----------+------------------------+------+
1 row in set (0.00 sec)

mysql>

##### Delete all data, but keep the table structure intact

mysql> SELECT * FROM Persons;
+----------+----------+-----------+-------------------------+------+
| PersonID | LastName | FirstName | Address                 | City |
+----------+----------+-----------+-------------------------+------+
|        2 | Krishna  | Manohar   | 273 Vendor Street, IND  | KOL  |
|        3 | Sharma   | Sudheer   | 2234 Vendor Street, IND | KOL  |
+----------+----------+-----------+-------------------------+------+
2 rows in set (0.00 sec)

mysql> TRUNCATE table Persons;
Query OK, 0 rows affected (0.89 sec)

mysql> SELECT * FROM Persons;
Empty set (0.00 sec)

mysql>

################################################################################
##### Delete the table structure itself along with its data. DROP command #####
################################################################################
mysql> SELECT * FROM Persons;
+----------+----------+-----------+-------------------------+------+
| PersonID | LastName | FirstName | Address                 | City |
+----------+----------+-----------+-------------------------+------+
|        3 | Sharma   | Sudheer   | 2234 Vendor Street, IND | KOL  |
|        4 | Bala     | Madhu     | 200 Vendor Street, IND  | KOL  |
+----------+----------+-----------+-------------------------+------+
2 rows in set (0.00 sec)

mysql> DROP table Persons;
Query OK, 0 rows affected (0.27 sec)

mysql> show tables;
Empty set (0.00 sec)

mysql>


### ALTER Table structure
CREATE TABLE People (id int, name varchar(80));

mysql> describe People;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| id    | int         | YES  |     | NULL    |       |
| name  | varchar(80) | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
2 rows in set (0.12 sec)


mysql> ALTER TABLE People ADD Email varchar(80);
Query OK, 0 rows affected (0.77 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> describe People;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| id    | int         | YES  |     | NULL    |       |
| name  | varchar(80) | YES  |     | NULL    |       |
| Email | varchar(80) | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql>
mysql>