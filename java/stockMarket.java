public int stockMarket(int[] ar)
{
    int min_i = 0, max = 0;
    Pair pair = new Pair(0, 0);
    for(int i = 1; i < ar.length; i++)
    {
        if(ar[i] < ar[min_i])
            min_i = i;
        if(ar[i] - ar[min_i] > max)
        {
            pair.min = min_i;
            pair.max = i;
            max = ar[i] - ar[min_i];
        }
    }
    return max;
}

class Pair {
    int min;
    int max;
    public Pair(int min, int max)
    {
        this.min = min;
        this.max = max;
    }
}
