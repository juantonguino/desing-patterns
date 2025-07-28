package com.codeandapps.behaviorals.chainofresponsibility;

public abstract class HttpFilter {

    protected HttpFilter next;

    public HttpFilter linkWith(HttpFilter next) {
        this.next = next;
        return next;
    }

    public void next(HttpRequest request) {
        if (next != null) {
            next.handle(request);
        }
    }

    protected abstract void handle(HttpRequest request);

}
