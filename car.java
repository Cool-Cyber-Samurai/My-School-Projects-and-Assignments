public class car
{
   private String make;
   private String model;
   private String color;
   private double baseCost;
   
   public String getMake(String make)
   {
      
      return make;
   }
   public String getModel(String model)
   {
      
      return model;
   }
   
   public String getColor(String color)
   {
      
      return color;
   }

   public double getBaseCost(double baseCost)
   {
      
      return baseCost;
   }
   
   public void setMake(String make){
   this.make = make;
   } 
    public void setModel(String model){
   this.model = model;
   } 
   public void setColor(String color){
   this.color = color;
   } 
   public void setBaseCost(double baseCost){
   this.baseCost = baseCost;
   } 
   public double calculateFinalCost()
   {
      return 1.5 * baseCost;
   }
 
   
}