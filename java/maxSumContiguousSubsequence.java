public int maxSumContiguousSubsequence(int[] ar)
{
    int max_value = Integer.MIN_VALUE;
    int sum = Integer.MIN_VALUE;
    for(int i = 0; i < ar.length; i++)
    {
        sum = Math.max(sum + ar[i], ar[i]);
        max_value = Math.max(sum, max_value);
    }
    return max_value;
}
