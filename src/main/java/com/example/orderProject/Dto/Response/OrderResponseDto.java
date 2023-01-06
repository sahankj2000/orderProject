package com.example.orderProject.Dto.Response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Setter
@Getter
public class OrderResponseDto {
    private int id;
    private LocalDate date;
    private String name;
}
