package com.group4.kairi_store_mgt.data.kairistoremgtdata.services.impl;

import com.group4.kairi_store_mgt.data.kairistoremgtdata.dto.CustomerDto;
import com.group4.kairi_store_mgt.data.kairistoremgtdata.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceList implements CustomerService {

    private final List<CustomerDto> customersStorage = new ArrayList<>();

    @Override
    public List<CustomerDto> getAll() {
        return customersStorage.stream().limit(100)
                .collect(Collectors.toList());
    }

    public void add(CustomerDto newCustomer) {
        if (newCustomer == null) throw new RuntimeException("Entity was intended to be add is invalid because is null");
        newCustomer.setCustomerId(customersStorage.size() + 1L);
        customersStorage.add(newCustomer);
    }


}
