package services;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by miguel on 06/03/2017.
 */

@ApplicationPath("/feedbackrest")
public class FeedBackRestApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>();

    public FeedBackRestApplication() {
        singletons.add(new ProjectResourceBean());
    }

    @Override
    public Set<Object> getSingletons()
    {
        return singletons;
    }
}
