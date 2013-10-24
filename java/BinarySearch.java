//ITERATIVE

public int binarySearch(int[] A, int key, int imin, int imax) {
	int imid;
	while (imin <= imax) {
		imid = (imin + imax) / 2;
		if (a[imid] < key)
	  		imax = imid - 1;
		else if (a[imid] > key)
   			imin = imid + 1;
		else 
   			return imid;
	}
	return -1;
}

//RECURSIVE

public int binarySearch(int[] A, int key, int imin, int imax) {
	if(imax > imin)
		return -1;
	else {
		int imid = (imin + imax) / 2;
		if (A[imin] < key)
		   	binarySearch(A, key, imin, imid - 1)
		else if (A[imin] > key)
			binarySearch(A, key, imid + 1, imax)
		else
			return imid;
	}
}
