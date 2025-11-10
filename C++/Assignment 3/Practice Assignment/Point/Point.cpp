#include<iostream>
#include "Point.h"
using namespace std;

Point::Point() {
	x = 0, y = 0;
}

Point::Point(int x1, int y1) {
	x = x1;
	y = y1;
}

void Point::showPoint() {
	cout << "[" << x << "," << y << "]" << endl;
}

void Point::checkQuadrant() {
	if (x > 0 && y > 0)
		cout << "first quadrant" << endl;
	else if(x < 0 && y > 0)
		cout << "second quadrant" << endl;
	else if (x < 0 && y < 0)
		cout << "third quadrant" << endl;
	else if (x < 0 && y < 0)
		cout << "fourth quadrant" << endl;
	else if (x == 0 && y == 0)
		cout << "Origin" << endl;
	else if (x == 0)
		cout << "On X -Axis" << endl;
	else
		cout << "On Y -Axis" << endl;	
}
