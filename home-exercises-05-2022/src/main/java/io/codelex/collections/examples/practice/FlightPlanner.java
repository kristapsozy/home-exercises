package io.codelex.collections.examples.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;

import static io.codelex.collections.examples.practice.WordCount.readFile;

public class FlightPlanner {
    private static final String file = "src/main/java/io/codelex/collections/examples/practice/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = readFile(file);
        String[] textArray = String.valueOf(sb).split("\n");
        List<String> list = Arrays.stream(textArray).toList();
        Map<String, List<String>> map = new HashMap<>();
        for (String flight : list) {
            List<String> nextCity = new ArrayList<>();
            if (!flight.equals("")) {
                String[] city = flight.split("->");
                nextCity.add(city[1]);
                if (map.containsKey(city[0])) {
                    nextCity.addAll(map.get(city[0]));
                }
                map.put(city[0], nextCity);
            }
        }
        System.out.println("To display list of cities press 1");
        System.out.println("To exit program press #");
        String userChoise = scan.nextLine();
        String finalDestination = "";
        StringBuilder route = new StringBuilder();
        int cityCount = 0;
        if (userChoise.equals("1")) {
            System.out.println("Please choose city from the list: ");
            map.entrySet().forEach(entry -> System.out.print(entry.getKey() + " "));
            System.out.println();
            String startCity = scan.nextLine();
            route.append(startCity);
            finalDestination = startCity;
            cityCount++;
            String nextCity = "";

            while (!finalDestination.equals(nextCity)) {
                System.out.println("Please choose next city from the list: ");
                if (cityCount == 1) {
                    for (String city : map.get(startCity)) {
                        System.out.println(city);
                    }
                } else {
                    for (String city : map.get(nextCity)) {
                        System.out.println(city);
                    }
                }
                nextCity = scan.nextLine();
                route.append("->" + nextCity);
                cityCount++;
            }
        } else if (userChoise.equals("#")) {
            System.exit(0);
        }
        System.out.println("Your route is: " + route);

    }

}

