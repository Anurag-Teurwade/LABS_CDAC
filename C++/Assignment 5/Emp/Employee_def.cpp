#include"Employee.h"


Employee::Employee(int a,const char* name, int d, int m, int y):
	name(name), dob(d, m, y) 
{
	age = a;
}


void Employee::display() {
	cout << "\nEmployee Details :: " << endl;
	cout << "\nName : "  ;
	name.display();
	cout << "\nAge = " << age<<endl;
	cout << "\Date : ";
	dob.display();
}