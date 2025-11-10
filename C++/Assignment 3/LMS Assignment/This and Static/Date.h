#pragma once


class Date {
private:
	int day, month, year;
	static int count;

public:

	//default constructor
	Date();

	//parameterized constructor
	Date(int day, int month, int year);

	//copy constructor
	Date(const Date  &d);

	//display func
	void showDate();

	static void showCount();

};

