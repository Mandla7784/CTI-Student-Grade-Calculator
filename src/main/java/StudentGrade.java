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
                    var average = sumList(grades) / grades.size();
                    System.out.println("Average is :" +average);
                    break;
                }else {
                    continue;
                }
            }
        }
    /**
     * Method to calculate the sum of the list
     * @param list
     * @return
     */
    static  int sumList(ArrayList<Integer> list){
            int sum = 0;
            for(int i= 0; i < list.size() ; i ++){
                sum += list.get(i);

            }
            return  sum;
        }
}
