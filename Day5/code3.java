class Animal{
    void dog(){
        System.out.println("i am dog i am an animal");
    }
}
class Charater extends Animal{
    void parts(){
        System.out.println("i have tail and i am friendly with everyone ");
    }
}
class Features extends Animal{
    void sound(){
        System.out.println("i call u by sounding baw baw");
    }
}

class code3{
    public static void main(String[] args){
Animal C1=new Animal();
C1.dog();
Charater C2=new Charater();
C2.parts();
Features C3=new Features();
C3.sound();

    }
}