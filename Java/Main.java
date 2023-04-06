package projet;
import java.util.Scanner;

import projet.Eleve.enumsexe;

public class Main {
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);

    System.out.println("Veillez entrer le nom de la classe ");
    String nom = lire.nextLine();

    System.out.println("Veillez entrer le nombre d'élève");
    int nombre = lire.nextInt();
    System.out.println("Veillez entrer la promotion ");
    lire.nextLine();
    String promo = lire.nextLine();
    
    Eleve[] eleves= new Eleve[nombre];

    for(int i=0; i<nombre;i++){
        System.out.println("Veillez entrer le nom de l'élève");
        String nomEleve = lire.next();
        System.out.println("Veillez entrer le prenom de l'élève");
        String prenomEleve = lire.next();

        System.out.println("Veillez entrer le sexe de l'élève\n M. pour masculin \n F. Feminin");
        String sexe = lire.next();
        enumsexe Sexe = enumsexe.valueOf(sexe);

        System.out.println("Veillez entrer la note en Informatique de l'élève");
        double noteInfo = lire.nextDouble();

        System.out.println("Veillez entrer la note en Math de l'élève");
        double noteMaths = lire.nextDouble();

        System.out.println("Veillez entrer la note en Anglais de l'élève");
        double noteAng = lire.nextDouble();

        Eleve eleve= new Eleve(nomEleve,prenomEleve,Sexe,noteInfo,noteMaths,noteAng);
        eleves[i]=eleve;

    }

    Classe classe = new Classe();
    classe.creerClasse(classe,nom,nombre,promo,eleves);


    System.out.println("Voici la liste de eleve de la classe ");
    System.out.println("Classe: "+ classe.getNom()+"\t Nombre: "+ classe.getNombre()+ "Promo: "+ classe.getPromo());
    for(Eleve eleve: classe.getEleve())
    System.out.println("- "+eleve.getNomEleve() + "\t" + eleve.getPrenomEleve()+ "\t"+ eleve.getSexe()+ "\t"+ eleve.getNoteInfo()+ "\t" + eleve.getNoteMaths()+"\t"+ eleve.getNoteAng());



    lire.close();
    }
}
