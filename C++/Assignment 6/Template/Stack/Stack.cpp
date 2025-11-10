
#include <iostream>
using namespace std;

template<class T>
class Stack {
private:
    int size;
    int top;
    T* arr;

public:
    // Default constructor
    Stack(int s = 5) {
        size = s;
        arr = new T[size];
        top = -1;
    }

    // Push function
    void push(T data) {
        if (top == size - 1) {
            cout << "Stack Overflow" << endl;
            return;
        }
        arr[++top] = data;
    }

    // Pop function
    void pop() {
        if (top == -1) {
            cout << "Stack Underflow" << endl;
        }
        else {
            top--;
        }
    }

    // Display function
    void display() {
        if (top == -1) {
            cout << "Stack is empty" << endl;
            return;
        }
        for (int i = 0; i <= top; i++) {
            cout << arr[i] << " ";
        }
        cout << endl;
    }

    // Destructor
    ~Stack() {
        delete[] arr;
    }
};

// Complex number class for testing
class Complex {
private:
    int real, imag;
public:
    Complex(int r = 0, int i = 0) : real(r), imag(i) {}
    friend ostream& operator<<(ostream& out, const Complex& c) {
        out << c.real << "+" << c.imag << "i";
        return out;
    }
};

int main() {
    // Integer stack
    Stack<int> s1;
    s1.push(10);
    s1.push(20);
    s1.display();
    s1.pop();
    s1.display();

    // Double stack
    Stack<double> s2;
    s2.push(1.5);
    s2.push(2.7);
    s2.display();

    // Complex number stack
    Stack<Complex> s3;
    s3.push(Complex(3, 4));
    s3.push(Complex(5, 6));
    s3.display();

    return 0;
}

