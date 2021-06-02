package com.example.demo.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProcessResponse
{
	private String processName;
	private List<String> progressMessageList = new ArrayList<>();
	private String errorMessage;
	private String successMessage;
}
