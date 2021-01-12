/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework35;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Parham Alvani
 * @param <T> the queue refrence
 */
public class Queue <T> implements java.util.Queue<T> {

    private final ArrayList<T> Q;

    public Queue(ArrayList Q) {
        this.Q = Q;
    }

    public Queue() {
        this.Q = new ArrayList<>();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return Q.addAll(c);
    }

    @Override
    public boolean contains(Object o) {
        return Q.contains(o);
    }

    @Override
    public boolean add(T e) {
        return this.Q.add(e);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return Q.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return Q.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return Q.iterator();
    }

    @Override
    public T peek() {
        return Q.get(0);
    }

    @Override
    public boolean offer(T e) {
        return Q.add(e);
    }

    @Override
    public T poll() {
        return Q.remove(0);
    }

    @Override
    public T remove() {
        return Q.remove(0);
    }

    @Override
    public boolean remove(Object o) {
        return Q.remove(o);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return Q.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return Q.retainAll(c);
    }

    @Override
    public T element() {
        return Q.get(0);
    }

    @Override
    public void clear() {
        Q.clear();
    }

    @Override
    public int size() {
        return Q.size();
    }

    @Override
    public Object[] toArray() {
        return Q.toArray();
    }

    @Override
    public <S> S[] toArray(S[] a) {
        return Q.toArray(a);
    }

}
