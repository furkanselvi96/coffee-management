package com.fuse.coffeemanagement.service;

import com.fuse.coffeemanagement.dao.StaffRepository;
import com.fuse.coffeemanagement.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class StaffService extends BaseService<Staff, Long> {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    protected JpaRepository<Staff, Long> repository() {
        return staffRepository;
    }

}