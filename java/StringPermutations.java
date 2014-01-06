void permutate(char[] str, int index)
{
    if(index == str.length())
        System.out.println(str);
        
    for(int i = index; i < str.length(); i++)
    {
        swap(str[index], str[i]);
        permutate(str, index + 1);
        swap(str[index], str[i]);
    }
}

permutate("abc", 0);
