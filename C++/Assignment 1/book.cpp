#include <iostream>
#include <cstring>
using namespace std;

typedef struct {
    int bookId;
    char title[50];
    float price;
} BOOK;

int main() {
    BOOK b;

    cout << "Enter Book ID: ";
    cin >> b.bookId;
    cin.ignore();  // clear buffer
    cout << "Enter Book Title: ";
    cin.getline(b.title, 50);
    cout << "Enter Book Price: ";
    cin >> b.price;

    cout << "\nBook Details:" << endl;
    cout << "ID: " << b.bookId << endl;
    cout << "Title: " << b.title << endl;
    cout << "Price: " << b.price << endl;

    return 0;
}
