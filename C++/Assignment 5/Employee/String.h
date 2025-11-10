#pragma once
#include<iostream>
using namespace std;

class String {
public:
    String();
    String(const char* s);
    String(const String& other);
    ~String();

    void accept();
    void display() const;

private:
    size_t len;
    char* str;
};
