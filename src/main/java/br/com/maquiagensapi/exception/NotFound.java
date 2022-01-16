package br.com.maquiagensapi.exception;

public class NotFound extends Exception {
    public NotFound() {
        super("Entity not found");
    }
}