package io.epal.notification.api;



public abstract class AbstractEmail<H,B> {

    public abstract H getHeader();
    public abstract B getBody();
}
