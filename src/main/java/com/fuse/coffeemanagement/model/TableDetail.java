package com.fuse.coffeemanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "tables")
@Getter
@Setter
public class TableDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "table_name")
    private String name;

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
        return tableStatus == that.tableStatus && Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tableStatus);
    }
}



