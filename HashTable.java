

public class HashTable<K, V> {
     private static final int CAPACITY = 100;

     private int size;

     private Pair[] A;

     public HashTable() {
          A = new Pair[CAPACITY];
          size = 0;
     }


     public void set(K key, V value) {
          int i = hash(key) % CAPACITY;


          //check there exists a value at that index and keep incrementing the index

          while(A[i] != null && !key.equals(A[i].k))
               i = (i + 1) % CAPACITY;

          if(A[index] == null)
               size++;
          A[i] = Pair(key, value);

     } 


     public V get(K key) {
          int i = hash(key) % CAPACITY;
          while(A[i] != null && !key.equals(A[i].k) {
               i = (i + 1) % CAPACITY;
          }
          return A[i] == null ? null : A[i].v;
     }


     public void delete(K key) {
          int i = hash(key) % CAPACITY;
          while(A[i] != null && !key.equals(A[i].k) {
               i = (i + 1) % CAPACITY;
          }
         
          //have to move all the values which are forced over by this key
          //TO-DO
          while(A[i] != null) {
          }

     }


     public int hash(K key) {
          return Math.abs(key.hashCode());
     }

     Class Pair {
          K k;
          V v;
          public Pair(K k, V v) {
               this.k = k;
               this.l = l;
          }
     }

}
