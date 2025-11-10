#include "SalesPerson.h"
#include <iostream>
using namespace std;

SalesPerson::SalesPerson(int id, const char* name, int d, int m, int y, int h, int r, int items, double comm)
    : WageEmp(id, name, d, m, y, h, r) {
    this->items = items;
    this->commission = comm;
}

double SalesPerson::salesPersonSalary() const {
    return (hours * rate) + (items * commission);
}

void SalesPerson::display() const {
    WageEmp::display();
    cout << "Items Sold = " << items << endl;
    cout << "Commission per Item = " << commission << endl;
    cout << "SalesPerson Salary = " << salesPersonSalary() << endl;
}
