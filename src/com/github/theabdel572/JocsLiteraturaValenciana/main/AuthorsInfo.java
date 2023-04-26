package com.github.theabdel572.JocsLiteraturaValenciana.main;

public enum AuthorsInfo {
    POMPEU_FABRA("Pompeu Fabra",
            new String[]{"Va ser el principal artífex de la normativització de la llengua catalana moderna.",
            "Va publicar diverses gramàtiques, diccionaris i manuals de la llengua catalana, basant-se en criteris científics i respectant la pronúncia i l’etimologia dels mots.",
            "La seva obra més coneguda és el Diccionari general de la llengua catalana de 1932.",
            "Va ser fundador de la Secció Filològica de l’IEC i president de la Unió Catalana de Federacions Esportives."},
            (short) 1868),
    RAMON_LLULL("Ramon Llull",
            new String[]{"Va ser un escriptor, filòsof, teòleg i missioner mallorquí.",
            "Va ser un dels primers autors que va escriure en català i va ser un dels primers a fer servir la llengua catalana per a temes filosòfics i religiosos.",
            "Va realitzar una transformació religiosa quan tenia trenta anys, a partir de la qual dedicà la seva vida al proselitisme cristià, especialment entre jueus i musulmans.",
            "Va escriure en català, occità, llatí i àrab.",
            "Va escriure obres com “Llibre de contemplació en Déu”, “Llibre d’amic e amat”, “Ars Magna” i \"Llibre de les meravelles\"."},
            (short) 1232),
    FRANCESC_EIXIMENIS("Francesc Eiximenis",
            new String[]{"Va ser un escriptor franciscà de la Corona d’Aragó.",
            "Va ser un dels autors catalans medievals més llegits, copiats, publicats i traduïts.",
            "Va escriure obres com “Llibre de les dones”, “Llibre de les ànimes”, “Llibre de les dones casades” i “Llibre de confessió”.",
            "Va ser un dels primers autors catalans que va escriure en prosa.",
            "Va escriure obres religioses i morals, així com obres sobre política i història."},
            (short) 1330),
    BERNAT_METGE("Bernat Metge",
            new String[]{"Va ser un escriptor, traductor i primer representant de l’humanisme en les lletres catalanes.",
            "És considerat un dels millors prosistes del segle XIV i el introductor de l’estil renaixentista en la literatura catalana.",
            "És conegut per la seua obra “Lo Somni”, que va escriure des de la presó en 1398 i en la qual discuteix la immortalitat de l’ànima.",
            "Va traduir obres de Virgili, Ovidi i Bocaccio al català.",
            "Va ser secretari del rei Martí l’Humà i va ocupar diversos càrrecs públics."},
            (short) 1340),
    ANSELM_TURMEDA("Anselm Turmeda",
            new String[]{"Va ser un escriptor, traductor i poeta mallorquí.",
            "Inicialment va ser fraire franciscà, encara que posteriorment es va convertir a l’islam i va viure com a musulmà a Tunis.",
            "Va ser un dels primers escriptors que va escriure en àrab i en una llengua llatina.",
            "Va escriure sis obres que mostren una singular varietat de gèneres literaris: poesia moralista als Bons amonestaments; poesia descriptiva i diàlegs a la Divisió; poesia apocalíptica i profètica a les Profecies; prosa paronomàstica al Libre de tres; prosa narrativa i diàlegs enginyosos a la Disputa de l’ase; prosa didàctica, històrica, conceptual i doctrinal, a la Tuhfa ."},
            (short) 1355),
    SANT_VICENT_FERRER("Sant Vicent Ferrer",
            new String[]{"Va ser un religiós dominic valencià que va influir decisivament en el Compromís de Casp i en la resolució del Cisma d’Occident.",
            "Va ser fill del notari Guillermo Ferrer i de Constancia Miquel.",
            "Va ser un teòleg, predicador, escritor i sant.",
            "Va ser canonitzat el 1455.",
            "Va recórrer Europa predicant i va ser conegut per les seues habilitats oratòries.",
            "Va ser un dels predicadors més importants del segle XV.",
            "Va ser professor de filosofia a la Universitat de Lleida.",
            "Va ser nomenat predicador general dels dominics el 1389."},
            (short) 1350),
    JORDI_DE_SANT_JORDI("Jordi de Sant Jordi",
            new String[]{"Va ser un poeta cortesà i militar.",
            "Va ser fill d’uns musulmans conversos.",
            "Va tenir el càrrec de camarero real i va gaudir de la protecció d’Alfons el Magnànim.",
            "Va participar en l’acció de Calvi i en el setge de Bonifacio.",
            "Va ser presoner a Nàpols el 1423.",
            "És conegut per la seua poesia."},
            (short) 1396),
    AUSIAS_MARCH("Ausias March",
            new String[]{"Va ser un poeta i cavaller valencià medieval.",
            "Era originari d’una família de la petita noblesa amb aficions poètiques",
            "Va ser un dels poetes més importants del Segle d’Or valencià.",
            "La seua obra poètica és una de les més importants de la literatura catalana i valenciana.",
            "La seua tumba es troba al Monestir de Sant Jeroni de Cotalba.",
            "La seua poesia és caracteritza per la seua sinceritat i per la seua capacitat per expressar els sentiments amb gran profunditat.",
            "La seua obra poètica és una reflexió sobre l’amor, la mort i la religió."},
            (short) 1400);

    AuthorsInfo(String name, String[] info, short birthYear) {
        this.info = info;
        this.name = name;
        this.birthYear = birthYear;
    }

    private final String[] info;
    private final String name;
    private final short birthYear;

    public short getBirthYear() {
        return birthYear;
    }

    public String[] getInfo() {
        return info;
    }

    public String getName() {
        return name;
    }
}