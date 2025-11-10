#include "WageEmp.h"

WageEmp::WageEmp(int emp_id, int age, const char* name, int d, int m, int y, int h, int r) :
	Employee(age, name, d, m, y) {
	hours = h;
	rate = r;
}

void WageEmp::display(){
	Employee::display();
	cout << "\nHours = " << hours<<endl;
	cout << "Rate = " << rate << endl;

}

double WageEmp::calSalary() const{
	return hours * rate;
}