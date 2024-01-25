package com.eazybytes.accounts.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;
import java.util.List;

@ConfigurationProperties(prefix="accounts")
@Getter
@Setter
public class AccountsContactInfoDto {

    String message;
    Map<String, String> contactDetails;
    List<String> onCallSupport;
}
