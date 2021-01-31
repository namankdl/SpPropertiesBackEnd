package com.spproperties.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.spproperties.model.Property;

import java.util.List;

public  interface PropertyRepository extends CrudRepository<Property, Integer>  
{
        @Query("select u from Property u where u.pName like CONCAT(:pName,'%')")
        List<Property> findAllByName(String pName);
}
