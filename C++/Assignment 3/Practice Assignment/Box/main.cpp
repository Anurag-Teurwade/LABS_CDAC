#include<iostream>
#include"Box.h"
using namespace std;


int main() {
	Box b1;
	Box b2(4, 2, 7);

	cout << "Volume of b1 = " <<
		b1.calvol(0, 0, 0) << endl;
	cout << "Volume of b2 = "<<
	    b2.calvol(4, 2, 7);

}
