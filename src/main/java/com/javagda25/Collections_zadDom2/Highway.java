package com.javagda25.Collections_zadDom2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Highway {
    List<VehicleInfo> listaPojazdow = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public void vehicleEntry(String nrRejestracyjnyPojazdu, CarType carType) {
        System.out.println("Czy chcesz dodać nowy pojazd? Yes / No");
        System.out.println("Wyjdź z aplikacji: QUIT");
        String komendy = scanner.nextLine();
        String komenda = komendy.toUpperCase();
        do {
            System.out.println("Czy chcesz dodać nowy pojazd? Yes / No");
            System.out.println("Wyjdź z aplikacji: QUIT");
            if (komenda.equalsIgnoreCase("quit")) {
                break;
            }
            switch (komenda) {
                case "Yes":
                    System.out.println("Numer rejestracyjny pojazdu:");
                    String numer = scanner.nextLine();
                    System.out.println("Typ samochodu:" + Arrays.toString(CarType.values()));
                    String typ = scanner.nextLine();
                    System.out.println("Podaj datę wjazdu na autostradę w formie: YYYY-MM-DD HH:mm");
                    String data = scanner.nextLine();
                    CarType cos =carEnum(data);
                    VehicleInfo user = new VehicleInfo(numer, cos, LocalDateTime.parse(data, dateTimeFormatter));
//                    listaPojazdow.add(new VehicleInfo(numer, typ, LocalDateTime.parse(data2,dateTimeFormatter2)));
                    break;
                case "No":
                    break;
            }
        } while (!komenda.equals("quit"));

    }

    public CarType carEnum(String data) {
        String komendy = scanner.nextLine();
        CarType komenda = CarType.valueOf(komendy.toUpperCase());
        String wybor="";
        switch (komenda){
            case CAR:
                return CarType.values();
                break;
            case TRUCK:
                wybor="TRUCK";
                break;
            case MOTORCYCLE:
                wybor="MOTORCYCLE";
                break;
        }
        return wybor;
    }

}
