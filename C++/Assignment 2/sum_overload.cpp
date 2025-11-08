#include <iostream>
using namespace std;

int sum(int a, int b) { return a + b; }
float sum(float a, float b) { return a + b; }
float sum(int a, float b) { return a + b; }

int main() {
    cout << "Sum(int): " << sum(5, 7) << endl;
    cout << "Sum(float): " << sum(3.5f, 4.2f) << endl;
    cout << "Sum(mix): " << sum(5, 2.5f) << endl;
}
