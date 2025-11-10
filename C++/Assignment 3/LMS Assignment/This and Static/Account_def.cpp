#include"Account.h"

int Account::nextAccno = 0;
float Account::rate = 5.0f;

Account::Account(string nm, float b) {
	name = nm;
	bal = b;
	accno = ++nextAccno;
}

void Account::display() const {

	cout << "Account No : " << accno << " , Name : " <<name << " , Balance : "<<bal << endl;

}

void Account::balancewithIntereset()const {

	int newBal = bal + (bal * rate / 100);
	cout << "Balance with interest : " << newBal;

}

void Account::updateInRate(float newRate) {
	rate = newRate;
}
