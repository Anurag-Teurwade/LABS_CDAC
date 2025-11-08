#include <iostream>
using namespace std;

int main() {
    float BS, HRA, DA, GS, PF, NetSalary;

    cout << "Enter Basic Salary: ";
    cin >> BS;

    HRA = 0.15 * BS;
    DA = 0.30 * BS;
    GS = BS + HRA + DA;
    PF = 0.125 * GS;
    NetSalary = GS - PF;

    cout << "Net Salary = " << NetSalary << endl;
    return 0;
}
