
import java.util.Scanner;

interface Computer{
    void printComputer();
}

class MacprintInfo implements Computer{
    public void printComputer(){
        System.out.println("This is a MacprintInfo");
    }
}

class Windows implements Computer{
    public void printComputer(){
        System.out.println("This is a Windows");
    }
}

class ComputerFactory{
    public static Computer getInstance(String type){
        if(type.equals("Mac")){
            return new MacprintInfo();
        }
        else if(type.equals("Win")){
            return new Windows();
        }
        return null;
    }
}
public class SimpleFactory{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您想要的电脑型号...");
        String type = scanner.nextLine();
        Computer computer = ComputerFactory.getInstance(type);
        computer.printComputer();    
    }
}


