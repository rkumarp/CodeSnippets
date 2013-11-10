public int maxSumSubArray(int[] ar)
{
    int max_sum = ar[0], sum = ar[0];
    for(int i = 1; i < ar.length; i++)
    {
        sum = Math.max(ar[i], sum + ar[i]);
        if(sum > max_sum)
            max_sum = sum;
    }
    return max_sum;
}
