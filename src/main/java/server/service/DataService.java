package server.service;

// Налаштовує метод, який надається
// як операція Web-сервісу.
// https://jakarta.ee/specifications/platform/9/apidocs/jakarta/jws/webmethod

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

// Інтерфейс кінцевої точки Web-сервісу.
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface DataService {
    @WebMethod
    String getData(String data);
}
