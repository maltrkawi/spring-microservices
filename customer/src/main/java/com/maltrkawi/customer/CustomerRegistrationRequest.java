package com.maltrkawi.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
