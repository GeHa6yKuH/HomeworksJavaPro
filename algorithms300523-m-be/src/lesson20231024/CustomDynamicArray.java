package lesson20231024;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CustomDynamicArray {

    private int[] data;
    private int size;
    private int count;
    private int iterator;


    // O(1)
    public int next() {
        if (isEmpty()) throw new NoSuchElementException();
        if (iterator < count) {
            return get(iterator++);
        } else {
            iterator = 0;
            throw new NoSuchElementException();
        }
    }

    // O(1)
    public boolean hasNext() {
        return iterator < count;
    }


    // O(1)
    public int size() {return size;}


    // O(1)
    public CustomDynamicArray(){
        data = new int[1];
        size = 1;
        count = 0;
    }


    // O(1)
    public CustomDynamicArray(int capacity){
        data = new int[capacity];
        size = capacity;
        count = 0;
    }


    // O(1) + watch .growSize()
    public void add(int element){
        if (count >= size) {
            growSize();
        }
        data[count++] = element;
    }


    // O(n) + watch .growSize()
    public void addAt(int index, int element) {
        if (index >= count) throw new IndexOutOfBoundsException("Input index is out of bounds");
        if (count >= size) {
            growSize();
        }
        for (int i = count; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        count++;
    }


    // O(1) + .shrinkSize()
    public void remove(){
        if (count == 0) throw new NoSuchElementException();
        data[count - 1] = 0; // data[count - 1] = null - necessary in case of objects for Garbage Collector
        count--;
        shrinkSize();
    }


    // O(n) + .shrinkSize()
    public void removeAt(int index){
        if (count == 0 || index >= count) throw new NoSuchElementException();
        if (index == count -1) {
            remove();
            return;
        } else {
            count--;
            for (int i = index; i < count; i++) {
                data[i] = data[i + 1];
            }
        }
        shrinkSize();
    }


    // O(n)
    public void shrinkSize() {
        if (count == size) {
            return;
        } else {
            int emptyEl = size - count;
            size = size - emptyEl;
            int[] newData = new int[size];
            if (count >= 0) System.arraycopy(data, 0, newData, 0, count);
            data = newData;
        }
    }


    // O(1)
    public void set(int index, int data){
        if (count == 0 || index >= count) throw new NoSuchElementException();
        this.data[index] = data;
    }


    // O(1)
    public int get(int index){
        if (count == 0 || index >= count) throw new NoSuchElementException();
        return data[index];
    }

    // O(n)
    public void clear(){
        while (count != 0) {
            remove();
        }
    }

    // O(n)
    public boolean contains(int data){
        if (isEmpty()) return false;
        for (int i = 0; i < size; i++) {
            if (this.data[i] == data) return true;
        }
        return false;
    }

    // O(1)
    public boolean isEmpty(){
        return count == 0;
    }


    // O(n)
    private void growSize() {
        int[] newData = new int[2 * size];
        for (int i = 0; i < count; i++) {
            newData[i] = data[i];
        }
        data = newData;
        size = 2 * size;
    }


    public static void main(String[] args) {
        CustomDynamicArray array = new CustomDynamicArray();
        array.add(1);
        System.out.println(array);
        array.printInnerStructure();

        array.add(2);
        System.out.println(array);
        array.printInnerStructure();

        array.add(3);
        System.out.println(array);
        array.printInnerStructure();

        array.add(4);
        System.out.println(array);
        array.printInnerStructure();

        array.add(5);
        System.out.println(array);
        array.printInnerStructure();

        array.addAt(0, 10);
        System.out.println(array);
        array.printInnerStructure();

        array.remove();
        System.out.println(array);
        array.printInnerStructure();

        array.removeAt(3);
        System.out.println(array);
        array.printInnerStructure();

        array.set(3, 5);
        System.out.println(array);
        array.printInnerStructure();

        System.out.println(array.get(2));
        System.out.println(array);
        array.printInnerStructure();

        array.clear();
        System.out.println(array);
        array.printInnerStructure();

        System.out.println(array.isEmpty());
        System.out.println(array);
        array.printInnerStructure();

//        System.out.println(array.contains(2));
//        System.out.println(array);
//        array.printInnerStructure();


    }

    @Override
    public String toString(){
        return "[" + Arrays.stream(data).limit(count).boxed()
                .map(Object::toString).reduce((s1, s2) -> s1 + ", " + s2)
                .orElse("") + "]";
    }

    public void printInnerStructure(){
        System.out.println("Inner Structure: " + Arrays.toString(data));
    }


}
