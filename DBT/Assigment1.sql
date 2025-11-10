create database mydb;

show databases;

use mydb;


1. Table creation and insertion.


1) Vechicle 

CREATE TABLE vechicle (vid INT , vname VARCHAR(20) , price FLOAT ,discount INT , milage INT , details VARCHAR(200));

INSERT INTO vechicle 
VALUES(1,"Activa" ,80000 ,10 ,35 ,"Two wheeler.Sturdy.Milage 30km"),
(2,"Santro" ,95000,20,20 ,"Product of Hyandai."),
(3, "Yamaha" ,160000, 5 , 70, "Stury and good milage"),
(4,"i-10" , 300000, 8,18, "Good small car"),
(5 , "WaganR" , 250000 , 10 , 25 , "Good milage car"),
(6 , "Hero Splendor" , 75000, 9 , 65 ,  "Best bike"),
(7 , "Royal Enfild" , 190000 , 5 , 40 , "a royal bike");


select * from vechicle;
+------+---------------+--------+----------+--------+--------------------------------+
| vid  | vname         | price  | discount | milage | details                        |
+------+---------------+--------+----------+--------+--------------------------------+
|    1 | Activa        |  80000 |       10 |     35 | Two wheeler.Sturdy.Milage 30km |
|    2 | Santro        |  95000 |       20 |     20 | Product of Hyandai.            |
|    3 | Yamaha        | 160000 |        5 |     70 | Stury and good milage          |
|    4 | i-10          | 300000 |        8 |     18 | Good small car                 |
|    5 | WaganR        | 250000 |       10 |     25 | Good milage car                |
|    6 | Hero Splendor |  75000 |        9 |     65 | Best bike                      |
|    7 | Royal Enfild  | 190000 |        5 |     40 | a royal bike                   |
+------+---------------+--------+----------+--------+--------------------------------+



2) Customer

 CREATE TABLE customer(custid INT , cname VARCHAR(20), location VARCHAR(50));


INSERT INTO customer
VALUES 
(1, "Nilima" , "Pimpri"),
(2, "Ganesh" , "Pune"),
(3, "Kishor" , "Kothrud"),
(4 , "Priya" , "Aundh");

 select * from customer;
+--------+--------+----------+
| custid | cname  | location |
+--------+--------+----------+
|      1 | Nilima | Pimpri   |
|      2 | Ganesh | Pune     |
|      3 | Kishor | Kothrud  |
|      4 | Priya  | Aundh    |
+--------+--------+----------+

3) Salesman

CREATE TABLE salesman (sid INT , sname VARCHAR(20) , city VARCHAR(20) , experience INT );

INSERT INTO salesman 
VALUES
(10 , "Rajesh" , "mumbai" ,5),
(11 , "Seema" , "Pune" , 8),
(12 , "Shailesh" , "Nagpur",7),
(13 , "Rakhi", "Pune" , 2);

select * from salesman;
+------+----------+--------+------------+
| sid  | sname    | city   | experience |
+------+----------+--------+------------+
|   10 | Rajesh   | mumbai |          5 |
|   11 | Seema    | Pune   |          8 |
|   12 | Shailesh | Nagpur |          7 |
|   13 | Rakhi    | Pune   |          2 |
+------+----------+--------+------------+



2. display name of salesman who work in pune

SELECT * 
FROM salesman
WHERE city = "Pune";

+------+-------+------+------------+
| sid  | sname | city | experience |
+------+-------+------+------------+
|   11 | Seema | Pune |          8 |
|   13 | Rakhi | Pune |          2 |
+------+-------+------+------------+

3.delete customer from Pimpri area

delete FROM customer
WHERE location = "Pimpri";

Query OK, 1 row affected (0.01 sec)

mysql> select * from customer;

+--------+--------+----------+
| custid | cname  | location |
+--------+--------+----------+
|      2 | Ganesh | Pune     |
|      3 | Kishor | Kothrud  |
|      4 | Priya  | Aundh    |
+--------+--------+----------+

4.Add some new customer

INSERT INTO customer
VALUES
(5, "Geeta" ,"Pimpri"),
(6, "Raj","Aundh"),
(7 , "Yash" , "Aundh");

 select * from customer;
+--------+--------+----------+
| custid | cname  | location |
+--------+--------+----------+
|      2 | Ganesh | Pune     |
|      3 | Kishor | Kothrud  |
|      4 | Priya  | Aundh    |
|      5 | Geeta  | Pimpri   |
|      6 | Raj    | Aundh    |
|      7 | Yash   | Aundh    |
+--------+--------+----------+

5.delete customer from area Aundh whose name is Priya.

delete from customer 
where cname = "Priya" AND location = "Aundh";

Query OK, 1 row affected (0.01 sec)

select * from customer;
+--------+--------+----------+
| custid | cname  | location |
+--------+--------+----------+
|      2 | Ganesh | Pune     |
|      3 | Kishor | Kothrud  |
|      5 | Geeta  | Pimpri   |
|      6 | Raj    | Aundh    |
|      7 | Yash   | Aundh    |
+--------+--------+----------+

6.Display information of vechicle,Royal Infild

SELECT * FROM vechicle
WHERE vname = "Royal Enfild";

+------+--------------+--------+----------+--------+--------------+
| vid  | vname        | price  | discount | milage | details      |
+------+--------------+--------+----------+--------+--------------+
|    7 | Royal Enfild | 190000 |        5 |     40 | a royal bike |
+------+--------------+--------+----------+--------+--------------+

7.Display info of bikes

SELECT * FROM vechicle 
WHERE milage >= 30;

+------+---------------+--------+----------+--------+--------------------------------+
| vid  | vname         | price  | discount | milage | details                        |
+------+---------------+--------+----------+--------+--------------------------------+
|    1 | Activa        |  80000 |       10 |     35 | Two wheeler.Sturdy.Milage 30km |
|    3 | Yamaha        | 160000 |        5 |     70 | Stury and good milage          |
|    6 | Hero Splendor |  75000 |        9 |     65 | Best bike                      |
|    7 | Royal Enfild  | 190000 |        5 |     40 | a royal bike                   |
+------+---------------+--------+----------+--------+--------------------------------+

8.If buying price of vechicle is 750000 then change it to 80000

 UPDATE vechicle 
 SET price = 80000
 WHERE vid = 6;

+------+---------------+--------+----------+--------+--------------------------------+
| vid  | vname         | price  | discount | milage | details                        |
+------+---------------+--------+----------+--------+--------------------------------+
|    1 | Activa        |  80000 |       10 |     35 | Two wheeler.Sturdy.Milage 30km |
|    2 | Santro        |  95000 |       20 |     20 | Product of Hyandai.            |
|    3 | Yamaha        | 160000 |        5 |     70 | Stury and good milage          |
|    4 | i-10          | 300000 |        8 |     18 | Good small car                 |
|    5 | WaganR        | 250000 |       10 |     25 | Good milage car                |
|    6 | Hero Splendor |  80000 |        9 |     65 | Best bike                      |
|    7 | Royal Enfild  | 190000 |        5 |     40 | a royal bike                   |
+------+---------------+--------+----------+--------+--------------------------------+

9.display info of i-10

SELECT * FROM vechicle
WHERE vname = "i-10";

+------+-------+--------+----------+--------+----------------+
| vid  | vname | price  | discount | milage | details        |
+------+-------+--------+----------+--------+----------------+
|    4 | i-10  | 300000 |        8 |     18 | Good small car |
+------+-------+--------+----------+--------+----------------+

10.Display vid , vname , price , details , and total price of each vechicle
total price = price - discount

SELECT vid , vname , price , details , (price - discount) AS total_price
FROM vechicle;

11.Display all vechicles whose price < 100000

SELECT * FROM vechicle
WHERE price < 100000;

+------+---------------+-------+----------+--------+--------------------------------+
| vid  | vname         | price | discount | milage | details                        |
+------+---------------+-------+----------+--------+--------------------------------+
|    1 | Activa        | 80000 |       10 |     35 | Two wheeler.Sturdy.Milage 30km |
|    2 | Santro        | 95000 |       20 |     20 | Product of Hyandai.            |
|    6 | Hero Splendor | 80000 |        9 |     65 | Best bike                      |
+------+---------------+-------+----------+--------+--------------------------------+

12. Display all the inforamtion of salesman having experience  > 5

SELECT * FROM salesman 
WHERE experience > 5;

+------+----------+--------+------------+
| sid  | sname    | city   | experience |
+------+----------+--------+------------+
|   11 | Seema    | Pune   |          8 |
|   12 | Shailesh | Nagpur |          7 |
+------+----------+--------+------------+

13.New employee schema

CREATE TABLE employee (eno INT , ename VARCHAR(20) , basic FLOAT , incentive FLOAT);

Query OK, 0 rows affected (0.03 sec)

INSERT INTO employee 
VALUES 
(1, "Rajesh" , 20000, 1500),
(2 , "Sarita" , 25000 , 1000),
(3 , "Meera" , 15000 , 3000),
(4, "Jitesh" , 30000 , 500),
(5, "Ramesh" ,12000, 3000);

 SELECT * FROM employee;
+------+--------+-------+-----------+
| eno  | ename  | basic | incentive |
+------+--------+-------+-----------+
|    1 | Rajesh | 20000 |      1500 |
|    2 | Sarita | 25000 |      1000 |
|    3 | Meera  | 15000 |      3000 |
|    4 | Jitesh | 30000 |       500 |
|    5 | Ramesh | 12000 |      3000 |
+------+--------+-------+-----------+

 SELECT * FROM employee
 WHERE basic >15000;

+------+--------+-------+-----------+
| eno  | ename  | basic | incentive |
+------+--------+-------+-----------+
|    1 | Rajesh | 20000 |      1500 |
|    2 | Sarita | 25000 |      1000 |
|    4 | Jitesh | 30000 |       500 |
+------+--------+-------+-----------+

14.Change incentive of jitesh to 1000

UPDATE employee
SET basic=1000
WHERE ename = "Jitesh";

+------+--------+-------+-----------+
| eno  | ename  | basic | incentive |
+------+--------+-------+-----------+
|    1 | Rajesh | 20000 |      1500 |
|    2 | Sarita | 25000 |      1000 |
|    3 | Meera  | 15000 |      3000 |
|    4 | Jitesh |  1000 |       500 |
|    5 | Ramesh | 12000 |      3000 |
+------+--------+-------+-----------+

15.Increase salary of all employees earning < 20000 basic by 5%

UPDATE employee
SET  basic = basic * 1.05
WHERE basic < 20000;

+------+--------+-------+-----------+
| eno  | ename  | basic | incentive |
+------+--------+-------+-----------+
|    1 | Rajesh | 20000 |      1500 |
|    2 | Sarita | 25000 |      1000 |
|    3 | Meera  | 15750 |      3000 |
|    4 | Jitesh |  1050 |       500 |
|    5 | Ramesh | 12600 |      3000 |
+------+--------+-------+-----------+

16.Adding new employee


INSERT INTO employee
VALUES(20 , "Ajay" ,16000 ,null);

+------+--------+-------+-----------+
| eno  | ename  | basic | incentive |
+------+--------+-------+-----------+
|    1 | Rajesh | 20000 |      1500 |
|    2 | Sarita | 25000 |      1000 |
|    3 | Meera  | 15750 |      3000 |
|    4 | Jitesh |  1050 |       500 |
|    5 | Ramesh | 12600 |      3000 |
|   20 | Ajay   | 16000 |      NULL |
+------+--------+-------+-----------+

17.Meera leaves the company

delete from employee
WHERE ename = "Meera";

+------+--------+-------+-----------+
| eno  | ename  | basic | incentive |
+------+--------+-------+-----------+
|    1 | Rajesh | 20000 |      1500 |
|    2 | Sarita | 25000 |      1000 |
|    4 | Jitesh |  1050 |       500 |
|    5 | Ramesh | 12600 |      3000 |
|   20 | Ajay   | 16000 |      NULL |
+------+--------+-------+-----------+

18.Ramesh as promoted as Head Clerk and earns salary 60000.

UPDATE employee
SET basic = 60000
WHERE ename = "Ramesh";


+------+--------+-------+-----------+
| eno  | ename  | basic | incentive |
+------+--------+-------+-----------+
|    1 | Rajesh | 20000 |      1500 |
|    2 | Sarita | 25000 |      1000 |
|    4 | Jitesh |  1050 |       500 |
|    5 | Ramesh | 60000 |      3000 |
|   20 | Ajay   | 16000 |      NULL |

