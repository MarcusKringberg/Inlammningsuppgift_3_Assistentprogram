class Assistenter{
    int alder;
    double Lagnd_Pa_anstallning;
    int Uppskattad_Sjukfranvaro_per_ar;
    String fornamn;
    String efternamn;
    String Hur_Bra_Ar_Du_Pa_Pedagogik;
    String muskelstyrka;
    String tydlighetsfraga;

    public static String Namnfraga(String fornamn, String efternamn){
        return fornamn + efternamn;

    }

    public String Fa_Ut_Uppskattad_Sjukfranvaro_Per_Ar(int Sjukfranvaro_Per_Ar){
        String Lamplighet_Med_Tanke_Pa_Sjukfranvaro = " ";
        if (Sjukfranvaro_Per_Ar <= 2)
            Lamplighet_Med_Tanke_Pa_Sjukfranvaro = "Din sjukfranvaro ar tillrackligt lag for det har jobbet";
            else
                Lamplighet_Med_Tanke_Pa_Sjukfranvaro = "Du ar sjuk for ofta for att anstallas pa detta jobb";
            return Lamplighet_Med_Tanke_Pa_Sjukfranvaro;

    }
public double Anstallningens_Uppskattade_Lagnd(double anstallningslagnd){
        if (anstallningslagnd >= 1)
            System.out.println("Din prognos pa anstallningslangden stammer med var vi förvantar oss");
        else
            System
}



}