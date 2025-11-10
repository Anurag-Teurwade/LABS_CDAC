#include"Date.h"

Date::Date(int dd, int mm, int yy) {
	day = dd;
	month = mm;
	year = yy;
}

 void Date::accept() {
	cout << "\nEnter date of birth :";
	cin >> day >> month >> year;
}

 void Date::display() {
	 cout << day << "/" << month << "/" << year;
 }