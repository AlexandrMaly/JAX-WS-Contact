package client.utils;

import client.api.DataClient;

import java.util.Scanner;

public class ClientRunner {

    private final Scanner scanner = new Scanner(System.in);

    public void runClient() throws Exception {
        onClient(makeRequest());
    }

    private String makeRequest() {
        System.out.println("""
                Choose your action:
                1 - Get all contacts;
                2 - Close app.
                """);
              return scanner.nextLine().trim();
    }

    private String getResponse(String request) throws Exception {
        DataClient client = new DataClient();
        return client.runClient(request);
    }

    private void onClient(String input) throws Exception {
        if (input.equals("2")) {
            System.out.println(">> Client is off.");
            scanner.close();
            System.exit(0);
        } else {
            getOutput(getResponse(input));
            runClient();
        }
    }

    private void getOutput(String response) {
        System.out.println(response);
    }
}
