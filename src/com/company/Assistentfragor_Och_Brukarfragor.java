package com.company;

import javax.swing.*;


public class Assistentfragor_Och_Brukarfragor {


    public static void main(String[] args) {
        while (true) {
            String Intervju_assistenter = JOptionPane.showInputDialog("Valkommen till denna assistentintervju. Vad heter du?");
            Assistent assistent = new Assistent();
            assistent.fornamn = Intervju_assistenter.substring(0, Intervju_assistenter.indexOf(' '));
            assistent.efternamn = Intervju_assistenter.substring(Intervju_assistenter.indexOf(' '));

            String Namn_Pa_Assistent = "Kul att veta vad du heter. Välkommen " + assistent.Namnfraga(assistent.fornamn, assistent.efternamn);
            JOptionPane.showMessageDialog(null, Namn_Pa_Assistent);
            Intervju_assistenter = JOptionPane.showInputDialog("Hur gammal ar du?");
            assistent.Alder_Pa_Assistent = Integer.parseInt(Intervju_assistenter);
            String Assistentens_alder = "Da vet vi hur gammal du ar. Kul att veta att du ar " + assistent.Alder(assistent.Alder_Pa_Assistent);
            JOptionPane.showMessageDialog(null, Assistentens_alder);


            Intervju_assistenter = JOptionPane.showInputDialog("Hur lange avser du att jobba har?");
            assistent.Lagnd_Pa_anstallning = Double.parseDouble(Intervju_assistenter);


            Intervju_assistenter = JOptionPane.showInputDialog("Hur ofta är du sjuk per ar?");
            assistent.Uppskattad_Sjukfranvaro_Per_Ar = Integer.parseInt(Intervju_assistenter);
            String Anstallningslamplighet_Med_tanke_pa_Sjukfranvaro = assistent.Fa_Ut_Uppskattad_Sjukfranvaro_Per_Ar(assistent.Uppskattad_Sjukfranvaro_Per_Ar);
            JOptionPane.showMessageDialog(null, Anstallningslamplighet_Med_tanke_pa_Sjukfranvaro);

            String Intervju_Assistenter_Fraga_Om_tydlighet = JOptionPane.showInputDialog("Hur tydlig är du?");
            String Anstallningslamplighet_Med_tanke_Pa_tydlighet = Intervju_Assistenter_Fraga_Om_tydlighet;
            Anstallningslamplighet_Med_tanke_Pa_tydlighet = assistent.Tydlighet(Intervju_Assistenter_Fraga_Om_tydlighet);
            JOptionPane.showMessageDialog(null, Anstallningslamplighet_Med_tanke_Pa_tydlighet);

            Intervju_assistenter = JOptionPane.showInputDialog("Hur stark ar du?");
            String Assistentens_Muskelstyrka = Intervju_assistenter;
            String Anstallningslamplighet_Avseende_Muskelstyrka = assistent.Assistentens_Behov_Av_Muskelstyrka(Assistentens_Muskelstyrka);
            JOptionPane.showMessageDialog(null, Anstallningslamplighet_Avseende_Muskelstyrka);


            Brukare brukare = new Brukare();
            String Fragor_Till_Brukare = JOptionPane.showInputDialog("Hur gammal ar du?");
            if (Intervju_assistenter == null || Fragor_Till_Brukare == null)
                break;
            brukare.Alder_Pa_Brukare = Integer.parseInt(Fragor_Till_Brukare);
            String Lamplighet_Avseende_Aldeerskillnad = brukare.Skillnad_Mellan_Aldrar(assistent.Alder_Pa_Assistent, brukare.Alder_Pa_Brukare);
            JOptionPane.showMessageDialog(null, Lamplighet_Avseende_Aldeerskillnad);

            Fragor_Till_Brukare = JOptionPane.showInputDialog("Hur stort tydlighetsbehov har du? valj mellan alternativen 'Jag behover mycket tydlighet i vardagen' eller 'Jag behover lite tydlighet i vardagen'");
            String Fraga_Om_tydlighet_hos_Brukaren = Fragor_Till_Brukare;
            String Behov_Av_Tydlighet_Hos_Brukaren = brukare.Behov_Av_Bra_Pedagogik(Fraga_Om_tydlighet_hos_Brukaren);
            JOptionPane.showMessageDialog(null, Behov_Av_Tydlighet_Hos_Brukaren);

            Fragor_Till_Brukare = JOptionPane.showInputDialog("Hur ofta behover du lyftas? Valj mellan 'Jag behover lyftas ofta' eller 'Jag behover lyftas sallan' ");
            String Fraga_Om_Lyftbehov_Hos_Brukaren = Fragor_Till_Brukare;
            String Behov_Av_Bra_Styrka_Hos_Assistenten = brukare.Behover_Lyftas_Ofta(Fraga_Om_Lyftbehov_Hos_Brukaren);
            JOptionPane.showMessageDialog(null, Behov_Av_Bra_Styrka_Hos_Assistenten);

            Fragor_Till_Brukare = JOptionPane.showInputDialog("Hur lange vill du att assistenten jobbar hos dig? Svara i ar.");
            brukare.Onskemal_Om_Lagnd_Pa_anstallning = Integer.parseInt(Fragor_Till_Brukare);
            if (brukare.Onskemal_Om_Lagnd_Pa_anstallning == assistent.Lagnd_Pa_anstallning) {
                JOptionPane.showMessageDialog(null, " En anstallning mellan er tva verkar passa bra ihop");
            } else {
                JOptionPane.showMessageDialog(null, "En anstallning mellan er verkar inte ga att fa till med tanke pa att ni har olika onskemal pa anstallningslagnden");
            }


        }

    }


}

