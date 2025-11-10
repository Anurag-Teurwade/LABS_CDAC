#include"Employee.h"


Employee::Employee(int a,const char* name, int d, int m, int y):
	name(name), dob(d, m, y) 
{
	age = a;
}

void Employee::accept() {
	cout << "Enter Employee Details :: " << endl;
    name.accept();
	cout << "Age = "; cin >> age;
    dob.accept();
	
}

void Employee::display() {
	cout << "\n\nEmployee Details :: ";
	cout << "\nName : "  ; name.display();
	cout << "\nAge = " << age ;
	cout << "\nDate of Birth : "; dob.display();
	
}

Employee::~Employee() {}

