package ru.sbertech.test.Lesson8;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public  class MyIterator<T> {
    private ArrayList<T> array;
    private int count ;
    private int index ;
    public MyIterator(ArrayList<T> arrayOut){
        this.array = arrayOut;
        this.count = array.size();
        this.index = 0;
    }

   // public static <T> MyIterator<T> getIterator(final ArrayList<T> array) {
     //   return new MyIterator<T>() {

         //   @Override
            public boolean hasNext() {
                return index < count;
            }

           // @Override
            public T next() {
                if (index < count) {
                    return array.get(index++);
                } else {
                    throw new NoSuchElementException("No such element.");
                }
            }

            //для теста пусть будет тоже самое, что и next()
            public T prevEl() {
                if (index < count) {
                    return array.get(index++);
                } else {
                    throw new NoSuchElementException("No such element.");
                }
            }

          //  @Override
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove item from array.");
            }
        };





