package task08.exercise02;

public interface IntList {

    void add(Integer i);

    /**
     * Insert element by index. All elements from the right will be shifted to right
     */
    void insert(int index, Integer value);

    /**
     * Overwrite value by index
     */
    void set(int index, Integer value);

    /**
     * @return actual number of elements in the list
     */
    int size();

    /**
     * @return how many elements list can contain
     */
    int capacity();

    Integer getByIndex(int index);

    /**
     * @return index of first value occurrence. Return null if no value in the list.
     */
    Integer getIndexByValue(int Integer);

    boolean contains(int Integer);

    void removeValue(int Integer);

    void removeByIndex(int index);

    IntList subList(int fromIndex, int toIndex);

    int[] toArray();
}
