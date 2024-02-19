package com.fuse.coffeemanagement.service;

import com.fuse.coffeemanagement.dao.TableDetailRepository;
import org.springframework.stereotype.Service;

@Service
public class TableDetailService {

    private final TableDetailRepository tableDetailRepository;

    public TableDetailService(TableDetailRepository tableDetailRepository) {
        this.tableDetailRepository = tableDetailRepository;
    }


}
