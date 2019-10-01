package assignment1;
public class q8{
  public static void main(String[] args) {

    int[] x={1,2,2,3,4,5,5,6,6,7};

    int length=x.length;
    int count=1;
    int i=0;

    System.out.println(" unique values"+"\t\t\t"+"times of occurrence");

    for(i=0;i<length-1;i++) {
      if(x[i]==x[i+1]){
        count++;

      }
      else{
        System.out.println("\t"+x[i]+"\t\t\t\t"+count);
        count=1;
      }

    }

    System.out.println("\t"+x[i]+"\t\t\t\t"+count);

    }
}

