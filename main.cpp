#include <fstream>
#include <sstream>

using namespace std;

int main() {
	//read a file
	string line;
	ifstream myfile("sample.txt");
	while(!myfile.eof()) {
		getline(myfile, line);

		//string by space using string stream
		
	}
}

/*
reads the file
@param void
@returns void
*/
void read_file() {
	string line;
	ifstream myfile("sample.txt");
	while(!myfile.eof()) {
		getline(myfile, line);
		
		//split line into words
		get_words_from_sentence(line);
	}
}

/*
splits the sentence by space
@param line
@return void
*/
void get_words_from_sentence(string line) {
	string word;
	istringstream ss(line);
	while(!ss.eof()) {
		ss >> word;
		cout << word << endl;
	}
}
