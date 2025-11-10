#include <iostream>
#include "Array.h"
using namespace std;

//Default constructor
Array::Array() {
	cout << "Default values of array : " << endl;
	size = 5;
	arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = 0;
	}
}

//Parameterized constructor
Array::Array(int s) {
	cout << "\nAfter passing the size of array : " << endl;
	size = s;
	arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = i + 1;
	}

}

//Copy constructor
Array::Array(const Array &a) {
	cout << "\nAfter copying a2 in a3 : " << endl;
	size = a.size;
	arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = a.arr[i];
	}
}

//Destructor
Array::~Array() {
	if (arr) {
		delete[]arr;
	}
	arr = NULL;
	
}

//two array
Array Array::operator+(const Array& a) {

	int newSize = (size < newSize) ? size : newSize;
	Array temp(newSize);
	for (int i = 0; i < newSize; i++) {
		temp.arr[i] = this->arr[i] + a.arr[i];
	}
	return temp;
}

//Displaying the array
void Array::display() {
	for (int i = 0; i < size; i++) {
		cout << " " << arr[i];
	}
}

