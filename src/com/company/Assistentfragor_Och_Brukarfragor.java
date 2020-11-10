package com.company;

import javax.swing.*;


public class Assistentfragor_Och_Brukarfragor {


    public static void main(String[] args) {
        while (true) {
            String Intervju_assistenter = JOptionPane.showInputDialog("Valkommen till denna assistentintervju. Tryck pa ok for att fortsatta inmatning av assistenter tryck pa cancel för att avbryta.  Vad heter du? Vanligen svara med formatet fornamn efternamn ");
            Assistent assistent = new Assistent();
            //Objekt av instansen assistent skapas. Ett nyttt objekt av instansen assistent skapas pa varje varv i while-satsen ovan.
            //Nedan anropas de olika metoderna i klassen assistent for att fa svar pa de olika fragorna om assistenten.
            if (Intervju_assistenter == null)
                break;
            assistent.fornamn = Intervju_assistenter.substring(0, Intervju_assistenter.indexOf(' '));
            assistent.efternamn = Intervju_assistenter.substring(Intervju_assistenter.indexOf(' '));

            String Namn_Pa_Assistent = "Kul att veta vad du heter. Valkommen " +  assistent.Namnfraga(assistent.fornamn, assistent.efternamn);
            JOptionPane.showMessageDialog(null, Namn_Pa_Assistent);
            Intervju_assistenter = JOptionPane.showInputDialog("Hur gammal ar du?");
            assistent.Alder_Pa_Assistent = Integer.parseInt(Intervju_assistenter);
            String Assistentens_alder = "Da vet vi hur gammal du ar. Kul att veta att du ar " + assistent.Alder(assistent.Alder_Pa_Assistent   ) + "ar";
            JOptionPane.showMessageDialog(null, Assistentens_alder);


            Intervju_assistenter = JOptionPane.showInputDialog("Hur lange avser du att jobba har? Svara i ar.  ");
            assistent.Lagnd_Pa_anstallning = Double.parseDouble(Intervju_assistenter);
            JOptionPane.showMessageDialog(null,"Onskemalet pa din anstallningslagnd har lagrats och kommer sedan att jamforas med brukarens onskemal pa anstallningslagnd");


            Intervju_assistenter = JOptionPane.showInputDialog("Hur ofta ar du sjuk per ar? Vanligen svara med antalet ganger per ar som du ar sjuk.  ");
            assistent.Uppskattad_Sjukfranvaro_Per_Ar = Integer.parseInt(Intervju_assistenter);
            String Anstallningslamplighet_Med_tanke_pa_Sjukfranvaro = assistent.Fa_Ut_Uppskattad_Sjukfranvaro_Per_Ar(assistent.Uppskattad_Sjukfranvaro_Per_Ar);
            JOptionPane.showMessageDialog(null, Anstallningslamplighet_Med_tanke_pa_Sjukfranvaro);

            String Intervju_Assistenter_Fraga_Om_tydlighet = JOptionPane.showInputDialog("Hur tydlig är du? Valj mellan 'Mycket tydlig', 'Lite tydlig' eller 'Inte alls tydlig' ");
            String Anstallningslamplighet_Med_tanke_Pa_tydlighet = Intervju_Assistenter_Fraga_Om_tydlighet;
            Anstallningslamplighet_Med_tanke_Pa_tydlighet = assistent.Tydlighet(Intervju_Assistenter_Fraga_Om_tydlighet);
            JOptionPane.showMessageDialog(null, Anstallningslamplighet_Med_tanke_Pa_tydlighet);

            Intervju_assistenter = JOptionPane.showInputDialog("Hur stark ar du? Valj mellan 'Lite stark' eller 'Mycket stark'. " );
            String Assistentens_Muskelstyrka = Intervju_assistenter;
            String Anstallningslamplighet_Avseende_Muskelstyrka = assistent.Assistentens_Behov_Av_Muskelstyrka(Assistentens_Muskelstyrka);
            JOptionPane.showMessageDialog(null, Anstallningslamplighet_Avseende_Muskelstyrka);


            Brukare brukare = new Brukare();//Ett nyttt objekt av instansen brukare skapas pa varje varv i while-satsen ovan.
            String Fragor_Till_Brukare = JOptionPane.showInputDialog("Nu gar vi over till att behandla fragor som ar till for brukarna att svara pa. Hur gammal ar du?");

                //Nedan anropas de olika metoderna i klassen brukare för att ta reda pa information om vad brukarna behover av assistenten.
            brukare.Alder_Pa_Brukare = Integer.parseInt(Fragor_Till_Brukare);
            String Lamplighet_Avseende_Aldeerskillnad = brukare.Skillnad_Mellan_Aldrar(assistent.Alder_Pa_Assistent, brukare.Alder_Pa_Brukare);
            JOptionPane.showMessageDialog(null, Lamplighet_Avseende_Aldeerskillnad);
            Fragor_Till_Brukare = JOptionPane.showInputDialog("Vad heter du?");
            brukare.fornamn = Fragor_Till_Brukare.substring(0,Fragor_Till_Brukare.indexOf( ' '));
            brukare.efternamn = Fragor_Till_Brukare.substring(Fragor_Till_Brukare.indexOf(' '));
            String Namn_Pa_Brukare = "Vad bra, da vet vi vad du heter. Valkommen till oss " + brukare.Namn_Pa_Brukare(brukare.fornamn,brukare.efternamn);
            JOptionPane.showMessageDialog(null,Namn_Pa_Brukare);

            Fragor_Till_Brukare = JOptionPane.showInputDialog("Hur stort tydlighetsbehov har du? Valj mellan alternativen 'Jag behover mycket tydlighet i vardagen' eller 'Jag behover lite tydlighet i vardagen'.");
            String Fraga_Om_tydlighet_hos_Brukaren = Fragor_Till_Brukare;
            String Behov_Av_Tydlighet_Hos_Brukaren = brukare.Behov_Av_Bra_Pedagogik(Fraga_Om_tydlighet_hos_Brukaren);
            JOptionPane.showMessageDialog(null, Behov_Av_Tydlighet_Hos_Brukaren);

            Fragor_Till_Brukare = JOptionPane.showInputDialog("Hur ofta behover du lyftas? Valj mellan 'Jag behover lyftas ofta' eller 'Jag behover lyftas sallan'. ");
            String Fraga_Om_Lyftbehov_Hos_Brukaren = Fragor_Till_Brukare;
            String Behov_Av_Bra_Styrka_Hos_Assistenten = brukare.Behover_Lyftas_Ofta(Fraga_Om_Lyftbehov_Hos_Brukaren);
            JOptionPane.showMessageDialog(null, Behov_Av_Bra_Styrka_Hos_Assistenten);

            Fragor_Till_Brukare = JOptionPane.showInputDialog("Hur lange vill du att assistenten jobbar hos dig? Svara i ar.");
            brukare.Onskemal_Om_Lagnd_Pa_anstallning = Integer.parseInt(Fragor_Till_Brukare);
            if (brukare.Onskemal_Om_Lagnd_Pa_anstallning <= assistent.Lagnd_Pa_anstallning) {
                JOptionPane.showMessageDialog(null, " En anstallning mellan er tva verkar passa bra ihop.");
            } else {
                JOptionPane.showMessageDialog(null, "En anstallning mellan er verkar inte ga att fa till med tanke pa att ni har olika onskemal pa anstallningslagnden");
            }
            String Motesfraga = JOptionPane.showInputDialog("Nu har vi gatt igenom alla punkter pa denna intrervju. Vill " + assistent.fornamn + "" + assistent.efternamn + " traffa " + "" +  brukare.fornamn + "" + brukare.efternamn +  " for en verklig intervju? Vanligen svara med 'Ja' eller 'Nej'");
            if(Motesfraga.equals("Ja")){
                String Telefonummer_Till_Assistent = JOptionPane.showInputDialog("Villket ar telefonummret till " + assistent.fornamn + "" + assistent.efternamn +"?");
                String Telefonummer_Till_Brukare = JOptionPane.showInputDialog("Villket ar telefonummret till " + brukare.fornamn + "" + brukare.efternamn +"?");
                JOptionPane.showMessageDialog(null,"Vi kommer att kontakta er for att hitta en tid da ni kan traffas for en verklig intervju.");}
                else
                    JOptionPane.showMessageDialog(null, "Da vet vi att ni inte vill traffas. Tack for denna intervju.");





        }//Hit kommer man nar break exekveras.

    }


}

