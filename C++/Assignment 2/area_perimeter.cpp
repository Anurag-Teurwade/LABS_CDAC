#include <iostream>
#include <cmath>
using namespace std;

const float PI = 3.14159;

void circle(float r, float& area, float& peri) {
    area = PI * r * r;
    peri = 2 * PI * r;
}

void square(float a, float& area, float& peri) {
    area = a * a;
    peri = 4 * a;
}

void rectangle(float l, float b, float& area, float& peri) {
    area = l * b;
    peri = 2 * (l + b);
}

void triangle(float base, float height, float side1, float side2, float& area, float& peri) {
    area = 0.5 * base * height;
    peri = base + side1 + side2;
}

int main() {
    int ch;
    float area, peri;
    do {
        cout << "\n1.Circle  2.Square  3.Rectangle  4.Triangle  5.Exit\nEnter choice: ";
        cin >> ch;
        switch (ch) {
        case 1: {
            float r; cout << "Enter radius: "; cin >> r;
            circle(r, area, peri); break;
        }
        case 2: {
            float a; cout << "Enter side: "; cin >> a;
            square(a, area, peri); break;
        }
        case 3: {
            float l, b; cout << "Enter length & breadth: "; cin >> l >> b;
            rectangle(l, b, area, peri); break;
        }
        case 4: {
            float base, h, s1, s2; cout << "Enter base, height, side1, side2: ";
            cin >> base >> h >> s1 >> s2;
            triangle(base, h, s1, s2, area, peri); break;
        }
        case 5: return 0;
        }
        cout << "Area = " << area << ", Perimeter = " << peri << endl;
    } while (ch != 5);
}
