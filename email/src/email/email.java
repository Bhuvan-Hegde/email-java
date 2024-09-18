package email;

import java.util.Scanner;

public class email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private int defaultPasswordLen =10 ;
    private String alternateMail;
    private String email;
    private String companySuffix = "company.com";


    //constructor
    public email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created" + " " + firstName + " " + lastName);
        this.department = setDept();
        this.password = randomPassword(defaultPasswordLen);


        //make email
        email = firstName.toLowerCase() + "." +lastName.toLowerCase()+"@"+department.toLowerCase()+"."+ companySuffix;

    }

    //dept
    private String setDept(){
        System.out.println("Choose your dept \n1 for sales\n2 for Development\n3 for Accounts\n0 for none");
        Scanner in = new Scanner(System.in);
        int dept = in.nextInt();
        if (dept ==1){return "sales";}
        else if (dept ==2 ) {
            return "Development";
        }
        else if (dept ==3){return "accounts";}
        else return "none";

    }

    //random pass gens
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#$%";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            int rand = (int) (Math.random() * (passwordSet.length()));
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }


    //set alt mail
    public void setAltMail(String altEmail){
        this.alternateMail = altEmail;
    }

    //change pass
    public void changePass(String password){
        this.password = password;
    }


    public String showInfo(){
        return "Name :" + firstName + " " + lastName +"\n" + "Company Email :" + email +"\n" + "Password :" + password;
    }
}


