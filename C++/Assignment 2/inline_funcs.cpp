#include <iostream>
using namespace std;

inline int square(int x) { return x * x; }
inline int cube(int x) { return x * x * x; }
inline int maxNum(int a, int b) { return (a > b ? a : b); }

int main() {
    int a, b;
    cout << "Enter two numbers: "; cin >> a >> b;
    cout << "Square of " << a << " = " << square(a) << endl;
    cout << "Cube of " << a << " = " << cube(a) << endl;
    cout << "Max = " << maxNum(a, b) << endl;
}
