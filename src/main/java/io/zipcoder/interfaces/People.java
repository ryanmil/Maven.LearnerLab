package io.zipcoder.interfaces;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{

    private List<E> personList = new ArrayList<E>();

    public List<E> getList() {
        return personList;
    }

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public Boolean contains(E person) {
        return personList.contains(person);
    }

    public Boolean remove(E person) {
        return personList.remove(person);
    }

    public Boolean remove(long id) {
        return remove(findById(id));
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    abstract public E[] toArray();


    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
