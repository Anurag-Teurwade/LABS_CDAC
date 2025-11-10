
#include"Date.h"
#include"String.h"
#include<iostream>
using namespace std;

class Employee {

public :

	Employee() = default;
	Employee(int a, const char* name, int d, int m, int y);

	void display();

private:
	int age=0;
	Date dob;
	String name;

};