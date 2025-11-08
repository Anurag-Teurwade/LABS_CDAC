#include <iostream>
using namespace std;

struct Student {
    int roll;
    string name;
    int totalMarks;
};

int main() {
    Student s[5];
    for (int i = 0; i < 5; i++) {
        cout << "Enter Roll, Name, Marks of student " << i + 1 << ": ";
        cin >> s[i].roll >> s[i].name >> s[i].totalMarks;
    }
    int maxIndex = 0;
    for (int i = 1; i < 5; i++)
        if (s[i].totalMarks > s[maxIndex].totalMarks) maxIndex = i;

    cout << "\nStudent with max marks: " << s[maxIndex].name
        << " (" << s[maxIndex].totalMarks << ")\n";
}
