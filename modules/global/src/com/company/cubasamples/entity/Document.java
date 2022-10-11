package com.company.cubasamples.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Table(name = "CUBASAMPLES_DOCUMENT")
@Entity(name = "cubasamples_Document")
@NamePattern("%s|name")
public class Document extends StandardEntity {
    private static final long serialVersionUID = 3389985312642462205L;

    @Column(name = "NAME")
    @NotEmpty
    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}