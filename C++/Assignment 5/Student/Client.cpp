#include"Student.h"

int main() {

	//Date();
	//Date p1(12, 5, 2034);
	//p1.display();

	//Date p2;
	//p2.accept();
	//p2.display();

	Student s;
	s.display();
	Student s2("anurag", 12, 5, 2015);
	s2.display();

	Student s3;
	s3.accept();
	s3.display();

	return 0;
}