package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Doctor doctor = new Doctor(1,"Asan","Tom");
        Patient patient= new Patient(1,"Damir","Amanov");

        patient.setDoctor(doctor);

        doctor.doTherapy(Therapy.MEDICINE, patient);

        patient.print();







    }
}

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        Administrator administrator=new Administrator("adm","adm123");
//        Doctor doctor=new Doctor("doctor","doc123");
//
//        System.out.println("Welcome to hospital!");
//        System.out.println("What is your postion"+"\n"+ "1.Admin"+"\n"+"2.Doctor");
//
////        System.out.println("Choose your position");
//        int position=sc.nextInt();
//
//        int check = 0;
//
//
//        if (position==1){
//            System.out.println("Enter your login");
//            String loginA= sc.next();
//            System.out.println("Enter your password");
//            String passwordA= sc.next();
//
//
//            if (loginA.equals(administrator.getLogin()) && passwordA.equals(administrator.getPassword())){
//
//                System.out.println("Welcome to administator system");
//                System.out.println("Assign a doctor to the patient");
//                Patient patient=new Patient();
//                patient.purporse();
//
//                ArrayList<Patient> patients=new ArrayList<>();
//                patients.add(new Patient(1,"Tom"));
//                patients.add(new Patient(2,"Sara"));
//                patients.add(new Patient(3,"Lara"));
//                patients.add(new Patient(4,"Flora"));
//                patients.add(new Patient(5,"Dora"));
//
//
//
//
////
////                for (Patient listP:patients){
////                    System.out.println ("id"+"\t"+listP.id+"\t"+"Fname"+"\t"+listP.name);
////
////                }
//            }
//
//            else if  (loginA.equals(administrator.getLogin()) || passwordA.equals(administrator.getPassword())){
//                System.out.println("you entered your password or login incorrectly");
//
//            }
//            else{
//                System.out.println("We haven't this user");
//
//                while (check < 3) {
//                    System.out.println("Enter your login");
//                    loginA= sc.next();
//                    System.out.println("Enter your password");
//                    passwordA= sc.next();
//                    check++;
//
//                    if (loginA.equals(administrator.getLogin()) && passwordA.equals(administrator.getPassword())){
//
//
//
//                        break;
//                    }
//                }
//
//            }
//        }
//        else if(position==2){
//            System.out.println("Enter your login");
//            String loginD= sc.next();
//            System.out.println("Enter your password");
//            String passwordD= sc.next();
//
//            if (loginD.equals(doctor.getLogin()) && passwordD.equals(doctor.getPassword())){
//                System.out.println("Welcome to doctor system");
//
//            }
//
//            else if  (loginD.equals(doctor.getLogin()) || passwordD.equals(doctor.getPassword())){
//                System.out.println("you entered your password or login incorrectly");
//
//            }
//            else{
//                System.out.println("We haven't this user");
//                check++;
//            }
//
//        }
//        else{
//            System.out.println("We haven't this position");
//        }
//
//
//	// write your code here
//    }}

