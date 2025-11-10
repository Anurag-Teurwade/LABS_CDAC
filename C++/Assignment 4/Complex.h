#include<iostream>
using namespace std;

class Complex
{
public:
	Complex() = default;
	Complex(int, int);

	//BINARY OPERATOR
	Complex operator+(Complex&);
	Complex operator-(Complex&);
	Complex operator*(Complex&);

	//unary operator
	Complex operator++();
	Complex operator++(int);

	Complex operator-();

	friend Complex operator+(int ,Complex&);


	void display();
private:
	int real = 0, imaginary = 0;
};