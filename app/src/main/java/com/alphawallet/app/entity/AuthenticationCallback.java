package com.alphawallet.app.entity;

/**
 * Created by Dhaval on 9/06/2019.
 */

public interface AuthenticationCallback
{
    void authenticatePass(Operation callbackId);
    void authenticateFail(String fail, AuthenticationFailType failType, Operation callbackId);
    void legacyAuthRequired(Operation callbackId, String dialogTitle, String desc);
}