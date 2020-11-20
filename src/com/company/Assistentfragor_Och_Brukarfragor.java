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
            assistent.sattnamn(Intervju_assistenter);
            String Telefonummer_Till_Assistent = JOptionPane.showInputDialog("Villket ar telefonummret till " + Intervju_assistenter + "?" );





            Intervju_assistenter = JOptionPane.showInputDialog("Hur gammal ar du?");
            assistent.sattAlder(Integer.parseInt(Intervju_assistenter));




            Intervju_assistenter = JOptionPane.showInputDialog("Hur lange avser du att jobba har? Svara i ar.  ");
            assistent.Anstallningens_Uppskattade_Lagnd(Double.parseDouble(Intervju_assistenter));


            Intervju_assistenter = JOptionPane.showInputDialog("Hur ofta ar du sjuk per ar? Vanligen svara med antalet ganger per ar som du ar sjuk.  ");
            assistent.setUppskattad_Sjukfranvaro_Per_Ar(Integer.parseInt(Intervju_assistenter));


             Intervju_assistenter = JOptionPane.showInputDialog("Hur tydlig ar du? Valj mellan 'Lite tydlig', 'Mycket tydlig' eller 'Inte alls tydlig");
             assistent.SetTydlighet(Intervju_assistenter);

            Intervju_assistenter = JOptionPane.showInputDialog("Hur stark ar du? Valj mellan 'Lite stark' eller 'Mycket stark'. ");
            assistent.Set_Assistentens_Behov_Av_Muskelstyrka(Intervju_assistenter);


            Brukare brukare = new Brukare();//Ett nyttt objekt av instansen brukare skapas pa varje varv i while-satsen ovan.
            String Fragor_Till_Brukare = JOptionPane.showInputDialog("Nu gar vi over till att behandla fragor som ar till for brukarna att svara pa. Hur gammal ar du?");

            //Nedan anropas de olika metoderna i klassen brukare för att ta reda pa information om vad brukarna behover av assistenten.
            brukare.Set_Skillnad_Mellan_Aldrar(assistent.getAlder_Pa_Assistent(),brukare.getAlder_Pa_Brukare());
            Fragor_Till_Brukare = JOptionPane.showInputDialog("Vad heter du?");
            brukare.SetNamn_Pa_Brukare(Fragor_Till_Brukare);
            String Telefonummer_Till_Brukare = JOptionPane.showInputDialog("Villket ar telefonummret till " + Fragor_Till_Brukare + "?");

            Fragor_Till_Brukare = JOptionPane.showInputDialog("Hur stort tydlighetsbehov har du? Valj mellan alternativen 'Jag behover mycket tydlighet i vardagen' eller 'Jag behover lite tydlighet i vardagen'.");
            brukare.Behov_Av_Bra_Pedagogik(Fragor_Till_Brukare);


            Fragor_Till_Brukare = JOptionPane.showInputDialog("Hur ofta behover du lyftas? Valj mellan 'Jag behover lyftas ofta' eller 'Jag behover lyftas sallan'. ");
            brukare.Set_Behover_Lyftas_Ofta(Fragor_Till_Brukare);


            String Motesfraga = JOptionPane.showInputDialog("Nu har vi gatt igenom alla punkter pa denna intrervju. Vill ni bada traffas for em intervju i verkligheten? Vanligen svara med 'Ja' eller 'Nej'.");
            if (Motesfraga.equals("Ja")) {

                JOptionPane.showMessageDialog(null, "Vi kommer att kontakta er for att hitta en tid da ni kan traffas for en verklig intervju.");
            } else
                JOptionPane.showMessageDialog(null, "Da vet vi att ni inte vill traffas. Tack for denna intervju.");


        }//Hit kommer man nar break exekveras.

    }


}