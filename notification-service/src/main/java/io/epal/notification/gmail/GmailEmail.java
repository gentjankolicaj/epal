package io.epal.notification.gmail;

import io.epal.notification.api.AbstractEmail;

public class GmailEmail extends AbstractEmail<GmailHeader,GmailBody> {
    @Override
    public GmailHeader getHeader() {
        return null;
    }

    @Override
    public GmailBody getBody() {
        return null;
    }
}
