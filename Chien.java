//Exercice 1 
class Chien {
  private String race;
  private int age;
  private String couleur;

  public Chien(String race, int age, String couleur) {
    this.race = race;
    this.age = age;
    this.couleur = couleur;
  }

  @Override
  public String toString(){
    return "C'est un Chien de race " + race + " de couleur " + couleur + " qui a " + age + " ans!";
  }
  
  public int getAge(){
    return age;
  }

  public void setAge(){
    
  }

  public String aboyer() {
    return "Woaf !";
  }

  public String dormir() {
    return "Zzzzzz !";
  }

}