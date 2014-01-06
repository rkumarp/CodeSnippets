void combine(String instr, StringBuffer outstr, int index)
{
    for (int i = index; i < instr.length(); i++)
    {
        outstr.append(instr.charAt(i));
        System.out.println(outstr);
        combine(instr, outstr, i + 1);
        outstr.deleteCharAt(outstr.length() - 1);
    }
} 

combine("abc", new StringBuffer(), 0);
