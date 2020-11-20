package com.company;

import javax.swing.*;


public class Brukare {
    private int Alder_Pa_Brukare;
    private String namn;

    private int  Behov_Av_Tydlighet;
    private String Behover_Lyftas_Ofta;
    private int  Skillnad_Mellan_Aldrar;
    private int  Onskemal_Om_Lagnd_Pa_anstallning;

    /**
     * Denna metod returnerar brukarens för och efternamn.
     * @param namn
     */
    public void SetNamn_Pa_Brukare(String namn ) {
        if (namn == null)
            throw  new IllegalArgumentException("Namnet far inte vara tomt");
        JOptionPane.showMessageDialog(null,"Vad bra, da vet vi vad du heter. Valkommen till oss " + namn + ".");
    }

    public int getAlder_Pa_Brukare() {
        return Alder_Pa_Brukare;
    }

    /**
     * @param Alder_Pa_Assistent
     * @param Alder_Pa_Brukare
     * @return Lamplighet med tanke pa alderskillnad.
     */
    public void Set_Skillnad_Mellan_Aldrar(int Alder_Pa_Assistent, int Alder_Pa_Brukare) {
        String Lamplighet_Med_tanke_pa_aldersskillnad = " ";
        int Alderskillnad = Alder_Pa_Assistent - Alder_Pa_Brukare;
        if(Alderskillnad < 0)
            throw new IllegalArgumentException("En alderskillnad kan inte vara negativ");
        else if (Alderskillnad > 15)
            Lamplighet_Med_tanke_pa_aldersskillnad = "For stor alderskillnad mellan assistent och brukare.";
        else if (Alderskillnad < 4)
            Lamplighet_Med_tanke_pa_aldersskillnad = "For liten alderskillnad mellan assistent och brukare.";
        else
            Lamplighet_Med_tanke_pa_aldersskillnad = "Lagom stor alderskillnad mellan assistent och brukare.";
        JOptionPane.showMessageDialog(null,Lamplighet_Med_tanke_pa_aldersskillnad);

    }

    /**
     * Detta ar en metod som returnerar en strang som  berettar villket behov av muskelstyrka brukaren har.
     *
     * @param Behov_Av_Muskelstyrka
     * @return Assistentens styrkebehov
     */
    public void Set_Behover_Lyftas_Ofta(String Behov_Av_Muskelstyrka) {
        String Assistentens_Styrkebehov = "";
        if (Behov_Av_Muskelstyrka.equals("Jag behover lyftas ofta"))
            Assistentens_Styrkebehov = "Da vet vi att du behover en stark assistent.";
        else if (Behov_Av_Muskelstyrka.equals("Jag behover lyftas sallan"))
            Assistentens_Styrkebehov = "Da vet vi att det inte behovs en sa stark assistent.";
        else
            throw  new IllegalArgumentException("Felaktig data inmatat");

      JOptionPane.showMessageDialog(null,Assistentens_Styrkebehov);
    }

    /**
     * Detta ar en metod som returnerar en strang som bekraftar vad brukaren behover i form av tydlighet hos assistenten.
     *
     * @param Behov_Av_Tydlighet
     * @return Behov_Av_Tydlighet_Hos_Assistenten
     */
    public void Behov_Av_Bra_Pedagogik(String Behov_Av_Tydlighet) {
        String Behov_Av_Tydlighet_Hos_Assistenten = "";
        if (Behov_Av_Tydlighet.equals("Jag behover mycket tydlighet i vardagen"))
            Behov_Av_Tydlighet_Hos_Assistenten = "Da ska vi leta efter en assistent med mycket pedagogiska kunskaper till dig.";
        else if (Behov_Av_Tydlighet.equals("Jag behover lite tydlighet i vardagen"))
            Behov_Av_Tydlighet_Hos_Assistenten = " Da vet vi att din assistent inte behover sa mycket pedagogik.";
        else
            throw  new IllegalArgumentException("Felaktig data inmatat");
        JOptionPane.showMessageDialog(null,Behov_Av_Tydlighet_Hos_Assistenten);
    }


    }

























