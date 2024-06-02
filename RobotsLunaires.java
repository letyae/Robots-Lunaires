import java.util.*;

class RobotsLunaires {
 
    
    public static String left(String orientation){
        
        switch (orientation){
          case "N":
           return "W";
           
          case "W":
            return "S";
           
          case "S":
            return "E";

          case "E":
            return "N";
           
          default: 
           return orientation;
         }
		 
    }
    
    public static  String rigth(String orientation){
         
		switch (orientation){
          case "N":
           return "E";

          case "E":
            return "S";
           
          case "S":
            return "W";
           
          case "W":
            return "N";

          default:  
           return orientation;
        }
}

  public static  String movement(int x, int y, String orientation,int table_x, int table_y )
    {
        
       // System.out.println("robot state: "+this.robotx+" "+this.roboty+" "+orientation);
        
        
        if(orientation.equals("N") && y+1<=table_y){
          y +=1;
        }else if(orientation.equals("S") && y-1>=0)
          y -=1;
        else  if(orientation.equals("E") && x+1<=table_x)
          x +=1;
        else if(orientation.equals("W") && x-1>=0)
          x -=1;
          return x+" "+y+" "+orientation;
    }
    
 


  public  void main() {

    String positionRobot,line=""; 
		Scanner  sc = new Scanner(System.in);

		int  table_x=0;// = sc.nextInt();
		int  table_y=0;// = sc.nextInt();
		//sc.nextLine();

		int positionRobotX=-1, positionRobotY=-1;
    String OrientationRobot="";
    RobotsLunaires robot=null;
	  int nombreInstruction=0;
    String instruction="";    
    String resultatMovement;




if (line.split(",").length == 2 ){
            try {
                 table_x = Integer.parseInt(line.split(",")[0]);
                 table_y = Integer.parseInt(line.split(",")[1]);

                 
            }catch(NumberFormatException e){
                System.out.println(e);
            } }





while(sc.hasNextLine()){ 
    positionRobot  = sc.nextLine();
    instruction  = sc.nextLine();
    
    if (positionRobot.split(" ").length == 3 ){
            try {
                 positionRobotX = Integer.parseInt(positionRobot.split(" ")[0]);
                 positionRobotY = Integer.parseInt(positionRobot.split(" ")[1]);

                 OrientationRobot = positionRobot.split(" ")[2];
                 
            }catch(NumberFormatException e){
                System.out.println(e);
            }
       }
      
       
       
      for(int i=0; i < instruction.length(); i++){

          if(instruction.substring(i,i+1).equals("L")){

           OrientationRobot = left(OrientationRobot);

         }else  if(instruction.substring(i,i+1).equals("R")){
            OrientationRobot = rigth(OrientationRobot);
           
         }else  if(instruction.substring(i,i+1).equals("M")){
           resultatMovement = movement(positionRobotX,positionRobotY,OrientationRobot,table_x,table_y);

         if (resultatMovement.split(" ").length == 3 ){
            try {
                 positionRobotX = Integer.parseInt(positionRobot.split(" ")[0]);
                 positionRobotY = Integer.parseInt(positionRobot.split(" ")[1]);

                 OrientationRobot = positionRobot.split(" ")[2];
                 
            }catch(NumberFormatException e){
                System.out.println(e);
            }
       }
    }
      }
                    
    
    
System.out.println(positionRobotX+" "+positionRobotY+" "+OrientationRobot);
    } 
 }
} 
