package com.nestdigital.flightManagement.controller;

import com.nestdigital.flightManagement.Dao.FlightDao;
import com.nestdigital.flightManagement.model.FlightModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {
    @Autowired
    private FlightDao dao;

    @CrossOrigin(origins ="*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String addFlight(@RequestBody FlightModel flight)
    {
        System.out.println(flight.toString());
        dao.save(flight);

        return "{status:'success'}";
    }

    @CrossOrigin("*")
    @GetMapping(path = "/view",consumes = "application/json",produces = "application/json")
    public List<FlightModel> view()
    {
      return (List<FlightModel>)dao.findAll();
    }
}
