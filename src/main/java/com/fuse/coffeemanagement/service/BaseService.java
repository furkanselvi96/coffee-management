package com.fuse.coffeemanagement.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public abstract class BaseService<T, ID> {

    protected abstract JpaRepository<T, ID> repository();

    public Optional<T> findById(ID id) {
        return repository().findById(id);
    }

    public T save(T entity) {
        return repository().save(entity);
    }

    public void deleteById(ID id) {
        repository().deleteById(id);
    }

    public List<T> findAll() {
        return repository().findAll();
    }
}
