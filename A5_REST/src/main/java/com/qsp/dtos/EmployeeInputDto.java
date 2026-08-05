package com.qsp.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeInputDto {
	private String name;
	private Integer yoe;
	private Double salary;
	private String address;
}
