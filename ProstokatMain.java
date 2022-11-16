public class ProstokatMain {
    public static void main(String[] args) {

        // deklarujemy instancje
        Prostokat p1 = new Prostokat(3,4);
        Prostokat p2 = new Prostokat(5, 10);
        p1.Wyswietl();
        p2.Wyswietl();

        // obliczmamy pola instancji
        System.out.println("Pole p1: " + p1.ObliczPole());
        System.out.println("Pole p2: " + p2.ObliczPole());

        // obliczamy obwody instancji
        System.out.println("Obwod p1: " + p1.ObliczObwod());
        System.out.println("Obwod p2: " + p2.ObliczObwod());

        // obliczamy przekatne instancji
        p1.Przekatna();
        p2.Przekatna();

        // porownujemy pola instancji
        p1.PorownajPole(p2);
        p1.PorownajObwod(p2);

        // sprawdzamy czy jest kwadratem
        p1.CzyJestKwadratem();
        p2.CzyJestKwadratem();

        // zmieniamy wartosci paramterow instancji
        p1.Wyswietl();
        p1.ZmienDane(15, 25);
        p1.Wyswietl();

    }
}

