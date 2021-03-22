package temperature.com;

public class Temperature {

/**
* Enum set foe SCALE
*/

 public static enum SCALE {C, F, K}
 
 /**
 * Temperature and enum instance attributes
 */
 
 private float temperature = 23.0f;
 private SCALE scale = SCALE.F;
 
 String currentTemp;
 String currentScale;

 public Temperature () {
   
 }
 
 public Temperature(float temperature) {
   this.temperature = temperature;
 }
 
 public Temperature(float temperature, SCALE scale) {
   this.temperature = temperature;
   this.scale = scale;
 }
 
 public void setTemperature() {
 
   switch (scale) {
     case C:
     this.temperature = -73;
     break;
     case F:
     this.temperature = -100;
     break;
     case K:
     this.temperature = 199.817f;
     break;
   }
 }
 
 public void setScale () {
   if (temperature >= -100 && temperature <= 150) {
     scale = scale.F;
   } else if (temperature >= -73 && temperature <= 150) {
     scale = scale.C;
   } else if (temperature >= 199.817 && temperature <= 338.706) {
     scale = scale.K;
   } else {
     System.out.println("Invalid scale");
   }
 }
 
 public void setTemperature(float temp, SCALE scale) {
 
   switch (scale) {
     case C:
     this.temperature = temp;
     break;
     case F:
     this.temperature = temp;
     break;
     case K:
     this.temperature = temp;
     break;
   }
 }
 
 public float getCelsius(float temperature, SCALE scale) {
   
   switch (scale) {
     case F:
     this.temperature = 5/9 * (temperature - 32);
     break;
     case K:
     this.temperature = temperature - 273;
     break;
   }
   
   currentTemp = Float.toString(temperature);
   currentScale = scale.C.toString();
   
   return temperature;
 }
 
 public float getFahrenheit(float temperature, SCALE scale) {
 
  switch (scale) {
     case C:
     this.temperature = 9/5 * (temperature) + 32;
     break;
     case K:
     this.temperature = 9/5 * (temperature - 273) + 32;
     break;
   }{}
   
   currentTemp = Float.toString(temperature);
   currentScale = scale.F.toString();
   
 
   return temperature;
 }
 
 public float getKelvin(float temperature, SCALE scale) {
 
  switch (scale) {
     case C:
     this.temperature = temperature + 273;
     break;
     case F:
     this.temperature = 5/9 * (temperature - 32) + 273;
     break;
   }
   
   currentTemp = Float.toString(temperature);
   currentScale = scale.K.toString();
   
 
   return temperature;
 }

}
