package OOP12;

public class PlaneWithStatic {

    static int nextId = 1; // ta zmienna jest taka sama dla wszystkich obiektów, tworzy sie tylko jedna kopia w pamieci komputera

    int id; // nowa miejsce w pamięci dla kazdego obiektu
    int x,y;// --||--

    PlaneWithStatic(){
        id = nextId;
        nextId++;
    }

    static int getNextId(){ // statyczna metoda, może korzystac tylko z statycznych zmiennych
        return nextId++;
    }


}
