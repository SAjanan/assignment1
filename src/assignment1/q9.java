package assignment1;
public class q9{

  static int[] x={9,2,1,4,5,2,1,9,3,4};
  static int[] checkarray = new int[10];
  static int length=x.length;
  static int checkarray_length=checkarray.length;

  public static void main(String[] args) {

    int count;
    int checkarray_count=0;

    System.out.println(" unique values"+"\t\t\t"+"times of occurrence");

    for (int i=0;i<length ;i++ ){
      count=1;
        if(!is_exist(x[i])){
          for (int j=i+1;j<length ;j++) {
            if (x[i]==x[j]) {
              count++;
            }
          }
          checkarray[checkarray_count]=x[i];
          checkarray_count++;

          System.out.println("\t"+x[i]+"\t\t\t\t"+count);
        }
    }
  }
  public static boolean is_exist(int element){
    for (int i=0;i<checkarray_length ;i++ ) {
      if (element==checkarray[i]) {
        return true;
      }
    }
    return false;
  }
}