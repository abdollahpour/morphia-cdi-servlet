package com.wpic.boilerplate.model;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.Date;

/**
 * Created by hamed on 8/12/16.
 */
@Entity
public class Sample {

    @Id
    public String id;

    public Integer length;

    public String mimeType;

    public Date uploaded;

}
