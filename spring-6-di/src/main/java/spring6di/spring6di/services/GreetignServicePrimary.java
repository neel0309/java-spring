package spring6di.spring6di.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetignServicePrimary implements GreetingService {

    @Override
    public String sayGreetings() {
        return "From pRIMARY";
    }
}
