class Student{
        String name;
        int age;
        int marks;
        Student(){
        this.name="Varsha";
        this.age=00;
        this.marks=000;}
        Student(String name,int age,int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;}
        void details(){
            System.out.println("name = " + name + " age = " + age + " marks = " + marks);
            
        }}
      public class hw1{
            public static void main(String[] args){
          Student n1=new Student("Varsha",21,594);
Student n2=new Student("YYY",22,591);
n1.details();
n2.details(); 
        }
      }

