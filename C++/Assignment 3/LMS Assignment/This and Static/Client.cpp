#include "Account.h"

int main() {
	Account a1("Sandesh", 1000);
	Account a2("Yash", 2000);

	a1.display();
	a1.balancewithIntereset();

	cout << "\n";

	a2.display();
	a2.balancewithIntereset();

	cout << "Balance after updating rate interest : ";
	a1.updateInRate(10);

	a1.display();
	a1.balancewithIntereset();

	return 0;
}