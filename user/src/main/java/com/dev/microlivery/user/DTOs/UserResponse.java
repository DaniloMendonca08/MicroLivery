package com.dev.microlivery.user.DTOs;

public record UserResponse(
        Long id,
        String name,
        String email
) {}
