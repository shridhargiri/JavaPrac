import javax.lang.model.util.ElementScanner6;

public class assign5 {
    public static void main(String args[])
    {
        int sub1, sub2 , sub3;
        String grade;
        sub1 = 30;
        sub2 = 70;
        sub3 = 40;
        float total = sub1 + sub2 + sub3;
        float temp = total / 300;
        float per = temp * 100;
        if(per >= 75)
        {
            grade = "A+";
            
        }
        else if(per >= 60)
        {
            grade = "A";
        }
        else if(per >= 50)
        {
            grade = "B";
        }
        else if(per >= 35)
        {
            grade = "C";
        }
        else
        {
            grade = "N/A";
        }
        if(grade == "N/A")
        {
            System.out.println("Fail!");
            System.out.println("Total marks obtained:" + total + " out of 300");
            System.out.println("Percentage: " + per);
        }
        else{
            System.out.println("Pass!");
            System.out.println("Grade: " + grade);
            System.out.println("Total marks obtained:" + total + " out of 300");
            System.out.println("Percentage: " + per);
        }
        
    }
}