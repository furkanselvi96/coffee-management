package com.fuse.coffeemanagement.model;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tables")
public class TableDetail {

    @Id
    private Long id;

    @Column(name = "table_status", nullable = false)
    private boolean tableStatus;

    @PrePersist
    public void prePersist() {
        this.tableStatus = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableDetail that = (TableDetail) o;
        return tableStatus == that.tableStatus && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tableStatus);
    }
}
