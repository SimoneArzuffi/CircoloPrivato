public class Main {
    public static void main(String[] args) {
        Circolo circolo = new Circolo();
        circolo.aggiungiSocio("Mario", "Rossi", 20, 'M');
        circolo.aggiungiSocio("Luigi", "Verdi", 30, 'M');
        circolo.aggiungiSocio("Giuseppe", "Bianchi", 40, 'M');
        circolo.aggiungiSocio("Maria", "Neri", 50, 'F');
        circolo.aggiungiSocio("Giulia", "Gialli", 60, 'F');
        circolo.aggiungiSocio("Giorgio", "Arancioni", 70, 'M');
        circolo.aggiungiSocio("Giovanni", "Viola", 80, 'M');
        circolo.aggiungiSocio("Giovanna", "Rosa", 90, 'F');
        circolo.aggiungiSocio("Giacomo", "Azzurri", 100, 'M');
        circolo.aggiungiSocio("Gianluca", "Marroni", 110, 'M');
        circolo.aggiungiSocio("Giancarlo", "Verdi", 120, 'M');
        circolo.aggiungiSocio("Gianmarco", "Bianchi", 130, 'M');
        circolo.aggiungiSocio("Gianfranco", "Neri", 140, 'M');
        circolo.aggiungiSocio("Gianluigi", "Gialli", 150, 'M');
        circolo.aggiungiSocio("Gianpiero", "Arancioni", 160, 'M');
        circolo.aggiungiSocio("Gianpaolo", "Viola", 170, 'M');
        circolo.aggiungiSocio("Gianmaria", "Rosa", 180, 'M');
        circolo.aggiungiSocio("Gianluca", "Azzurri", 190, 'M');
        circolo.aggiungiSocio("Giancarlo", "Marroni", 200, 'M');
        circolo.aggiungiSocio("Gianmarco", "Verdi", 210, 'M');
        circolo.aggiungiSocio("Gianfranco", "Bianchi", 220, 'M');

        //circolo.modificaSocio("Mario", "Rossi", 20, 'M', "Mario", "Bianchi", 20, 'M');

        circolo.rimuoviSocio("Mario", "Rossi", 20, 'M');

        

        circolo.incrementaEta();

        circolo.etaMedia();

        circolo.calcolaEtaMediaPerSesso('M');

        circolo.calcolaEtaMediaPerSesso('F');

        circolo.distribuzionePercentuale();

        circolo.stampaSoci();
    }
}
