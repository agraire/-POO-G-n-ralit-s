class Main {
  public static void main(String[] args) {
    //Exercice 1
    Chien gringo = new Chien ("Golden retriever", 17, "marron");
    System.out.println(gringo);
    gringo.aboyer();
    gringo.dormir();

    Pilote John = new Pilote("John John", 12);
    Voiture rouge = new Voiture("Ferrari", 150000000, John);
    rouge.demarrer();
    rouge.seDeplacer();
    rouge.arreter();
  }
}