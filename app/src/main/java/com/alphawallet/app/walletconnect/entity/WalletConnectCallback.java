package com.alphawallet.app.walletconnect.entity;

import com.alphawallet.app.entity.walletconnect.WCRequest;

/**
 * Created by Dhaval on 6/10/2021.
 */
public interface WalletConnectCallback
{
    boolean receiveRequest(WCRequest request);
}
