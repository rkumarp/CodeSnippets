public void quickSort(int[] ar, int start, int end)
{
    if(start > end) return;

    Random rand = new Random();
    int pivot_i = start + rand.nextInt(end - start + 1);

    int pivot = ar[pivot_i];
    ar[pivot_i] = ar[end];
    ar[end] = pivot;

    int store_i = start;
    int temp;
    for(int i = start; i < end; i++)
    {
        if(ar[i] <= pivot)
        {
            temp = ar[i];
            ar[i] = ar[store_i];
            ar[store_i++] = temp;
        }
    }
    ar[end] = ar[store_i];
    ar[store_i] = pivot;
    quickSort(ar, start, store_i - 1);
    quickSort(ar, store_i + 1, end);
}
