#include "Array.h"

int main() {
	Array a1;
	a1.display();

	Array a2(5);
	a2.display();

	Array a3(a2);
	a3.display();

	Array a4 = a2 + a3;
	a4.display();

	return 0;
}