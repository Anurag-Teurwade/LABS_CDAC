#include"WageEmp.h"

int main() {
	WageEmp w1(101,21,"jerry",12,5,2024 ,100, 500);
	w1.display();
	cout << "Salary : ";
	cout << w1.calSalary();

	cout << endl;

	return 0;
}