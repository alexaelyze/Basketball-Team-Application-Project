package Sports;

/**
 * 
 * Alexandra Elyze Villar
 * FOPI01 - FA1.1:LE#1
 * 
 */
 

import java.util.*;

 

public class Test {

 

       public static void main(String[] args) {
               
               Scanner sc = new Scanner(System.in);
               
               Team basketBall = new Team("BasketBall", 5, 18, 21);
               Member[] m = new Member[basketBall.getMaxMember()];
               
               int count = 0;
               
               int choice = 0;
               
               while(choice != 3) {
                       System.out.println("\nBasketball Team Application");
                       System.out.println("------------");
                       System.out.println("[1] Apply in the team");
                       System.out.println("[2] Show Applicants");
                       System.out.println("[3] Exit");
                       System.out.println("------------");
                       System.out.print("Choice: ");
                       choice = sc.nextInt();
                       
                       if(choice == 1) {
                               if(basketBall.getMemberCnt() == 5) {
                                       System.out.println("Basketball team is no longer accepting applicants.");
                                       continue;
                               }
                               System.out.print("Enter name:");
                               String name = sc.next();
                               System.out.println("Enter age:");
                               int age = sc.nextInt();
                               if(age < basketBall.getMinAge() || age > basketBall.getMaxAge()) {
                                       System.out.println("Sorry, you are not qualified!");
                               }else {
                                       System.out.println("Welcome to the Basketball Team!");
                                       Member member = new Member(name, age);
                                       m[count++] = member;
                                       basketBall.addMember(member);
                               }
                       }
                       else if(choice == 2) {
                               for (Member member : m) {
                                       System.out.println(member.getName()+" , "+ member.getAge());

                                 }
                       }
                       
               }
               System.out.println("Thank You!");

       }

}