package com.example.orderProject.Dto.Entry;

import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
public class OrderEntryDto {
    private String name;
    private LocalDate date;
}
