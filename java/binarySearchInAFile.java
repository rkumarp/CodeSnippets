// open the file for reading
RandomAccessFile raf = new RandomAccessFile("myfile.txt","r");
String searchValue = "myline";
int lineSize = 50;
int numberOfLines = raf.length() / lineSize;

// perform the binary search...
byte[] lineBuffer = new byte[lineSize];
int bottom = 0;
int top = numberOfLines;
int middle;
while (bottom <= top){
  middle = (bottom+top)/2;
  raf.seek(middle*lineSize); // jump to this line in the file
  raf.read(lineBuffer); // read the line from the file
  String line = new String(lineBuffer); // convert the line to a String

  int comparison = line.compareTo(searchValue);
  if (comparison == 0){
    // found it
    break;
    }
  else if (comparison < 0){
    // line comes before searchValue
    bottom = middle + 1;
    }
  else {
    // line comes after searchValue
    top = middle - 1;
    }
  }

raf.close(); // close the file when you're finished
