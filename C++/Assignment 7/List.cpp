#include<iostream>
#include<list>
using namespace std;

void displayList(const list<int>& numbers, const string& msg) {
	cout << msg << endl;
	for (int n : numbers) {
		cout << n << " ";
	}
	cout << endl;
}

int main() {


	list<int> numbers = { 10,20,30,40 };

	int x = 50, y = 60, z = 30;

	displayList(numbers, "Initial elements :"); 

	numbers.push_front(x);
	displayList(numbers, "After inserting element at the beginning :");

	numbers.push_back(y);
	displayList(numbers, "After inserting element at the ending :");

	numbers.remove(z);
	displayList(numbers, "After removing element from list : ");




	return 0;
}