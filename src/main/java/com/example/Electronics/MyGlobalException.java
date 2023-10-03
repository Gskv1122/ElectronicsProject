package com.example.Electronics;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyGlobalException {
	@ExceptionHandler(PriceException.class)
	public ResponseEntity<String> handlePrice(PriceException p) {
		return new ResponseEntity<String>("please enter valid price",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(BrandNotFoundException.class)
	public ResponseEntity<String> handlebrand(BrandNotFoundException p) {
		return new ResponseEntity<String>("please enter valid brand",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(ColorException.class)
	public ResponseEntity<Object> handlebrand(ColorException p) {
		return new ResponseEntity<Object>("please enter valid color",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(ModelYearException.class)
	public ResponseEntity<Object> handlebrand(ModelYearException p) {
		return new ResponseEntity<Object>("please enter valid modelYear",HttpStatus.BAD_REQUEST);
	}



}
