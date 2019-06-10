package com.javagda25.Collections_zadDom2;

// Stwórz aplikację Autodstrada. Celem zadania będzie implementacja systemu autostrady. Do tej implementacji będzie
// nam potrzebny klasa Highway która reprezentuje autostradę, oraz klasa VehicleInfo która reprezentuje zbiór
// informacji o pojeździe - tam będziemy przechowywać takie dane jak jego rejestracja, jego typ(ciezarowka czy
// osobowy) i datę i godzinę wjazdu - po której będziemy rozliczać pojazdy wyjezdzające z autostrady.
//
// 1. Stwórz enum CarType, który posiada typy TRUCK, CAR, MOTORCYCLE.
// 2. Stwórz klasę VehicleInfo, która powinna posiadać numer rejestracyjny pojazdu (String), typ pojazdu (CarType),
// oraz datę WJAZDU na autostradę.
// 3. Stwórz klasę Highway która będzie posiadać :
//     - kolekcję wszystkich pojazdów
//     - metodę vehicleEntry(String numer_rejestracyjny, oraz CarType type) - która dodaje do kolekcji nową instancję
//     VehicleInfo oraz wypisuje do konsoli komunikat. Metoda nic nie zwraca.
//     - metodę searchVehicle(String numer_rejestracyjny) - która szuka pojazdu i wypisuje jego informacje jeśli wciąż
//     znajduje się na autostradzie
//     - metodę wyjazdu - vehicleLeave(String numer_rejestracyjny) - która usuwa samochód z kolekcji, wypisuje
//     komunikat, oraz na podstawie czasu jaki samochód znajdował się na autostradzie oblicza jej kwotę do zapłaty
//     i wypisuje ją do konsoli.
// Przyjmij pewną stałą kwotę do zapłaty za czas spędzony na autostradzie. Jest to zabawna autostrada, bo zachęca do
// szybkiej jazdy. Im szybciej wyjedziemy tym mniej zapłacimy.
// 4. Stwórz main który przyjmuje komendy
// - wjazd NR_REJESTRACYJNY TYP
// - wyjazd NR_REJESTRACYJNY
// - sprawdz NR_REJESTRACYJNY
// i wykonuje odpowiednie akcje na instancji klasy highway.
// UWAGI:
// - kwota naliczania powinna być od każdej sekundy spędzonej na autostradzie.
// - zwróć uwagę że czas wjazdu powinien być ustawiany w momencie wjazdu
// - NA AUTOSTRADZIE NIE POWINIEN SIĘ ZNAJDOWAĆ DRUGI SAMOCHÓD O TEJ SAMEJ REJESTRACJI. Jeśli samochód o pewnej
// rejestracji wjechał już na autostradę rzuć Exception. Stwórz własny exception, nazwij go
// "VehicleAlreadyOnHighwayException". Niech jest to wyjątek niejawny.
// - kwota naliczania dla samochodów osobowych i ciężarówek powinna być inna.

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Highway highway = new Highway();
        LocalDateTime data = highway.czas();
        System.out.println(data);

    }
}
