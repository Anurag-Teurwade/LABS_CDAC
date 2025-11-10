#include<iostream>
#include<cstring>
#include "MyString.h"
using namespace std;

MyString::MyString() {
	len = 0;
	str = new char[1];
	str[0] = '\0';
}

MyString::MyString(const char* s) {
	len = strlen(s);
	str = new char[len + 1];
	strcpy_s(str,len + 1, s);
}


MyString::MyString(const MyString& ms) {
	len = ms.len;
	str = new char[len + 1];
	strcpy_s(str, len + 1, ms.str);
}

MyString::~MyString() {
	if (str) {
		delete[] str;
	}
	str = nullptr;
}


void MyString::display() const {
	cout << "String : " << str << endl << "length : " << len <<endl;
}