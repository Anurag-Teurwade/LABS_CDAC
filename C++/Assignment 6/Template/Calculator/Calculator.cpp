#include<iostream>
using namespace std;

template <class T>
class Calculator {

private:
	T num1, num2;

public:
	Calculator(T n1, T n2) {
		num1 = n1;
		num2 = n2;
	}

	T add() {
		return num1 + num2;
	}

	T subtract() {
		return num1 - num2;
	}

	T multiply() {
		return num1 * num2;
	}

	T divide() {
		if (num2 != 0) {
			return num1 / num2;


		}
		else {
			cout << "Division by Zero is not possible!";
			return 0;

		}
	}
};

	 int main() {
		
		 Calculator<int> c1(10,0);
		 cout << "--Integer -- " <<endl;
		 cout <<"Addition : " << c1.add() <<endl;
		 cout << "Substraction : " << c1.subtract() << endl;
		 cout << "Multiplication : " << c1.multiply() << endl;
		 cout << "Division : " << c1.divide() << endl;

		 Calculator<float> c2(10.5, 5.5);
		 cout << "\n--Float -- " << endl;
		 cout << "Addition : " << c2.add() << endl;
		 cout << "Substraction : " << c2.subtract() << endl;
		 cout << "Multiplication : " << c2.multiply() << endl;
		 cout << "Division : " << c2.divide() << endl;
		 
		 return 0;
	 }