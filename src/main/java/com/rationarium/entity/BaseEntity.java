package com.rationarium.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,updatable = false)
    private String createdBy;
    @Column(nullable = false,updatable = false)
    private LocalTime createdTime;
    @Column(nullable = false,updatable = false)
    private String updateBy;
    @Column(nullable = false,updatable = false)
    private LocalTime updatedTime;

}
