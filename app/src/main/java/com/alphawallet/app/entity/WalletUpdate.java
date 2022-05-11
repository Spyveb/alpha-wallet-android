package com.alphawallet.app.entity;

import java.util.Map;

/**
 * Created by Dhaval on 8/11/2018.
 */

public class WalletUpdate
{
    public long lastBlock;
    public Map<String, Wallet> wallets;

    public WalletUpdate()
    {
        lastBlock = -1L;
    }
}
