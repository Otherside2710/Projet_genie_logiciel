public class RechercheFilm {

    public RechercheFilm(String nomFichierSQLite){

    };

    public void fermeBase(){

    };

    public String retrouve(String requete){

        /**select id_film
         * from
         * ...
         * intersect
         * select id_film
         * from (select id_film
         * from
         * ...
         * union
         * select id_film
         * from ...)
         */

        return requete;
    };
}
