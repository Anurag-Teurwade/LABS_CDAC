#pragma once
#include<iostream>
using namespace std;

class MyString {

public:
	MyString();

	MyString(const char* s);

	MyString(const MyString& ms);

	~MyString();

	void display() const;

private:
	size_t len;
	char* str;
};
