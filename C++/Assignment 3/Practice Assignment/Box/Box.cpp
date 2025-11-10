#include<iostream>
#include"Box.h";
using namespace std;

Box::Box() {
	ht = 0, wd = 0, dp = 0;
}

Box::Box(int h, int w, int d) {
	ht = h;
	wd = w;
	dp = d;
}

int Box::calvol(int ht, int wd, int dp) {
	return ht * wd * dp;
}
