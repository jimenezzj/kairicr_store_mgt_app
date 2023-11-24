package com.group4.kairi_store_mgt.web.kairistoremgtweb.controllers;

import com.group4.kairi_store_mgt.data.kairistoremgtdata.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static com.group4.kairi_store_mgt.web.kairistoremgtweb.utils.UriPathConstants.VIEW_CUSTOMER_LIST;
import static com.group4.kairi_store_mgt.web.kairistoremgtweb.utils.UriPathConstants.VIEW_CUSTOMER_BASEPATH;

@Controller
@RequestMapping(path = VIEW_CUSTOMER_BASEPATH)
@RequiredArgsConstructor
public class CustomersController {

    private final CustomerService customerService;

    @RequestMapping(path = {"/", ""})
    public String getCustomers(Model model) {
        var templateName = VIEW_CUSTOMER_LIST.substring(1) + "/list";
        var customers = customerService.getAll();
        model.addAttribute("customers", customers);
        return templateName;
    }
}
