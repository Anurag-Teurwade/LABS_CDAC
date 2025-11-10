#pragma once
#include<iostream>
using namespace std;

class Date {
public:
    Date()=default;
    Date(int, int, int);
    void accept();
    void display() const;

private:
    int day = 1, month = 1, year = 2025;
};
