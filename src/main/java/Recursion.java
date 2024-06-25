

public class Recursion{

  private void methodThree(){
    System.out.println("Three");
  }

  private void methodTwo(){
    methodThree();
    System.out.println("Two");
  }

  public void callStackExampleMethodOne(){
    methodTwo();
    System.out.println("One");
  }

  public int factorial(int n){
    if(n==1){
      return 1;
    }
    return n*factorial(n-1);
  } 
  
}