public String[] groupAnagrams(String[] list)
{
    HashMap<String, LinkedList> map = new HashMap<String, LinkedList>();
    for(String str : list)
    {
        String sortedWord = sortString(str);
        LinkedList anagramList = map.get(sortedWord);
        if(anagramList == null)
        {
            anagramList = new LinkedList();
        }
        anagramList.addBack(str);
    }
    String[] sortedList = new String[list.length];
    int i = 0;
    for(LinkedList anagramList : map.entrySet())
    {
        for(String word : anagramList)
        {
            sortedList[i++] = word;
        } 
    }
    return sortedList;
}

public String sortString(String word)
{
    char[] ar = word.toCharArray();
    Arrays.sort(ar);
    return new String(ar);
}
