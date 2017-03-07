package services;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by miguel on 06/03/2017.
 */

@ApplicationPath("/")
public class FeedBackRestApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public FeedBackRestApplication() {
    }

    @Override
    public Set<Object> getSingletons()
    {
        return singletons;
    }
}
