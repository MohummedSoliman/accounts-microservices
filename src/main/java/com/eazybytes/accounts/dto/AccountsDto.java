package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "Account number can not be null or empty")
    private Long accountNumber;

    @NotEmpty(message = "Account Type can not be null or empty")
    private  String accountType;

    @NotEmpty(message = "Branch address can not be null or empty")
    private String branchAddress;
}
