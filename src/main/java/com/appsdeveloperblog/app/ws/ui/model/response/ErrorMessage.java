package com.appsdeveloperblog.app.ws.ui.model.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorMessage {
	private Date timestamp;
	private String message;

	public ErrorMessage() {
	}

}
