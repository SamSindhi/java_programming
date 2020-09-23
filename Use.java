import java.util.Scanner;

class Use {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int moveDirection = scanner.nextInt();
        String direction = new String("");
        switch(moveDirection) {
            case 1: 
                direction = "move up";
                break;
            case 2: 
                direction = "move down";
                break;
            case 3: 
                direction = "move left";
                break;
            case 4: 
                direction = "move right";
                break;
            default: direction = "do not move";
        }
        System.out.println(direction);
    }
}
