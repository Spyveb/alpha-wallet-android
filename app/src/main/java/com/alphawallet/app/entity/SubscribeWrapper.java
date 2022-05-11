package com.alphawallet.app.entity;

import org.web3j.protocol.core.methods.response.Transaction;

/**
 * Created by Dhaval on 1/02/2018.
 */

public interface SubscribeWrapper
{
    void scanReturn(Transaction tx);
}
