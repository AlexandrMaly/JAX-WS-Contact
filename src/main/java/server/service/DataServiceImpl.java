package server.service;

import jakarta.jws.WebService;
import server.repository.DataRepository;

import java.util.concurrent.atomic.AtomicInteger;

// Імплементація інтерфейсу Web-сервісу.
@WebService(endpointInterface = "server.service.DataService")
public class DataServiceImpl implements DataService {

    @Override
    public String getData(String req) {
        return ">> Contacts:\n" + fetchData(req);
    }

    private String fetchData(String req) {
        if (req.equals("1")) {
            AtomicInteger count = new AtomicInteger(0);
            StringBuilder stringBuilder = new StringBuilder();
            new DataRepository().fetchData().forEach(value ->
                    stringBuilder.append(count.incrementAndGet())
                    .append(") ")
                    .append(value.toString())
            );
            return stringBuilder.toString();
        } else return "No data.";
    }
}
