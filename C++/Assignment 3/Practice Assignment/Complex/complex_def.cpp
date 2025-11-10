#include<iostream>
#include"complex.h"
using namespace std;

Complex::Complex() {
	real = 0, img = 0;
}

Complex::Complex(int r,int i) {
	 real = r; 
	 img = i;
}

int Complex::getReal() {
	return real;
}

int Complex::getImg() {
	return img;
}

void Complex:: setReal(int r) {
	real = r;
}

void Complex::setImg(int i) {
	img = i;
}

void Complex::display() {
	cout << real << "+" << img << "i" << endl;
}