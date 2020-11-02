package Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Input {

    public List<Properties> people = new ArrayList<Properties>();
    String[] propNames = {"First Name", "Name", "Phone", "Email", "Birthday"};

    //Adding a user to the end of the list
    public void addUsers(){
        String[] current;
        while(true){
            current = inputProperties();
            if(current[0].equals("skip")){
                break;
            }
            people.add(new Properties(current[0], current[1], current[2], current[3], current[4]));
            System.out.println("USER ADDED SUCCESSFULLY...");
        }
    }
    //finding a user by his name
    public String[] findUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("NAME: ");
        String[] name = scanner.nextLine().split(" ");
        System.out.println(Arrays.toString(name));
        scanner.close();
        return name;
    }
    //change the properties of a user that was found by findUser()
    public void changeByProperty(){
        String[] name = findUser();

        for(Properties prop : people){
            if(prop.firstName.equals(name[0]) && prop.name.equals(name[1])){
                String[] current = inputProperties();
                prop.changeProperties(current[0], current[1], current[2], current[3], current[4]);
                System.out.println("USER CHANGED SUCCESSFULLY...");
            }
        }
    }
    //input the Properties for the funcion
    public String[] inputProperties(){
        Scanner scanner = new Scanner(System.in);
        String[] current = new String[propNames.length];
        System.out.println();
        for(int i = 0; i<propNames.length; i++){
            System.out.println(propNames[i]+": ");
            current[i] = scanner.nextLine();
        }
        return current;
    }



    void showList(){
        for(int i = 0; i<people.size(); i++){
            System.out.println(people.get(i).name+", "+ people.get(i).firstName);
        }
    }

    

    public static void main(String[] args){
        
    }
}