package com.javagda25.Collections_zadDom2;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class VehicleInfo {
    private String nrRejestracyjnyPojazdu;
    private CarType carType;
    private LocalDateTime dataWjazdu;
}
