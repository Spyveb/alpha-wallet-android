package com.alphawallet.app.entity.opensea;

import com.alphawallet.app.entity.ErrorEnvelope;

/**
 * Created by Dhaval on 20/12/2018.
 */

public class OpenseaServiceError extends Exception {
    public final ErrorEnvelope error;

    public OpenseaServiceError(String message) {
        super(message);

        error = new ErrorEnvelope(message);
    }
}
