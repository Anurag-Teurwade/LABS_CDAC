#pragma once

class Employee {

public :
	Employee();

	Employee(int,char,float);

	Employee(const Employee& emp);

	~Employee();

	void accept();
	void display();

private:
	int employee_id;
	char* employee_name;
	float salary;
};
