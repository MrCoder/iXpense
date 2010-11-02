package com.tw.gae.ixpense.domain;

import com.google.appengine.api.datastore.Key;

import javax.jdo.annotations.*;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable="true")
public class Registrant {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key key;

    @Persistent
    private String id;
}
