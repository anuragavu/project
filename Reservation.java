import java.util.Scanner;
class Airplane_Reservation{
    public static void main(String args[]){
        boolean Seat[];
        Seat = new boolean[10];
        int i=0
        int first_class=0;
        int economic_class=5;
        int x,ch;
        Scanner inp = new Scanner(System.in);
        do{
        System.out.println("Enter 1.for first class 2.for economic class");
        i=inp.nextInt();
        switch(i){
            case 1:
                if(first_class<=4){
                    Seat[first_class]=true;
                    first_class++;
                    System.out.println("first class,seat number:"+first_class);
                    }
                else{
                    System.out.println("no seats remaining.do you want to take seats in economic ?(yes:1,no:0)");
                    ch = inp.nextInt();
                        if(ch==1){
                        if(economic_class<=9){
                            Seat[economic_class]=true;
                            economic_class++;
                            System.out.println("economic class,seat number:"+economic_class);
                             }
                        else{
                            System.out.println("Next flight departures in 3 hours.");
                          }
                    }
                }
                break;
                case 2:
                    if(economic_class<=9){
                    Seat[economic_class]=true;
                    economic_class++;
                    System.out.println("economic class,seat number:"+economic_class);
                }
                else{
                    System.out.println("no seats remaining.do you want to take seats in first class ?(yes:1,no:0)");
                    ch = inp.nextInt();
                    if(ch==1){
                        if(first_class<=4){
                            Seat[first_class]=true;
                            first_class++;
                            System.out.println("first class,seat number:"+first_class);
                        }
                        else{
                            System.out.println("Next flight departures in 3 hours.");
                        }
                    }
                }
                break;
                    
        }
        System.out.println("do you want to continue (0 or 1) :");
        x=inp.nextInt();
            }
            while(x!=0);
}
}
