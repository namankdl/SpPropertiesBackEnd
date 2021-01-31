package com.spproperties.controller;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spproperties.service.*;
import com.spproperties.model.Property;
//import com.spproperties.*; 

@RestController
@CrossOrigin(origins = "*")
public class SPpropertyController {

    @Autowired
    PropertyService propertyService;


    @GetMapping("/properties")
    private List<Property> getAllProperty() {
        return propertyService.getAllProperty();

    }

    @GetMapping("/property/{pid}")
    @CrossOrigin(origins = "*")
    private Property getProperty(@PathVariable("pid") int pid) {
        return propertyService.getPropertyByPId(pid);
    }


    //creating a delete mapping that deletes a specified book
    @DeleteMapping("/property/{pid}")
    private void deleteProperty(@PathVariable("pid") int pid) {
        propertyService.delete(pid);
    }


    //creating post mapping that post the book detail in the database
        @PostMapping("/property")
        private int saveProperty(@RequestBody Property property) {
        System.out.println("property post is "+property);
        Property comingData = propertyService.saveOrUpdate(property);
        return property.getpId();
    }


    //creating put mapping that updates the book detail
    @PutMapping("/property")
    private Property update(@RequestBody Property property) {
        propertyService.saveOrUpdate(property);
        return property;
    }

    @GetMapping("/findpropertybyname/{pName}")
    private List<Property> FindByPName(@PathVariable("pName") String Name)
    {
        return propertyService.findPropertyByName(Name);
    }



}
