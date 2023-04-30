package com.github.theabdel572.JocsLiteraturaValenciana.main;

import java.util.HashMap;
import java.util.Map;

public enum AuthorsInfo {
    POMPEU_FABRA("Pompeu Fabra",
            new String[]{"<html>Va ser el principal artífex de la normativització de la llengua catalana moderna.</html>",
            "<html>Va publicar diverses gramàtiques, diccionaris i manuals de la llengua catalana, basant-se en criteris científics i respectant la pronúncia i l’etimologia dels mots.</html>",
            "<html>La seva obra més coneguda és el Diccionari general de la llengua catalana de 1932.</html>",
            "<html>Va ser fundador de la Secció Filològica de l’IEC i president de la Unió Catalana de Federacions Esportives.</html>"},
            (short) 1868),
    RAMON_LLULL("Ramon Llull",
            new String[]{"<html>Va ser un escriptor, filòsof, teòleg i missioner mallorquí.</html>",
            "<html>Va ser un dels primers autors que va escriure en català i va ser un dels primers a fer servir la llengua catalana per a temes filosòfics i religiosos.</html>",
            "<html>Va realitzar una transformació religiosa quan tenia trenta anys, a partir de la qual dedicà la seva vida al proselitisme cristià, especialment entre jueus i musulmans.</html>",
            "<html>Va escriure en català, occità, llatí i àrab.</html>",
            "<html>Va escriure obres com “Llibre de contemplació en Déu”, “Llibre d’amic e amat”, “Ars Magna” i \"Llibre de les meravelles\".</html>"},
            (short) 1232),
    FRANCESC_EIXIMENIS("Francesc Eiximenis",
            new String[]{"<html>Va ser un escriptor franciscà de la Corona d’Aragó.</html>",
            "<html>Va ser un dels autors catalans medievals més llegits, copiats, publicats i traduïts.</html>",
            "<html>Va escriure obres com “Llibre de les dones”, “Llibre de les ànimes”, “Llibre de les dones casades” i “Llibre de confessió”.</html>",
            "<html>Va ser un dels primers autors catalans que va escriure en prosa.</html>",
            "<html>Va escriure obres religioses i morals, així com obres sobre política i història.</html>"},
            (short) 1330),
    BERNAT_METGE("Bernat Metge",
            new String[]{"<html>Va ser un escriptor, traductor i primer representant de l’humanisme en les lletres catalanes.</html>",
            "<html>És considerat un dels millors prosistes del segle XIV i el introductor de l’estil renaixentista en la literatura catalana.</html>",
            "<html>És conegut per la seua obra “Lo Somni”, que va escriure des de la presó en 1398 i en la qual discuteix la immortalitat de l’ànima.</html>",
            "<html>Va traduir obres de Virgili, Ovidi i Bocaccio al català.</html>",
            "<html>Va ser secretari del rei Martí l’Humà i va ocupar diversos càrrecs públics.</html>"},
            (short) 1340),
    ANSELM_TURMEDA("Anselm Turmeda",
            new String[]{"<html>Va ser un escriptor, traductor i poeta mallorquí.</html>",
            "<html>Inicialment va ser fraire franciscà, encara que posteriorment es va convertir a l’islam i va viure com a musulmà a Tunis.</html>",
            "<html>Va ser un dels primers escriptors que va escriure en àrab i en una llengua llatina.</html>",
            "<html>Va escriure sis obres: Llibre de Bons amonestaments; la Divisió; les Profecies; Libre de tres; la Disputa de l’ase; la Tuhfa.</html>"},
            (short) 1355),
    SANT_VICENT_FERRER("Sant Vicent Ferrer",
            new String[]{"<html>Va ser un religiós dominic valencià que va influir decisivament en el Compromís de Casp i en la resolució del Cisma d’Occident.</html>",
            "<html>Va ser fill del notari Guillermo Ferrer i de Constancia Miquel.</html>",
            "<html>Va ser un teòleg, predicador, escritor i sant.</html>",
            "<html>Va ser canonitzat el 1455.</html>",
            "<html>Va recórrer Europa predicant i va ser conegut per les seues habilitats oratòries.</html>",
            "<html>Va ser un dels predicadors més importants del segle XV.</html>",
            "<html>Va ser professor de filosofia a la Universitat de Lleida.</html>",
            "<html>Va ser nomenat predicador general dels dominics el 1389.</html>"},
            (short) 1350),
    JORDI_DE_SANT_JORDI("Jordi de Sant Jordi",
            new String[]{"<html>Va ser un poeta cortesà i militar.</html>",
            "<html>Va ser fill d’uns musulmans conversos.</html>",
            "<html>Va tenir el càrrec de camarero real i va gaudir de la protecció d’Alfons el Magnànim.</html>",
            "<html>Va participar en l’acció de Calvi i en el setge de Bonifacio.</html>",
            "<html>Va ser presoner a Nàpols el 1423.</html>",
            "<html>És conegut per la seua poesia.</html>"},
            (short) 1396),
    AUSIAS_MARCH("Ausias March",
            new String[]{"<html>Va ser un poeta i cavaller valencià medieval.</html>",
            "<html>Era originari d’una família de la petita noblesa amb aficions poètiques.</html>",
            "<html>Va ser un dels poetes més importants del Segle d’Or valencià.</html>",
            "<html>La seua obra poètica és una de les més importants de la literatura catalana i valenciana.</html>",
            "<html>La seua tumba es troba al Monestir de Sant Jeroni de Cotalba.</html>",
            "<html>La seua poesia és caracteritza per la seua sinceritat i per la seua capacitat per expressar els sentiments amb gran profunditat.</html>",
            "<html>La seua obra poètica és una reflexió sobre l’amor, la mort i la religió.</html>"},
            (short) 1400),
    JOAN_ROIS_DE_CORELLA("Joan Roís de Corella",
            new String[]{"<html>Va ser senyor de l’alqueria de Beneito i senyor de Miraflor (La Marina Alta).</html>",
            "<html>Va ser un poeta, cavaller i sacerdot valencià del segle XV, que va escriure en valencià.</html>",
            "<html>En el seu llegat literari, tant en prosa com en vers, es troben obres de temàtica religiosa, amorosa i d’altres temes.</html>",
            "<html>Va ser fill d’Ausiàs Roís de Corella i de la seva dona Aldonça, de la petita noblesa de Gandia.</html>",
            "<html>Va mantenir forts llaços d’amistat amb Ausiàs March i la seva família.</html>",
            "<html>Va renunciar al món cavalleresc i a la vida pública per dedicar-se de forma exclusiva a la literatura, a la teologia i, en la seva joventut, a l’amor.</html>",
            "<html>Va adquirir fama de bon orador, encara que no es conserven els seus textos.</html>",
            "<html>Va ser un dels poetes més importants del Segle d’Or valencià.</html>"},
            (short) 1435),
    JAUME_ROIG("Jaume Roig",
            new String[]{"<html>Va ser un metge i escriptor valencià, famós per ser l’autor d’Espill o Llibre de les dones, una de les obres més rellevants de la literatura catalana medieval.</html>",
            "<html>Va ser fill d’un metge amb el mateix nom, Jaume Roig «lo vell», amb cert prestigi a la ciutat del Túria.</html>",
            "<html>Va estudiar medicina probablement a la Universitat de Lleida.</html>",
            "<html>La seua professió li donà molt d’èxit social i econòmic.</html>",
            "<html>Va ser examinador de metges diversos anys i va formar part de la comissió municipal.</html>",
            "<html>Va ser metge a l’Hospital d’En Clapers (1450–1478), l’Hospital d’En Bou (1466–1478) i l’Hospital dels Innocents (1452–1478).</html>",
            "<html>Va ser autor d’una única obra: Espill, una obra composta per 16.247 versos tetrasíl·labs apariats enquadrada en la tendència misògina medieval.</html>",
            "<html>Espill és una obra amb aspectes contradictoris, medievals i moderns, tant en la seva forma com en el seu contingut.</html>"},
            (short) 1400),
    SOR_ISABEL_DE_VILLENA("Sor Isabel de Villena",
            new String[]{"<html>Va ser una religiosa i escriptora valenciana del segle XV.</html>",
            "<html>Va ser filla il·legítima d’Enric de Villena, noble descendent de la casa Trastàmara.</html>",
            "<html>Va ser batejada amb el nom d’Elionor Manuel de Villena i va adoptar el nom d’Isabel al ingressar en el convent.</html>",
            "<html>Va ingressar voluntàriament al convent de la Santíssima Trinitat de les clarisses de València el 1445, quan només tenia 15 anys.</html>",
            "<html>Va ser nomenada abadessa el 1462 i va ocupar aquest càrrec fins a la seva mort.</html>",
            "<html>Va impulsar les obres del convent de la Trinitat i el va convertir en una joia del gòtic valencià tardà.</html>",
            "<html>Va ser considerada persona honesta i de múltiples virtuts durant la seva vida com a clarissa al convent de la Trinitat.</html>",
            "<html>L’única obra que s’ha conservat d’ella és el Vita Christi, publicat a València el 1497 per l’abadessa que la va succeir, Aldonça de Montsoriu.</html>"},
            (short) 1430),
    JACINT_VERDAGUER("Jacint Verdaguer",
            new String[]{"<html>Va ser un poeta i sacerdot català, considerat com el màxim representant del Renaixement literari de la llengua catalana.</html>",
            "<html>Va ser un prevere i destacat poeta en llengua catalana.</html>",
            "<html>Va ser una de les grans figures de la Catalunya moderna.</html>",
            "<html>Va ser adscrit a la generació de la Restauració de 1874, que a la Renaixença tornà a situar la llengua catalana en la categoria de llengua literària.</html>",
            "<html>Va ser fill d’una família modesta però amb un cert nivell cultural.</html>",
            "<html>Va ingressar al Seminari de Vic el 1855, on va cursar la carrera eclesiàstica.</html>",
            "<html>Va compondre versos en català des d’una edat primerenca.</html>",
            "<html>Va escriure diverses obres poètiques, entre les quals destaquen L’Atlàntida (1877) i Canigó (1886).</html>"},
            (short) 1845);

    /**
     * Information of every item of the enum.
     * @param name A string containing the name of the author.
     * @param info An array containing strings that have the most important facts about the author (with html tags).
     * @param birthYear A short with the birth year of the author.
     */
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

    /**
     * Creates a map with 8 random authors and a random fact about them, got from the info array of the enum.
     * The map is used to create the cards of the game.
     * @return a map with the cards of the game.
     */
    public static Map<String, String> createCardsMap() {
        Map<String, String> cards = new HashMap<>();

        // Create an array with the indexes of the authors.
        int[] authorIndexes = new int[values().length];
        for (int i = 0; i < values().length; i++) {
            authorIndexes[i] = values()[i].ordinal();
        }

        // Get 8 random authors and a random fact about them.
        for (int i = 0; i < 8; i++) {
            // Get a random author.
            int randomIndex = (int) (Math.random() * authorIndexes.length);
            int authorIndex = authorIndexes[randomIndex];

            // Creating a new array without the author that has been used so the map doesn't have repeated keys.
            int[] authorIndexesWithoutUsedAuthor = new int[authorIndexes.length - 1];
            System.arraycopy(authorIndexes, 0, authorIndexesWithoutUsedAuthor, 0, randomIndex);
            System.arraycopy(authorIndexes, randomIndex + 1, authorIndexesWithoutUsedAuthor, randomIndex, authorIndexes.length - randomIndex - 1);

            // Replace the old array with the new one.
            authorIndexes = authorIndexesWithoutUsedAuthor;

            // Get a random fact about the author.
            String[] infoArray = values()[authorIndex].getInfo();
            int randomInfoIndex = (int) (Math.random() * infoArray.length);
            String randomInfo = infoArray[randomInfoIndex];

            // Add the author and the fact to the map.
            cards.put(values()[authorIndex].getName(), randomInfo);
        }
        return cards;
    }
}