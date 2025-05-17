interface hello{  
void run();  
}  
class bye implements hello{  
  public void run(){System.out.println("polymorphism example");}  
}  
class Main extends bye implements hello{  
  public void run(){System.out.println("polymorphism example with iterface");}  
  public static void main(String args[]){  
    bye b = new Main();
    b.run();  
  }  
}  
