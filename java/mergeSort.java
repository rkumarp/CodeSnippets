public void mergeSort(int[] ar)
{
    if(ar.length < 2) return;
    int mid = (ar.length + 1) / 2;
    int[] left = Arrays.copyOfRange(ar, 0, mid);
    int[] right = Arrays.copyOfRange(ar, mid, ar.length);
    mergeSort(left);
    mergeSort(right);
    merge(ar, left, right);
}

public void merge(int[] ar, int[] left, int[] right)
{
    int i = 0, j = 0;
    
    //iterate through the arrays
    while(i < left.length || j < right.length)
    {
        if(i == left.length)
        {
            ar[i + j] = right[j];
            j++;
        }
        else if(j == right.length)
        {
            ar[i + j] = left[i];
            i++;
        }
        else if(left[i] <= right[j])
        {
            ar[i + j] = left[i];
            i++;
        }
        else
        {
            ar[i + j] = right[j];
            j++;
        }
    }
}
