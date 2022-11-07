package segment;

public class Segment{
  private int extr1, //Extremité 1 du segment 
  private int extr2; //Extremité 2 du segment

  public Segment(int extr1, int extr2){
    this.extr1 = extr1;
    this.extr2 = extr2;
    if (extr1 > extr2){
      ordonne();
    }
  }

  public void ordonne() {
        int tampon = extr1;
        extr1 = extr2;
        extr2 = tampon;
    }

  public int longeur(){
    return extr2 - extr1;
  }
  
  public boolean appartient(int x){
    return (extr1 <= x && extr2 >= x);
  }

  public String toString(){
    return "abscisse 1 =  " + extr1 + " abscisse 2 = " + extr2;
  }
  
}