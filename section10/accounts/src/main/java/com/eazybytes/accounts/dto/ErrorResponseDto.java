package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data @AllArgsConstructor
@Schema(name="ErrorResponse",
        description = "Schema to hold Error Response Information"
)
public class ErrorResponseDto {

    @Schema(
            description = "API path invoked by client"
    )
    private String apiPath;

    @Schema(
            description = "Error code representing the error which happened"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error Message to describe the error that happened"
    )
    private String errorMessage;

    @Schema(
            description = "Time the error occurred"
    )
    private LocalDateTime errorTime;
}
