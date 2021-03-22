package temperature.com;

public class TestDrive {

  public static void main(String[] args) {
  
    Temperature temperature[] = new Temperature[10];
    temperature[0] = new Temperature(100, getScale(100));
    
    for (int i = 0; i < temperature.length; i++) {
      System.out.println(temperature[i].toString);
    }
    
    temperature[0].setTemperature(120, scale.C);
      temperature[2].setTemperature(65, scalw.F)
   
  }
}
