package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;

public interface ICustomerService {

    /**
     * @param mobileNumber
     * @param correlationId
     * @return
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);
}
