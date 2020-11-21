#include <iostream>
#include <string>

using namespace std;

int main()
{
    for (int i = 0; i < 100; i++)
    {
        string hello = "C++: Hello World!";
        cout << hello << " No." << i << endl;
    }
    return 0;
}

//  g++ hello.cpp && ./a.out