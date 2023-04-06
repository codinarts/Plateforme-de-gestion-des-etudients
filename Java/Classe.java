package projet;


public class Classe {
    private String nom;
    private int nombre;
    private String promo;
    private Eleve[] eleve;




    //Contructeur sans parametres 
    public Classe(){}

    //Contructeur avec parametres 
    public Classe ( String vnom, int vnombre,String vpromo, Eleve[] veleve ){
        nom=vnom;
        nombre=vnombre;
        promo=vpromo;
        eleve=veleve;
    };

    //Accesseur Get 

    public String getNom(){return nom;};
    public double getNombre(){return nombre;}
    public String getPromo(){return promo;}
    public Eleve[] getEleve(){return eleve;}


    // Acceesseur Set
    public void setNom(String vnom){nom=vnom;}
    public void setNombre(int vnombre){nombre=vnombre;};
    public void setPromo(String vpromo){promo=vpromo;}
    public void setEleve(Eleve[] veleve){eleve=veleve;}



    public void creerClasse(Classe C,  String nom, int nombre, String promo, Eleve[] eleve){
        C.nom=nom;
        C.nombre=nombre;
        C.promo=promo;
        C.eleve=eleve;
    }


}
