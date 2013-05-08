#include <iostream>
using namespace std;

void swap(string &str, int i, int j) {
  char temp = str[i];
	str[i] = str[j];
	str[j] = temp;
}

void reverse(string &str, int i){
	for(int j = i; j <= str.size()/2; j++){
		swap(str, j, str.size() - 1 - (j - i));
	}
}

int main() {
	string num;
	cout << "Enter a number:";
	cin >> num;
	for(int i = num.size() - 1; i > 0; i--) {
		if(num[i] > num[i - 1]) {
			int index;
			for(int j = i + 1; j < num.size(); j++) {
				if(num[j] < num[i - 1]) {
					index = j - 1;
					break;
				}
				index = j;
			}
			swap(num, i-1, index);
			reverse(num, i);
			break;
		}
	}
	cout << num;
}
