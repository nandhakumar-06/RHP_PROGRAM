//To check if the given string contains all digits (0-9)
#include <iostream>
using namespace std;

int main() {
    char str[1000001];
    cin >> str;

    int mask = 0;

    for (int i = 0; str[i]; i++) {
        char ch = str[i];

        if (ch >= '0' && ch <= '9')
            mask |= (1 << (ch - '0'));
    }

    if (mask == (1 << 10) - 1)
        cout << "Yes";
    else
        cout << "No";

    return 0;
}
