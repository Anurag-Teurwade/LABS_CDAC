#pragma once
#include"Employee.h"

class WageEmp : public Employee {
public:
	WageEmp() = default;
	WageEmp(int emp_id, int age, const char* name, int d, int m, int y, int h, int r);

	virtual void accept() override;
    virtual void display() override ;
	int calSalary();
   
private:
        int hours = 0, rate = 0;
	    
};
