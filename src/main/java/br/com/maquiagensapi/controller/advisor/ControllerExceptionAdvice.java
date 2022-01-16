package br.com.maquiagensapi.controller.advisor;

import br.com.maquiagensapi.exception.NotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerExceptionAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = NotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity handleConflict() {
        return ResponseEntity
                .notFound()
                .build();
    }
}