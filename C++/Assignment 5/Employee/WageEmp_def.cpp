#include "WageEmp.h"

WageEmp::WageEmp(int emp_id, int age, const char* name, int d, int m, int y, int h, int r) :
	Employee(age, name, d, m, y) {
	hours = h;
	rate = r;
}

int WageEmp::calSalary() {
	return hours * rate;
}

void WageEmp::accept() {
	Employee::accept();
	cout << "Enter hours = "; cin >> hours;
	cout << "Enter Rate = "; cin >> rate;
}

void WageEmp::display()  {
	Employee::display();
	cout << "\nHours = " << hours << endl;
	cout << "Rate = " << rate << endl;
	cout << "Salary : " << calSalary() << endl;
}

