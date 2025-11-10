#pragma once

class Box {
private:
	int ht, wd, dp;

public:
	Box();
	Box(int ht, int wd, int dp);

	int calvol(int ht, int wd, int dp);
};