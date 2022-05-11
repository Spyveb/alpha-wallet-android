package com.alphawallet.app.entity;

import com.alphawallet.app.web3.entity.Web3Transaction;

/**
 * Created by Dhaval on 26/01/2019.
 */
public interface SendTransactionInterface
{
    void transactionSuccess(Web3Transaction web3Tx, String hashData);
    void transactionError(long callbackId, Throwable error);
}
