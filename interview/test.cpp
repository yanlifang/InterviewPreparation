#include <iostream> 
#include <string> 

using namespace std; 


int main() {

    string input = "TodayisJuly16th\nTomorrowisJuly17th\n";
    int c = 5;

    string output = "";

    for (int i = 0; i < input.length(); i++) {

        if (input[i] >= 48 && input[i] <= 57 ) {
                output += input[i];
        } else if (input[i] >= 65 && input[i] <= 90) {
            if (input[i] + c > 90) {
                input[i] += c - 25; 
                output += input[i];
            }  else if (input[i] < 65) {
                input[i] += c + 25;
                output[i] = input[i];
            }else {
                output += input[i] + c;
            }
        }
        else if (input[i] >= 97 && input[i] <= 122) {
            if (input[i] + c > 122) {
                input[i] += c - 25; 
                output += input[i];
            }  else if (input[i] < 97) {
                input[i] += c + 25;
                output[i] = input[i];
            } else {
                output += input[i] + c;
            }
        }
    }

    std::cout << output << std::endl;

    return 0;
}