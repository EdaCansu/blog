package com.edacansu.data.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

//Lombok
@Getter @Setter

//super class
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value={"created_date, updated_date"}, allowGetters = true)
abstract public class BaseEntity implements Serializable {

    //ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, updatable = false)
    private Long id;

    //system current time
    @Column(name="created_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date systemCreatedDate;

    //auditing field
    //added by whom, when
    @CreatedBy
    @Column(name="created_by")
    private String createdBy;

    @CreatedDate
    @Column(name="created_date")
    private Date createdDate;

    //updated by whom, when
    @LastModifiedBy
    @Column(name="updated_by")
    private String updateBy;

    @LastModifiedDate
    @Column(name="updated_date")
    private Date updateDate;
}

