#include "SalesPerson.h"
#include <iostream>
using namespace std;

SalesPerson::SalesPerson(int emp_id, const char* name, int d, int m, int y, int h, int r, int items, double comm)
    : WageEmp( emp_id,  age,  name,  d,  m,  y,  h,  r) {
    this->items = items;
    this->commission = comm;
}

double SalesPerson::salesPersonSalary()  {
    return (hours * rate) + (items * commission);
}

void SalesPerson::display()  {
    WageEmp::display();
    cout << "Items Sold = " << items << endl;
    cout << "Commission per Item = " << commission << endl;
    cout << "SalesPerson Salary = " << salesPersonSalary() << endl;
}
