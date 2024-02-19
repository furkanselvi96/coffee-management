package com.fuse.coffeemanagement.service;

import com.fuse.coffeemanagement.dao.TableDetailRepository;
import com.fuse.coffeemanagement.model.TableDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TableDetailService extends BaseService<TableDetail, Long> {

    private final TableDetailRepository tableDetailRepository;

    public TableDetailService(TableDetailRepository tableDetailRepository) {
        this.tableDetailRepository = tableDetailRepository;
    }

    @Override
    protected JpaRepository<TableDetail, Long> repository() {
        return tableDetailRepository;
    }

}
