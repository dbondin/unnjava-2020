#include <iostream>

class Box {
public:
  double width;
  double height;
  double length;
};

int main() {
  Box b;
  b.width = 2.0;
  // Box b2 = b; // COPY
  Box & b2 = b; // REFERENCE to existing object, NOT a copy

  std::cout << "b.width = " << b.width <<"; b2.width = " << b2.width << std::endl;
  b.width = 5.0;
  std::cout << "b.width = " << b.width <<"; b2.width = " << b2.width << std::endl;
  b2.width = 6.0;
  std::cout << "b.width = " << b.width <<"; b2.width = " << b2.width << std::endl;

  return 0;
}
