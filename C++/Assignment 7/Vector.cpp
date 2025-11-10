#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

void display(const vector<int>& marks, const string& msg) {
	cout << msg;
	for (int m : marks) {
		cout << m << " ";
	}
	cout << endl;
}

int main() {
	vector<int> marks = { 86 ,75 ,64 ,85 ,93 };
	display(marks, "Initial marks : ");

	int highest = *max_element(marks.begin(), marks.end());
	int lowest = *min_element(marks.begin(), marks.end());

	cout << "Highest marks : " << highest << endl;
	cout << "Lowest marks : " << lowest << endl;

	double sum = 0;
	for (int m : marks) {
		sum += m;
	}
	double avg = sum / marks.size();
	cout << "Average marks : " << avg << endl;

	sort(marks.begin(), marks.end());
	display(marks, "After sorting : ");

	return 0;
}