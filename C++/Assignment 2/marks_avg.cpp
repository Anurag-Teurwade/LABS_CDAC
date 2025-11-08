#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter no. of subjects: ";
    cin >> n;
    int* marks = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
        cout << "Enter marks of subject " << i + 1 << ": ";
        cin >> marks[i];
        sum += marks[i];
    }
    cout << "Total = " << sum << ", Average = " << (float)sum / n << endl;
    delete[] marks;
}
