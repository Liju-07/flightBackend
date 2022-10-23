package com.nestdigital.flightManagement.Dao;

import com.nestdigital.flightManagement.model.FlightModel;
import org.springframework.data.repository.CrudRepository;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {
}
