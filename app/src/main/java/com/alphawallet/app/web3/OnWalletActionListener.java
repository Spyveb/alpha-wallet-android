package com.alphawallet.app.web3;

import com.alphawallet.app.web3.entity.WalletAddEthereumChainObject;

/**
 * Created by Dhaval on 15/01/2022.
 */
public interface OnWalletActionListener
{
    void onRequestAccounts(long callbackId);
    void onWalletSwitchEthereumChain(long callbackId, WalletAddEthereumChainObject chainObj);
}
