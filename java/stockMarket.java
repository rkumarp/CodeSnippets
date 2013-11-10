public int stockMarket(int[] ar)
{
    int min_i = 0, max_profit = 0;
    Pair pair = new Pair(0, 0);
    for(int i = 1; i < ar.length; i++)
    {
        if(ar[i] < ar[min_i])
            min_i = i;
        if(ar[i] - ar[min_i] > max_profit)
        {
            pair.buy = min_i;
            pair.sell = i;
            max_profit = ar[i] - ar[min_i];
        }
    }
    return max;
}

class Pair {
    int buy;
    int sell;
    public Pair(int buy, int sell)
    {
        this.buy = buy;
        this.sell = sell;
    }
}
