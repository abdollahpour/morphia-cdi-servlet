package com.wpic.boilerplate.provider;

import com.mongodb.MongoClient;
import com.wpic.boilerplate.model.Sample;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

/**
 * Created by hamed on 8/12/16.
 */
public class MongoProvider {

    @Produces
    @ApplicationScoped
    public Datastore datastore() throws Exception {
        final MongoClient mongoClient = new MongoClient();

        final Morphia morphia = new Morphia();
        morphia.map(Sample.class);

        final Datastore datastore = morphia.createDatastore(mongoClient, "imagecenter");
        datastore.ensureIndexes();
        return datastore;
    }

}
