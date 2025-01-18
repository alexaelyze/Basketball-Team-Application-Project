package Sports;

/**
 * 
 * Alexandra Elyze Villar
 * FOPI01 - FA1.1:LE#1
 * 
 */
 

public class Team {
       
       private final String name;
       private final Member[] members;
       private int memberCnt;
       private int maxMember;
       private int minAge;
       private int maxAge;
       
       
       public Team(String name, int maxMember, int minAge, int maxAge) {
               
               this.name = name;
               this.maxMember = maxMember;
               this.minAge = minAge;
               this.maxAge = maxAge;
               
               members = new Member[this.maxMember];
               
               this.memberCnt = 0;
       }
       
       
       public void addMember(Member m) {
               members[this.memberCnt] = m;
               this.memberCnt++;
       }
       
       public boolean checkQualification(Member m) {
               if(m.getAge() < this.minAge || m.getAge()>this.maxAge) {
                       return false;
               }else {
                       return true;
               }
       }


       public int getMaxMember() {
               return maxMember;
       }


       public void setMaxMember(int maxMember) {
               this.maxMember = maxMember;
       }


       public int getMinAge() {
               return minAge;
       }


       public void setMinAge(int minAge) {
               this.minAge = minAge;
       }


       public int getMaxAge() {
               return maxAge;
       }


       public void setMaxAge(int maxAge) {
               this.maxAge = maxAge;
       }


       public int getMemberCnt() {
               return memberCnt;
       }


       public void setMemberCnt(int memberCnt) {
               this.memberCnt = memberCnt;
       }

 

}