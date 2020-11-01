package Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Input {

    public List<Properties> people = new ArrayList<Properties>();
    String[] propNames = {"First Name", "Name", "Phone", "Email", "Birthday"};


    public void addUsers(){
        Scanner scanner = new Scanner(System.in);
        String[] current = new String[propNames.length];
        mark: while(true){
            for(int i = 0; i<propNames.length; i++){
                System.out.print(propNames[i]+": ");
                current[i] = scanner.nextLine();
                //test
                if(current[i].equals("skip")){
                    break mark;
                }
            }
            people.add(new Properties(current[0], current[1], current[2], current[3], current[4]));
            System.out.println("USER ADDED SUCCESSFULLY...");
        }
        scanner.close();
    }

    void showList(){
        for(int i = 0; i<people.size(); i++){
            System.out.println(people.get(i).name+", "+ people.get(i).firstName);
        }
    }

    

    public static void main(String[] args){
        Input i = new Input();
        i.addUsers();
        i.showList();
    }
}