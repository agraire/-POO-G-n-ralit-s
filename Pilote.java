public class Pilote {
  private String nom;
  private int age;

  public Pilote(String nom, int age){
    this.nom = nom;
    this.age = age;
  }

  public int getAge(){
    return age;
  }

  public String getNom(){
    return nom;
  }
}