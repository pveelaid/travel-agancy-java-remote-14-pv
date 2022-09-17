package com.sda.travelagency.controller;

import com.sda.travelagency.entity.Trip;
import com.sda.travelagency.service.TripService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// TODO: fix CORS in better way
@CrossOrigin("http://localhost:4200/")
@RestController
@Slf4j
@RequestMapping("/api/trips")
public class TripController {

    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping
    public List<Trip> getAllTrips() {
        log.info("getting all trips");

        return tripService.findAllTrips();
    }

    @GetMapping("/{id}")
    public Trip getTripById(@PathVariable("id") Long id) {
        log.info("getting the trip by id: [{}]", id);

        return tripService.findTripById(id);
    }



}