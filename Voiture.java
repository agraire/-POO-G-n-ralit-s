//Exercice 2

class Voiture{
  private String marque;
  private int prix;
  private Pilote pilote;

  public Voiture(String marque, int prix, Pilote pilote){
    this.marque = marque;
    this.prix = prix;
    this.pilote = pilote;
  }

  public void demarrer(){
    System.out.println("Demarrage ...");
  }

  public void arreter(){
    System.out.println("S'arreter ...");
  }

  public void seDeplacer(){
    System.out.println("Vroum ...");
  }
    
}