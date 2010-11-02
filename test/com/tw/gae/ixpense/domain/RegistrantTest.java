package com.tw.gae.ixpense.domain;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import org.junit.Test;

public class RegistrantTest {
    @Test
    public void should_create_a_Registrant(){
        Registrant registrant = new Registrant();
        DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
        
    }
}
