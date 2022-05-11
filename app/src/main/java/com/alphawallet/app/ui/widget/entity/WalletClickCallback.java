package com.alphawallet.app.ui.widget.entity;

import com.alphawallet.app.entity.Wallet;

/**
 * Created by Dhaval on 21/07/2019.
 */
public interface WalletClickCallback
{
    void onWalletClicked(Wallet wallet);
    void ensAvatar(Wallet wallet);
}
