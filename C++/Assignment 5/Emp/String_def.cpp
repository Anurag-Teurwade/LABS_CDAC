#include<iostream>
#include<cstring>
#include "String.h"
using namespace std;

String::String() {
    len = 0;
    str = new char[1];
    str[0] = '\0';
}

String::String(const char* s) {
    len = strlen(s);
    str = new char[len + 1];
    strcpy_s(str, len + 1, s);
}

String::String(const String& other) {
    len = other.len;
    str = new char[len + 1];
    strcpy_s(str, len + 1, other.str);
}

String::~String() {
    delete[] str;
}

void String::accept() {
    char buf[1000];
    cout << "Enter name: ";
    cin.ignore();
    cin.getline(buf, 1000);

    delete[] str;
    len = strlen(buf);
    str = new char[len + 1];
    strcpy_s(str, len + 1, buf);
}

void String::display() const {
    cout << str;
}

