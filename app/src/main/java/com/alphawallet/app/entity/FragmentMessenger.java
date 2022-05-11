package com.alphawallet.app.entity;

/**
 * Created by Dhaval on 1/02/2019.
 */
public interface FragmentMessenger
{
    void tokenScriptError(String message);
    void updateReady(int versionUpdate);
}
