package com.prodigyinfotech.contactmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ErrorDetails {
    private String message, description;
    private Date errorOccurredAt;
}
