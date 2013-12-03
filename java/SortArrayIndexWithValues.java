public class ArrayIndexComparator implements Comparator<Integer>
{
    private final String[] array;

    public ArrayIndexComparator(String[] array)
    {
        this.array = array;
    }

    public Integer[] createIndexArray()
    {
        Integer[] indexes = new Integer[array.length];
        for (int i = 0; i < array.length; i++)
        {
            indexes[i] = i; // Autoboxing
        }
        return indexes;
    }

    @Override
    public int compare(Integer index1, Integer index2)
    {
         // Autounbox from Integer to int to use as array indexes
        return array[index1].compareTo(array[index2]);
    }
}

String[] countries = { "France", "Spain", ... };
ArrayIndexComparator comparator = new ArrayIndexComparator(countries);
Integer[] indexes = comparator.createIndexArray();
Arrays.sort(indexes, comparator);
// Now the indexes are in appropriate order
