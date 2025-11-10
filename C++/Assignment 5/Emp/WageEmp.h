#pragma once
#include"Employee.h"

class WageEmp : public Employee {
public:
	WageEmp() = default;
	WageEmp(int emp_id, int age, const char* name, int d, int m, int y, int h, int r);

	void display() ;
	double calSalary() const;



protected:

        int hours = 0;
	    int rate = 0;
};
