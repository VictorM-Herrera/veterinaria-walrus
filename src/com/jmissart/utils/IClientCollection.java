package com.jmissart.utils;

public interface IClientCollection {
    public void clientCreate();
    public String clientList();
    public String clientListByDNI();
    public String clientUpdate();
    public void clientRemove();
}
