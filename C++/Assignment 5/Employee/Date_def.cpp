#include "Date.h"


Date::Date(int dd, int mm, int yy) {
    day = dd;
    month = mm;
    year = yy;
}

void Date::accept() {
    cout << "Enter Date : ";
    cin >> day >> month >> year;
}

void Date::display() const {
    cout << day << "/" << month << "/" << year;
}
