package Assesment;

public class game {

	public String lookAction(String lookA) 
	{
		String look1 = "look";
		
		if( look1 == lookA) {
			return lookA;
		}
		if(look1 != lookA){
			System.out.println("You Stare off into the distince, try 'look'");
		}
		return story.scenerioA();
     }
	//ScenerioA decision
    public String directionA(String move) {
    	
    	String moveA = "north";
		switch(moveA) {
		case "north":
			System.out.println("You enter the canyon and see a wide desert plane with four temples, two on either side of eachother");
			break;
		case "south":
			System.out.println("You decide to head back into your ship and fly away from the planet.");
			break;
		case "east":
			System.out.println("You walk into the east side of the canyon wall.. try going 'north'");
			break;
		case "west":
			System.out.println("You walk into the west side of the canyon wall.. try going 'north'");
			break; }
		return move;
    }
    //use an array for the 5m away from treasure
     public int tresureFinder() {
	  int[] tresureLocator = {1, 2 ,3 ,4 ,5};
	   for (int t : tresureLocator) {
		   System.out.println(t +"m");
	   }
	   return tresureFinder();
  }
}