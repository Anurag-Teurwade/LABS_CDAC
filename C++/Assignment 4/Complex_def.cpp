#include"Complex.h"

Complex::Complex(int r, int img)
{
	real = r;
	imaginary = img;
}

//operator overloaading
//Binary operator

Complex Complex::operator+(Complex& c)
{
	Complex temp;

	temp.real = this->real + c.real;
	temp.imaginary = this->imaginary + c.imaginary;

	return temp;
}
Complex Complex::operator*(Complex& c)
{
	int newReal = (real * c.real) - (imaginary * c.imaginary);
	int newImag = (real * c.imaginary) + (imaginary * c.real);
	return Complex(newReal, newImag);
}

Complex Complex::operator-(Complex& c)
{
	Complex temp;

	temp.real = this->real - c.real;
	temp.imaginary = this->imaginary - c.imaginary;

	return temp;
}

//Unary Operator

//Pre-increment
Complex Complex::operator++() {
	++this->real;
	++this->imaginary;
	return (*this);

}

//Post-increment
Complex Complex::operator++(int n) {
	Complex temp = *this;
	this->real++;
	this->imaginary++;

	return temp;

}

//Overload unary operator
Complex Complex::operator-() {
	Complex temp;
	temp.real = -this->real;
	temp.imaginary = -this->imaginary;
	return temp;
};


Complex operator+(int n, Complex& c)
{
	Complex temp;
	temp.real = n + c.real;
	temp.imaginary = n + c.imaginary;

	return temp;
}


void Complex::display()
{
	cout  << real <<  " + " << imaginary << "i";

}