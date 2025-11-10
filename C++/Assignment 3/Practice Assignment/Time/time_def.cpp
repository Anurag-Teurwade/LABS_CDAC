#include<iostream>
#include "Time.h"
using namespace std;

Time::Time() {
	hh = 0, mm = 0, ss = 0;
}

Time::Time(int hh, int mm, int ss) {
	this->hh = hh;
	this->mm = mm;
	this->ss = ss;
}

void Time::showTime() {
	cout << (hh < 10 ? "0" : "") << hh << ":"
		<< (mm < 10 ? "0" : "") << mm << ":"
		<< (ss < 10 ? "0" : "") << ss << endl;
}

void Time::check() {

	if (hh >= 6 && hh <= 18)
		cout << "Day Time!";
	else
		cout << "Night Time!";
	
}