package org.example.task2;

public class IntStack {

    int[] numbers;
    int arraySize;

    public IntStack() {
        numbers = new int[10];
        arraySize = 10;
    }

    public int pop() {
        if (this.isEmpty()) {
            return 0;
        }

        int lastItem = numbers[this.getLastItemIndex()];
        numbers[this.getLastItemIndex()] = 0;
        return lastItem;
    }

    public void push(int number) {
        if (arraySize == this.getLastItemIndex() + 1) {
            increaseArraySize();
        }
        this.numbers[this.getLastItemIndex() + 1] = number;
    }

    public int peek() {
        int lastItemIndex = this.getLastItemIndex();
        return this.numbers[lastItemIndex];
    }

    public int size() {
        return this.getLastItemIndex() + 1;
    }

    int getLastItemIndex() {
        if (this.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i + 1] == 0) {
                return i;
            }
        }
        return numbers.length - 1;
    }

    public boolean isEmpty() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        numbers = new int[arraySize];
    }

    void increaseArraySize() {
        int[] newArray = new int[arraySize * 2];
        arraySize *= 2;
        for (int i = 0; i < this.numbers.length; i++) {
            newArray[i] = this.numbers[i];
        }
        this.numbers = newArray;
    }
}
