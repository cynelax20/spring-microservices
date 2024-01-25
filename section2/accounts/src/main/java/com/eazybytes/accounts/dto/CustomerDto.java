package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(name="Customer",
description="Schema to hold Customer and Account information")
public class CustomerDto {

    @Schema(
            description="Name of the cusotmer",
            example="Eazy Bytes")
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min = 5, max =30, message = "length of customer name should be between 5 and 30")
    private String name;

    @Schema(
            description="email of the cusotmer",
            example="lapradejohn12@gmail.com")
    @NotEmpty(message = "email can not be null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(
            description="mobile number of the cusotmer",
            example="1112223636")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description="Account dto number of the cusotmer")
    private AccountsDto accountsDto;
}
