import java.util.LinkedList;

public class Circolo {
    public LinkedList<Socio> soci;

    public Circolo(){
        soci = new LinkedList<Socio>();
    }

    public void aggiungiSocio(String nome, String cognome, int eta, char sesso){
        soci.add(new Socio(nome, cognome, eta, sesso));
    }

    public void rimuoviSocio(String nome, String cognome, int eta, char sesso){
        for(Socio socio : soci){
            if(socio.nome.equals(nome) && socio.cognome.equals(cognome) && socio.eta == eta && socio.sesso == sesso){
                soci.remove(socio);
                break;
            }
        }
    }


    public void incrementaEta(){
        for(Socio socio : soci){
            socio.eta++;
        }
    }

    public void etaMedia(){
        int etaMedia = 0;
        for(Socio socio : soci){
            etaMedia += socio.eta;
        }
        etaMedia /= soci.size();
        System.out.println("L'età media dei soci è: " + etaMedia);
    }

    public void calcolaEtaMediaPerSesso(char sesso){
        int etaMedia = 0;
        int conta = 0;
        for(Socio socio : soci){
            if(socio.sesso == sesso){
                etaMedia += socio.eta;
                conta++;
            }
        }
        etaMedia /= conta;
        System.out.println("L'età media dei soci di sesso " + sesso + " è: " + etaMedia);
    }

    public void distribuzionePercentuale(){
        int maschi = 0;
        int femmine = 0;
        
        for(Socio socio : soci){
            if(socio.sesso == 'm'|| socio.sesso == 'M'){
                maschi++;
            }else if(socio.sesso == 'f'|| socio.sesso == 'F'){
                femmine++;
            }
        }

        System.out.println("La percentuale dei maschi nel circolo è: " + (maschi/soci.size() * 100));
        System.out.println("La percentuale delle femmine nel circolo è: " + (femmine/soci.size() * 100));

    }


    public void stampaSoci() {
        for(Socio socio : soci){
            System.out.println(socio.nome + " " + socio.cognome + " " + socio.eta + " " + socio.sesso);
        }
    }

}
