#include <iostream>
using namespace std;

void accept(int arr[], int n) {
    cout << "Enter elements: ";
    for (int i = 0; i < n; i++) cin >> arr[i];
}

void display(int arr[], int n) {
    for (int i = 0; i < n; i++) cout << arr[i] << " ";
    cout << endl;
}

void findMaxMin(int arr[], int n, int& maxi, int& mini) {
    maxi = mini = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] > maxi) maxi = arr[i];
        if (arr[i] < mini) mini = arr[i];
    }
}

bool search(int arr[], int n, int key) {
    for (int i = 0; i < n; i++) if (arr[i] == key) return true;
    return false;
}

void countEvenOdd(int arr[], int n, int& even, int& odd) {
    even = odd = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) even++;
        else odd++;
    }
}

int main() {
    int n; cout << "Enter size of array: "; cin >> n;
    int* arr = new int[n];
    accept(arr, n);
    cout << "Array: "; display(arr, n);

    int maxi, mini; findMaxMin(arr, n, maxi, mini);
    cout << "Max=" << maxi << " Min=" << mini << endl;

    int key; cout << "Enter element to search: "; cin >> key;
    cout << (search(arr, n, key) ? "Found\n" : "Not Found\n");

    int even, odd; countEvenOdd(arr, n, even, odd);
    cout << "Even=" << even << " Odd=" << odd << endl;

    delete[] arr;
}
