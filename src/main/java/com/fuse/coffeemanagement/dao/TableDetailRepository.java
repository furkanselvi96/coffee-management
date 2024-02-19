package com.fuse.coffeemanagement.dao;

import com.fuse.coffeemanagement.model.TableDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableDetailRepository extends JpaRepository<TableDetail, Long> {
}
