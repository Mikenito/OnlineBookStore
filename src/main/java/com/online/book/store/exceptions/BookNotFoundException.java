package com.online.book.store.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (value= HttpStatus.NOT_FOUND, reason="No such book. Please add valid ISBN")
public class BookNotFoundException extends RuntimeException{}
