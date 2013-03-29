#include <fstream>
#include <sstream>

using namespace std;

void read_file() 
{
	string line;
	ifstream myfile("sample.txt");
	while(!myfile.eof()) {
		getline(myfile, line);
		
		//split line into words
		get_words_from_sentence(line);
	}
}

void get_words_from_sentence(const string& line)
{
	string word;
	stringstream ss(line);
	while(!ss.eof()) {
		ss >> word;
		cout << word << endl;
	}
}

string convert_number_to_string(int num)
{
	streamstring ss;
	ss << num;
	return ss.str();
}

int convert_string_to_number(const string& str) 
{
	int result;
	streamstring ss(str);
	if(!(ss >> result))
		result = 0;
	return result
}
