package com.app.gym.exceptions;


/**
 * The type Custom gym exception.
 */
public class CustomGymException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final String errorCode;
    private final String errorMessage;

    /**
     * Instantiates a new Custom gym exception.
     *
     * @param errorCode    the error code
     * @param errorMessage the error message
     */
    public CustomGymException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * Gets error code.
     *
     * @return the error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Gets error message.
     *
     * @return the error message
     */
    public String getErrorMessage() {
        return errorMessage;
    }
}