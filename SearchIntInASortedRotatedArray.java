public int getMinElement(int[] a, size n) {
    int start, mid, end;
    start  = 0;
    end = n - 1
    while(start < end) {
        mid = (start + end) / 2;

        //pick left
        if(a[start] > a[mid]) end = mid - 1;
         
        //pick right
        else start = mid + 1
    }
    return a[start];
}
