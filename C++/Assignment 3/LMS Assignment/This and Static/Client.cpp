#include "Date.h"

int main() {
	Date d1;
	Date d2(25, 8, 2025);
	Date d3(d2);

	d1.showDate();
	d2.showDate();
	d3.showDate();

	Date::showCount(); //Static member function  called without an object .

	return 0;
}