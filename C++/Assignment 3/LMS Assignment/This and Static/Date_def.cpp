#include<iostream>
#include "Date.h"
using namespace std;

int Date::count = 0;

Date::Date() {
	cout << "Default constructor invoked" << endl;
	 day = 1;
	 month = 1;
	 year = 2000;
	 count++;
}

Date::Date( int day, int month, int year) {
	
	this->day = day;
	this->month = month;
	this->year = year;
	count++;
}

Date::Date(const Date &d) {
	
	day = d.day;
	month = d.month;
	year = d.year;
	count++;
}

void Date::showDate() {
	cout << day << "/" << month << "/" << year <<endl;
}

void Date::showCount() {
	cout << "Number of object created : " << count << endl;
}