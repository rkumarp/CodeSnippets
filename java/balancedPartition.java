public int balancedPartition(int[] ar)
{
    int N = ar.length;
    int M = 0;
    for(int i = 0; i < N; i++)
    {
        M += ar[i];
    }
    M = M / 2;
    
    boolean[][] solution = boolean[N + 1][M + 1];

    for(int m = 1; m <= M; m++)
        solution[0][m] = false;
    for(int n = 0; n <= N; n++)
        solution[n][0] = true;
        
    for(int m = 1; m <= M; m++)
    {
        for(int n = 1; n <= N; n++)
        {
            solution[n][m] = solution[n -1][m];
            if(ar[n] <= j)
                solution[n][m] = (solution[n - 1][m] || solution[n - 1][m - ar[n]]);
        }
    }
}
