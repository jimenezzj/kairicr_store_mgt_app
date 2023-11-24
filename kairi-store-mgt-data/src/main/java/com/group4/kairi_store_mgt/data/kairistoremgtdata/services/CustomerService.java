package com.group4.kairi_store_mgt.data.kairistoremgtdata.services;

import com.group4.kairi_store_mgt.data.kairistoremgtdata.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getAll();

    void add(CustomerDto newCustomer);

}
