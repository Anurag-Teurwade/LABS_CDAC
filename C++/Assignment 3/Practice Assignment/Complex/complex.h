
#pragma once

class Complex {
private :
	int real, img;

public:

	Complex();

	Complex(int real, int img);

	int getReal();
	int getImg();

	void setReal(int real);
	void setImg(int img);

	void display();

};