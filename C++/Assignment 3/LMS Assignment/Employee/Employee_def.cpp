#include<iostream>
#include<cstring>
#include"Employee.h";
using namespace std;

Employee::Employee() {
	employee_id = 0;
	employee_name = new char[1];
	employee_name[0] = '\0';
	salary = 0.0f;
}

Employee::Employee(int id , char * name , float sal) {
 
	employee_id = id;
	employee_name = new char[strlen(name) + 1];
	employee_name = name;
	salary = sal;
}


