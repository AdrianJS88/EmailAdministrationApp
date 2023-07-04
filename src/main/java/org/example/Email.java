package org.example;

import java.util.Scanner;

public class Email {



        private String firstName;
        private String lastName;
        private String password;
        private String email;
        private String department;
        private int mailboxCapacity = 500;
        private int defaultPasswordLength = 10;
        private String alternateEmail;
        private String companySuffix = "aeycompany.com";

        //constructor to receive the fist name and last name
        public Email(String fistName, String lastName) {
            this.firstName = fistName;
            this.lastName = lastName;


            //call a method asking for the department
            this.department = setDepartament();


            //call a method that returns a random password
            this.password = randomPassword(defaultPasswordLength);
            System.out.println("Your password is  : " + this.password);

            //combine elements to generate email
            email = fistName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;


        }

        //ask for the department
        private String setDepartament() {
            System.out.print("New worker" + firstName + ".Department Codes\n1 for Sales\n2 for Develeopment\n3 Accounting\n0 for none\nEnter departament code: ");
            Scanner in = new Scanner(System.in);
            int depChoise = in.nextInt();
            if (depChoise == 1) {
                return "sales";
            } else if (depChoise == 2) {
                return "dev";
            } else if (depChoise == 3) {
                return "acct";
            } else {
                return "";
            }
        }

        //generate a random password
        private String randomPassword(int length) {
            String passwordSet = "ABCDEFGHIJKLMNOPRTUWXYZ0123456789!@#$%";
            char[] password = new char[length];
            for (int i = 0; i < length; i++) {
                int rand = (int) (Math.random() * passwordSet.length());
                password[i] = passwordSet.charAt(rand);

            }
            return new String(password);
        }

        //set mailbox capacity
        public void setMailCapacity(int capacity) {
            this.mailboxCapacity = capacity;

        }//set mailbox capacity

        public void setAlternateEmail(String altEmail) {
            this.alternateEmail = altEmail;


        }//change password

        public void changePassword(String password) {
            this.password = password;

        }

        public int getMailboxCapacity() {
            return mailboxCapacity;
        }

        public String getAlternateEmail() {
            return alternateEmail;
        }

        public String getPassword() {
            return password;
        }

        public String showInfo() {
            return "Display Name: " + firstName + " " + lastName +
                    "\nCompany Email: " + email +
                    "\nMailbox Capacity:  " + mailboxCapacity + "mb";
        }

    }
