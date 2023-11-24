package com.group4.kairi_store_mgt.web.kairistoremgtweb.bootstrap;

import com.group4.kairi_store_mgt.data.kairistoremgtdata.dto.CustomerDto;
import com.group4.kairi_store_mgt.data.kairistoremgtdata.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LocalDataLoader implements CommandLineRunner {

    private final CustomerService customerService;

    @Override
    public void run(String... args) throws Exception {
        loadFakeCustomers();
    }

    private void loadFakeCustomers() {
        var ct1 = CustomerDto.builder().
                name("Fabricio").lastnames("CespedesJimenez").phoneNumber("81888888").email("fcespedesj@email.com")
                .address("Some random a super long address").build();
        var ct3 = CustomerDto.builder()
                .name("Jane").lastnames("Doe").phoneNumber("87654321").email("janedoe@email.com")
                .address("456 Elm St, Anytown, USA").build();
        var ct4 = CustomerDto.builder()
                .name("Alice").lastnames("Smith").phoneNumber("555-1234").email("alice.smith@example.com")
                .address("1234 Main St, Anytown, USA").build();
        var ct5 = CustomerDto.builder()
                .name("Bob").lastnames("Johnson").phoneNumber("555-5678").email("bob.johnson@example.com")
                .address("5678 Elm St, Anytown, USA").build();
        var ct6 = CustomerDto.builder()
                .name("Charlie").lastnames("Brown").phoneNumber("555-9012").email("charlie.brown@example.com")
                .address("9012 Oak St, Anytown, USA").build();
        var ct7 = CustomerDto.builder()
                .name("David").lastnames("Lee").phoneNumber("555-3456").email("david.lee@example.com")
                .address("3456 Pine St, Anytown, USA").build();
        var ct8 = CustomerDto.builder()
                .name("Emily").lastnames("Davis").phoneNumber("555-7890").email("emily.davis@example.com")
                .address("7890 Maple St, Anytown, USA").build();
        var ct9 = CustomerDto.builder()
                .name("Frank").lastnames("Wilson").phoneNumber("555-2345").email("frank.wilson@example.com")
                .address("2345 Cedar St, Anytown, USA").build();
        var ct10 = CustomerDto.builder()
                .name("Grace").lastnames("Taylor").phoneNumber("555-6789").email("grace.taylor@example.com")
                .address("6789 Birch St, Anytown, USA").build();
        var ct11 = CustomerDto.builder()
                .name("Henry").lastnames("Anderson").phoneNumber("555-0123").email("henry.anderson@example.com")
                .address("0123 Walnut St, Anytown, USA").build();
        customerService.add(ct1);
        customerService.add(ct3);
        customerService.add(ct4);
        customerService.add(ct5);
        customerService.add(ct6);
        customerService.add(ct7);
        customerService.add(ct8);
        customerService.add(ct9);
        customerService.add(ct10);
        customerService.add(ct11);
    }

}
