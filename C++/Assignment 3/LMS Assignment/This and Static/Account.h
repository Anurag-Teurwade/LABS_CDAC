#pragma once

#include<iostream>
using namespace std;

class Account {
private:
	int accno;
	string name;
	float bal;
	int static nextAccno;
	float static rate;

public :

	Account(string n, float b);

	void display() const ;

	void balancewithIntereset() const;

    static void updateInRate(float newRate);
};
