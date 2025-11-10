#pragma once
#include "WageEmp.h"

class SalesPerson : public WageEmp {
public:
    SalesPerson() = default;
    SalesPerson(int id, const char* name, int d, int m, int y, int h, int r, int items, double comm);

    void display()  ;
    double salesPersonSalary() ;

private:
    int items = 0;
    double commission = 0.0;
};
