import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrade {

        public  static  void main(String[] args){
            ArrayList<Integer> grades = new ArrayList<>();
            Integer gradeCount = 0;
            Scanner scanner = new Scanner(System.in);

            while (gradeCount < 5){
                System.out.println("Enter grade");
                var newGrade = scanner.nextInt();

                // adding the new Grade to the grades list
                grades.add(newGrade );
                if(grades.size() ==  5){


                    break;
                }else {
                    continue;
                }


            }


        }
        void printAverage(ArrayList<Integer> list){

            var average = list.

        }

}
