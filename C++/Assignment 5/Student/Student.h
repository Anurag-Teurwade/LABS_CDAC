#pragma once
#include "Date.h"
#include<iostream>
#include<cstring>
using namespace std;

class Student {

public:
	Student();

	Student( const char * nm, int day, int mm, int yy);

	void accept();
	void display();

private:
	static int counter;
    int rollno;
	char name[50];
	Date dob;

};