public class Prostokat {

    // deklaracja zmiennych
    int dlugosc;
    int szerokosc;

    // nastepujace do funkcji zmiany danych
    int NowaDlugosc;
    int NowaSzerokosc;

    // konstruktor bez argumentow z defaultowymi wartosciami
    public Prostokat() {
        dlugosc = 0;
        szerokosc = 0;
        NowaDlugosc = 0;
        NowaSzerokosc = 0;
    }

    // konstruktor z 2 argumentami
    public Prostokat(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    // wyswietlanie danych
    public void Wyswietl() {
        System.out.println("Dlugosc: " + dlugosc);
        System.out.println("Szerokosc: " + szerokosc);
    }

// funkcja obliczajaca pole
    public int ObliczPole() {
        return dlugosc * szerokosc;
    }

    // funkcja obliczajaca obwod
    public int ObliczObwod() {
        return 2 * dlugosc + 2 * szerokosc;
    }

    // funkcja liczaca przekatna i wyswielajhah ja
    public void Przekatna() {
        System.out.println("Przekatna = " + Math.sqrt(Math.pow(dlugosc, 2) + Math.pow(szerokosc, 2)));
    }

    // porownujemy pola prostokatow
    public void PorownajPole(Prostokat p) {
        if (this.ObliczPole() > p.ObliczPole()) {
            System.out.println("Pole prostokata pierwszego jest wieksze");
        } else if (this.ObliczPole() < p.ObliczPole()) {
            System.out.println("Pole prostokata drugiego jest wieksze");
        } else {
            System.out.println("Pola prostokatow sa rowne");
        }
    }

    //porownujemy obwody
    public void PorownajObwod(Prostokat p) {
        if (this.ObliczObwod() > p.ObliczObwod()) {
            System.out.println("Obwod prostokata pierwszego jest wiekszy");
        } else if (this.ObliczObwod() < p.ObliczObwod()) {
            System.out.println("Obwod prostokata drugiego jest wiekszy");
        } else {
            System.out.println("Obwody prostokatow sa rowne");
        }
    }

    // sprawdzamy czy jest kwadratem
    public void CzyJestKwadratem() {
        if (this.dlugosc > this.szerokosc) {
            System.out.println("Prostokat jest prostokatem");
        } else if (this.dlugosc < this.szerokosc) {
            System.out.println("Prostokat jest prostokatem");
        } else {
            System.out.println("Prostokat jest kwadratem");
        }


    }

    // zmienianie danych bez uzycia settera
    public int ZmienDane(int NowaDlugosc, int NowaSzerokosc) {
        return (this.dlugosc = NowaDlugosc) & (this.szerokosc = NowaSzerokosc);
    }

}
