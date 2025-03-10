package com.example.sp_customer_db_pq.service;

import java.util.Optional;

public interface IGenerateService<T> {
    Iterable<T> getAll();
    Optional<T> getById(Long id);
    T save(T t);
    void remove(Long id);
}
