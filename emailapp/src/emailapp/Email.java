package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();

        this.password = randPassword(defaultPasswordLength);
        System.out.println("Password: " + this.password);

        email = firstName + "." + lastName + "@" + department + "." + "company.com";
        System.out.println("Your Email: " + email);

    }

    private String setDepartment(){
        System.out.print("DEPARTMENT CODE: \n1 for Sales \n2 for Development \n3 for Accounting\nCode: ");
        Scanner in = new Scanner(System.in);
        int depCode = in.nextInt();
        if(depCode == 1){ return "sales";}
        else if(depCode == 2){return "dev";}
        else if(depCode == 3){return "acct";}
        else return "";
    }
    private String randPassword(int defaultPasswordLength){
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%^&*()-_+=";
        char[] password = new char[defaultPasswordLength];
        for(int i=0; i<defaultPasswordLength; i++)
        {
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }
}
