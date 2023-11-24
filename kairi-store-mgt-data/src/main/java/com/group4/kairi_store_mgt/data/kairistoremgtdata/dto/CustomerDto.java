package com.group4.kairi_store_mgt.data.kairistoremgtdata.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CustomerDto {

    private Long customerId;
    private String name;
    private String lastnames;
    private String email;
    private String phoneNumber;
    private String address;
}
