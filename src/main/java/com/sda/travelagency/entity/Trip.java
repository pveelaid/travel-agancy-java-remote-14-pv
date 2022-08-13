package com.sda.travelagency.entity;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data

public class Trip {
    LocalDate tripStartDate;
    LocalDate tripEndDate;
    Destination destination;
    Price tripPrice;
    TransportType typeOfTransport;
    SecurityRules securityRules;
    PaymentType paymentType;
    MealType mealType;

}
