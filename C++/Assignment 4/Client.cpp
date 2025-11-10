#include"Complex.h"


int main()
{
	cout << "\nc1:";

	Complex c1;
	c1.display();


	cout << "\nc2:";

	Complex c2(4, 5);
	c2.display();

	cout << "\nc3:";

	Complex c3(1, 8);
	c3.display();

	cout << "\n-----Binary Operator-----";

	cout << "\nAddition is:";
	c1 = c2 + c3;
	c1.display();


	cout << "\nSubtraction is:";
	c1 = c2 - c3;
	c1.display();


	cout << "\nMultiplication is:";
	c1 = c2 * c3;
	c1.display();

	cout << "\n-----Unary Operator-----";

	cout << "\nPre-increment:: ";
	c2 = ++c3;
	c2.display();

	cout << "\nPost-increment:: ";
	c2 = c3++;
	c2.display();

	cout << "\n minus operator ::";
	c2 = -c3;
	c2.display() ;

	cout << "\nAdding build-in and UDT: ";
	c2 = 5 + c3;
	c2.display();

	return 0;
}