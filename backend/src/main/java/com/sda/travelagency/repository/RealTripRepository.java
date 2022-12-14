package com.sda.travelagency.repository;

import com.sda.travelagency.entity.Trip;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

@Profile("!develop")
public interface RealTripRepository extends TripRepository {
}
