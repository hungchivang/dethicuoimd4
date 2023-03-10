package com.codegym.dethimodule4.service;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    T save(T t);

    Optional<T> findById(Long id);

    void deleteById(Long id);
}
