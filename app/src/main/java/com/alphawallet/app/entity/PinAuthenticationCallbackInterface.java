package com.alphawallet.app.entity;

/**
 * Created by Dhaval on 19/07/2019.
 */
public interface PinAuthenticationCallbackInterface
{
    void completeAuthentication(Operation taskCode);
    void failedAuthentication(Operation taskCode);
}
