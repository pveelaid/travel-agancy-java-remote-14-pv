package com.sda.travelagency.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DESTINATIONS")
public class Destination {

    @Id
    @GeneratedValue
    Long id;

    String country;
    String city;
    String hotelName;
}
