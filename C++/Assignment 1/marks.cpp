#include <iostream>
using namespace std;

int main() {
    int marks[5], sum = 0;
    float avg;

    cout << "Enter marks of 5 subjects: ";
    for (int i = 0; i < 5; i++) {
        cin >> marks[i];
        sum += marks[i];
    }

    avg = sum / 5.0;

    cout << "Sum = " << sum << endl;
    cout << "Average = " << avg << endl;

    return 0;
}
