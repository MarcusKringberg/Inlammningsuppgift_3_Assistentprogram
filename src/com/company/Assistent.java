package com.company;

public class Assistent {
    int Alder_Pa_Assistent;
    double Lagnd_Pa_anstallning;
    int Uppskattad_Sjukfranvaro_Per_Ar;
    String fornamn;
    String efternamn;
    String Hur_Bra_Ar_Du_Pa_Pedagogik;
    String muskelstyrka;
    String Tydlighet;

    /**
     * En metod som returnerar assistentens namn.
     *
     * @param fornamn
     * @param efternamn
     * @return fornamn + efternamn
     */
    public String Namnfraga(String fornamn, String efternamn) {
        return fornamn + "" + efternamn;

    }

    /**
     * En metod som returnerar aldern pa assistenten
     *
     * @param Alder_Pa_Assistent
     * @return Alder_pa_assistent
     */
    public int Alder(int Alder_Pa_Assistent) {

        return Alder_Pa_Assistent;
    }

    /**
     * /**Detta ar en metod som returnerar en strang som berattar om assistenten ar lamplig att anstallas med tanke pa dennes sjukfranvaro.
     *
     * @param Sjukfranvaro_Per_Ar
     * @return Lamplighet_Med_Tanke_Pa_Sjukfranvaro
     */

    public String Fa_Ut_Uppskattad_Sjukfranvaro_Per_Ar(int Sjukfranvaro_Per_Ar) {
        String Lamplighet_Med_Tanke_Pa_Sjukfranvaro;
        if (Sjukfranvaro_Per_Ar <= 2)
            Lamplighet_Med_Tanke_Pa_Sjukfranvaro = "Din sjukfranvaro ar tillrackligt lag for det har jobbet.";
        else
            Lamplighet_Med_Tanke_Pa_Sjukfranvaro = "Du ar sjuk for ofta for att anstallas pa detta jobb.";
        return Lamplighet_Med_Tanke_Pa_Sjukfranvaro;

    }

    /**
     * Detta ar en metod som lagrar assistentens onskemal pa anstallningslagnd och sparar det i en variabel i main metoden for att sedan kunna jamfora detta med brukarens onskemal pa anstallningslagnd.
     *
     * @param anstallningslagnd
     * @returnlamplighet_med_tanke_pa_anstallningslagnd
     */
    public String Anstallningens_Uppskattade_Lagnd(double anstallningslagnd) {
        String lamplighet_med_tanke_pa_anstallningslagnd;
        if (anstallningslagnd >= 2)
            lamplighet_med_tanke_pa_anstallningslagnd = "Prognos pa anstallningslangden stammer med var vi förvantar oss.";
        else
            lamplighet_med_tanke_pa_anstallningslagnd = "Vi har onskemal om minst 1 ars arbete pa personer som ska jobba har.";
        return lamplighet_med_tanke_pa_anstallningslagnd;
    }

    /**
     * Detta ar en metod med namnet tydlighet. Den returnerar en sträng som berettar hur lamplig assistenten ar baserat pa dess tydlighet.
     *
     * @param tydlighetsfraga
     * @return lamplighet med tanke pa tydlighet
     */
    public String Tydlighet(String tydlighetsfraga) {
        String Lamplighet_Med_Tanke_Pa_Tydlighet = " ";
        if (tydlighetsfraga.equals("Mycket tydlig"))
            Lamplighet_Med_Tanke_Pa_Tydlighet = "Du passar valdigt bra for anstallningen.";
        else if (tydlighetsfraga.equals("Lite tydlig"))
            Lamplighet_Med_Tanke_Pa_Tydlighet = "Du kan få det har jobbet om du gar mycket utbildning i tydlighet.";
        else if (tydlighetsfraga.equals("Inte alls tydlig"))
            Lamplighet_Med_Tanke_Pa_Tydlighet = "Du ar inte lampad for jobbet med tanke pa att brukaren kraver mycket tydlighet.";
        else
            Lamplighet_Med_Tanke_Pa_Tydlighet = "Felaktig data inmatat.";
        return Lamplighet_Med_Tanke_Pa_Tydlighet;
    }

    /**
     * Detta ar en metod som returnerar en strang som berettar hur lamplig assistenten är för jobbet basserat pa dess muskelstyrka.
     *
     * @param muskelstyrka
     * @return Lamplighet_Med_Tanke_Pa_Muskelstyrka
     */
    public String Assistentens_Behov_Av_Muskelstyrka(String muskelstyrka) {
        String Lamplighet_Med_Tanke_Pa_Muskelstyrka = " ";
        if (muskelstyrka.equals("Lite stark")) {
            Lamplighet_Med_Tanke_Pa_Muskelstyrka = "Det ar inte sa bra for detta jobb. I detta jobb kan brukare behova lyftas och det ar valdigt tungt. Vi far se om vi kan hitta en brukare som inte behover sa tunga lyft.";
        } else if (muskelstyrka.equals("Mycket stark")) {
            Lamplighet_Med_Tanke_Pa_Muskelstyrka = "Det ar väldigt bra att du ar stark i detta jobb da en del funktionshindrade behover hjalp med att lyftas.";
        } else
            Lamplighet_Med_Tanke_Pa_Muskelstyrka = "Felaktig data inmatat.";
        return Lamplighet_Med_Tanke_Pa_Muskelstyrka;


    }
}










