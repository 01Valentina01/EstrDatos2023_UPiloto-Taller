/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queue;

import java.util.Iterator;
/**
 *
 * @author User
 */
public class Queue <Item> implements Iterable<Item>{
    
    private Item a[];
    private int count;
    private int in;
    private int fin;        
    
    public Queue(){
        a = (Item[]) new Object[1];
        count = 0;
        in = 0;
        fin = 0;
    }
    
    public void enqueue(Item  item){
        if (fin == a.length && count > a.length/2)
        resize (2 * a.length);
        a[fin++] = item;
        ++ count;
    }
    
    public Item dequeue(){
        Item item = a[in];
        a[in++] = null;
        --count;
        if(count<=-1){
            count = 0;
        }
        if(count==0)
            resize(1);
        if(fin == a.length-1 && count < a.length/2)
            resize(a.length/2);
        return item;
    } 
    
    public boolean isEmpty(){
        return count == 0;
    }
    
    public int size(){
        return count;
    }
    
    public void resize(int tm){
        Item[] temp = (Item[]) new Object[tm];
        int tem=0;
        for(int i = in; i<fin; i++)
            temp[tem++] = a[i];
        in = 0;
        fin = count;
        a = temp;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ArrayIterator();
    }
    private class ArrayIterator implements Iterator<Item>{
        private int i = fin;

        @Override
        public boolean hasNext() {
            return i>0;
        }

        @Override
        public Item next() {
            return a[--i];
        }
        
    }
}
