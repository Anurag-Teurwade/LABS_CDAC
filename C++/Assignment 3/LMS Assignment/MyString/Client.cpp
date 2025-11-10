#include "MyString.h"

int main() {

	MyString s1;
	s1.display();

	MyString s2("Anurag");
	s2.display();

	MyString s3(s2);
	s3.display();

	return 0;
}