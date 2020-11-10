package com.company;

public class Brukare {
    int Alder_Pa_Brukare;
    String fornamn;
    String efternamn;
    String Behov_Av_Tydlighet;
    String Behover_Lyftas_Ofta;
    int Skillnad_Mellan_Aldrar;
    int Onskemal_Om_Lagnd_Pa_anstallning;

    /**
     * Detta ar en metod som returnerar brukarens for och efternamn.
     *
     * @param fornamn
     * @param efternamn
     * @return fornamn + " " + efternamn
     */
    public String Namn_Pa_Brukare(String fornamn, String efternamn) {

        return fornamn + "" + efternamn;
    }


    /**
     * @param Alder_Pa_Assistent
     * @param Alder_Pa_Brukare
     * @return Lamplighet med tanke pa alderskillnad.
     */
    public String Skillnad_Mellan_Aldrar(int Alder_Pa_Assistent, int Alder_Pa_Brukare) {
        String Lamplighet_Med_tanke_pa_aldersskillnad = " ";
        int Alderskillnad = Alder_Pa_Assistent - Alder_Pa_Brukare;
        if (Alderskillnad > 15)
            Lamplighet_Med_tanke_pa_aldersskillnad = "For stor alderskillnad mellan assistent och brukare.";
        else if (Alderskillnad < 4)
            Lamplighet_Med_tanke_pa_aldersskillnad = "For liten alderskillnad mellan assistent och brukare.";
        else
            Lamplighet_Med_tanke_pa_aldersskillnad = "Lagom stor alderskillnad mellan assistent och brukare.";
        return Lamplighet_Med_tanke_pa_aldersskillnad;
    }

    /**
     * Detta ar en metod som returnerar en strang som  berettar villket behov av muskelstyrka brukaren har.
     *
     * @param Behov_Av_Muskelstyrka
     * @return Assistentens styrkebehov
     */
    public String Behover_Lyftas_Ofta(String Behov_Av_Muskelstyrka) {
        String Assistentens_Styrkebehov = "";
        if (Behov_Av_Muskelstyrka.equals("Jag behover lyftas ofta"))
            Assistentens_Styrkebehov = "Da vet vi att du behover en stark assistent.";
        else if (Behov_Av_Muskelstyrka.equals("Jag behover lyftas sallan"))
            Assistentens_Styrkebehov = "Da vet vi att det inte behovs en sa stark assistent.";
        else
            Assistentens_Styrkebehov = "Felaktig data inmatat.";
        return Assistentens_Styrkebehov;
    }

    /**
     * Detta ar en metod som returnerar en strang som bekraftar vad brukaren behover i form av tydlighet hos assistenten.
     *
     * @param Behov_Av_Tydlighet
     * @return Behov_Av_Tydlighet_Hos_Assistenten
     */
    public String Behov_Av_Bra_Pedagogik(String Behov_Av_Tydlighet) {
        String Behov_Av_Tydlighet_Hos_Assistenten = "";
        if (Behov_Av_Tydlighet.equals("Jag behover mycket tydlighet i vardagen."))
            Behov_Av_Tydlighet_Hos_Assistenten = "Da ska vi leta efter en assistent med mycket pedagogiska kunskaper till dig";
        else if (Behov_Av_Tydlighet.equals("Jag behover lite tydlighet i vardagen."))
            Behov_Av_Tydlighet_Hos_Assistenten = " Da vet vi att din assistent inte behover sa mycket pedagogik.";
        else
            Behov_Av_Tydlighet_Hos_Assistenten = "Felaktig data inmatat.";
        return Behov_Av_Tydlighet_Hos_Assistenten;
    }

    /**
     * Detta ar en metod som returnerar assistentens onskemal om lagnd pa anstallning. Detta lagras i en String_variabel i metoden Main.
     *
     * @param Onskemal_Om_Lagnd_Pa_Anstallning
     * @return Onskemal_Om_Lagnd_Pa_Anstallning
     */

    public int Hur_Lange_Vill_Du_Helst_Att_Assistenten_Jobbar_I_Ar(int Onskemal_Om_Lagnd_Pa_Anstallning) {
        return Onskemal_Om_Lagnd_Pa_anstallning;
    }


}



















