package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(name="Accounts",
        description="Schema to hold Account information")
public class AccountsDto {

    @Schema(
            description="Account number of EazyBank account")
    @Pattern(regexp = "(^$|[0-9]{10})", message="Account number must be 10 digits")
    @NotEmpty(message = "Account number can not be null or empty")
    private Long accountNumber;

    @Schema(
            description="Account type of EazyBank account", example = "Savings")
    @NotEmpty(message="account type can not be null or empty")
    private String accountType;

    @Schema(
            description="branch address of EazyBank account")
    @NotEmpty(message = "branch address can not be null empty")
    private String branchAddress;
}
