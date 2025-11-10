#pragma once

class Array {
public:
	Array(); //default constructor
	Array(int s);  //Parameterized constructor

	Array(const Array& a); //Copy constructor


	~Array(); //Destructor

	Array operator+(const Array&);

	void display();


private:
	int size;
	int* arr;

};
