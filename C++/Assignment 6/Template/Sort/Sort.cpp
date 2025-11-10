#include<iostream>
using namespace std;

template <typename T>
void sort(T arr[], int n) {
	for (int i = 0; i < n - 1; i++) {
		for (int j = 0; j < n - i - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				T temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}
}

int main() {

	int intArr[] = { 1,2,3,4,5 };
	float floatArr[] = { 1.1 ,2.2 ,3.3 ,4.4 };
	char charArr[] = { 'A' , 'B' , 'C' , 'D' };

	int n1 = sizeof(intArr) / sizeof(intArr[0]);
	int n2 = sizeof(floatArr) / sizeof(floatArr[0]);
	int n3 = sizeof(charArr) / sizeof(charArr[0]);

	sort(intArr, n1);
	sort(floatArr, n2);
	sort(charArr, n3);

	cout << "sort int array :";
	for (int i : intArr) {
		cout << i << " ";
	}

	cout << "\nsort float array :";
	for (float i : floatArr) {
		cout << i << " ";
	}

	cout << "\nsort char array :";
	for (char i : charArr) {
		cout << i << " ";
	}


	

	return 0;

}