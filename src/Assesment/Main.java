package Assesment;

public class Main {

	public static void main(String[] args) {
        
        System.out.println(story.intro()); 
        
        game look = new game();
        //insert anything but should look for 'look'
	    System.out.print(look.lookAction("cat"));
	    
	    game direction = new game();
	    direction.directionA("south");
	    System.out.print("");
	}
 
}
