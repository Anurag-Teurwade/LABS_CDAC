#include"student.h"

int Student::counter = 100;

Student::Student() {
	rollno = ++counter;
	strcpy_s(name, "unknown");
	dob = Date(1,1,2025);
}

Student::Student( const char* nm, int dd, int mm, int yy) {
	rollno = ++counter;
	strcpy_s(name, nm);
	dob = Date(dd, mm, yy);
}

void Student::accept() {
	rollno = ++counter;
	cout << "\nEnter name : ";
	cin.ignore();
	cin.getline(name , 50);
	dob.accept();
}

void Student::display() {
	cout << "\nName of student : " << name;
	cout << "\nRoll no : " << rollno;
	cout << "\nDate of birth : ";
	dob.display();
	cout << "\n";
}


