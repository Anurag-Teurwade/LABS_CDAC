#include <iostream>
using namespace std;

void swapAddress(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
    cout << "Inside swapAddress: a = " << *a << ", b = " << *b << endl;
}

int main() {
    int x, y;
    cout << "Enter two numbers: ";
    cin >> x >> y;

    cout << "Before swap: x = " << x << ", y = " << y << endl;
    swapAddress(&x, &y);
    cout << "After swap (main): x = " << x << ", y = " << y << endl;

    return 0;
}
