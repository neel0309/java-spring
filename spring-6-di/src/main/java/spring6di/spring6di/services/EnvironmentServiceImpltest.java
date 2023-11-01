package spring6di.spring6di.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile("test")
@Service
public class EnvironmentServiceImpltest implements EnvironmentService {
    @Override
    public String data() {
        return "test";
    }
}
