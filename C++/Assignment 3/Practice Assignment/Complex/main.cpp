#include "complex.h"

int main() {
	Complex c1;
	Complex c2(2, 5);

	c1.display();
	c2.display();

	c2.setReal(4);
	c2.setImg(8);

	c2.display();

}