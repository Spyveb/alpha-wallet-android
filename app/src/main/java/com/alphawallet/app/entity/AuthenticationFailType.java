package com.alphawallet.app.entity;

/**
 * Created by Dhaval on 20/07/2019.
 */
public enum AuthenticationFailType
{
    AUTHENTICATION_DIALOG_CANCELLED,
    FINGERPRINT_NOT_VALIDATED,
    PIN_FAILED,
    DEVICE_NOT_SECURE,
    BIOMETRIC_AUTHENTICATION_NOT_AVAILABLE,
    FINGERPRINT_ERROR_CANCELED
}
