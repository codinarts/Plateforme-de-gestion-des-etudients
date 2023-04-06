package projet;

public class Eleve {
    public enum enumsexe{
        M,F;
    }

    private String nomEleve;
    private String prenomEleve;
    private enumsexe sexe;
    private double noteInfo;
    private double noteMaths;
    private double noteAng;

    
    //construteur sans parametres
    public Eleve(){};
    //Constructeur avec parametres
    public Eleve (String vnomEleve, String vprenomEleve, enumsexe vsexe, double vnoteInfo, double vnoteMaths, double vnoteAng){
        nomEleve= vnomEleve;
        prenomEleve= vprenomEleve;
        sexe=vsexe;
        noteInfo=vnoteInfo;
        noteMaths=vnoteMaths;
        noteAng=vnoteAng;

    }
    //Accesseur Get
    public String getNomEleve(){return nomEleve;}
    public String getPrenomEleve(){return prenomEleve;}
    public enumsexe getSexe(){return sexe;}
    public double getNoteInfo(){return noteInfo;}
    public double getNoteMaths(){return noteMaths;}
    public double getNoteAng(){return noteAng;}

    //Accesseur Set
    public void setNomEleve(String vnomEleve){nomEleve=vnomEleve;}
    public void setPrenomEleve(String vprenomEleve){nomEleve=vprenomEleve;}
    public void setSexe(enumsexe vsexe){sexe=vsexe;};
    public void setNoteInfo(double vnoteInfo){noteInfo=vnoteInfo;}
    public void setNoteMaths(double vnoteMaths){noteMaths=vnoteMaths;}
    public void setNoteAng(double vnoteAng){noteInfo=vnoteAng;}



    // Fonction creerEleve
    public static void  creerEleve(Eleve E, String nomEleve, String prenomEleve, enumsexe sexe, double noteInfo, double noteMaths, double noteAng){
        E.nomEleve=nomEleve;
        E.prenomEleve=prenomEleve;
        E.sexe=sexe;
        E.noteInfo=noteInfo;
        E.noteMaths=noteMaths;
        E.noteAng=noteAng;


    }
}   
