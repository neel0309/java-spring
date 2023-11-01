package spring6di.spring6di.services;


import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {

        return "Hello!!! From service class";
    }
}
