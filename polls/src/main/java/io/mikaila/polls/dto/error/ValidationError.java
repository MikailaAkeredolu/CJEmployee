package io.mikaila.polls.dto.error;

public class ValidationError {
    private String code;
    private String message;

    public ValidationError(){

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ValidationError{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
