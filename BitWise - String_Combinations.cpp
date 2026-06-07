//To generate all combinations of a string
#include <iostream>
using namespace std;

int main() {
    char str[20];
    cin >> str;

    int n = 0;
    while (str[n]) n++;

    int total = (1 << n);

    for (int mask = 1; mask < total; mask++) {
        for (int i = 0; i < n; i++) {
            if (mask & (1 << i))
                cout << str[i];
        }
        cout << "\n";
    }

    return 0;
}
