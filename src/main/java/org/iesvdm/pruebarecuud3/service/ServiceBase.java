package org.iesvdm.pruebarecuud3.service;

import java.util.List;

public interface ServiceBase<T> {

    public List<T> listAll();
    public T one(int id);
    public void create(T t);
    public void replace(T t);
    public void delete(int id);
}
