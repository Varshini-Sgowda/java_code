 class Animal{
    void human(){
        System.out.println("hello");
    }
}
class Character extends Animal{
    Character(){
        super();
    }
        void features(){
        System.out.println("hi");
    }
}
class code5{
    public static void main(String[] args){
Character C1 = new Character();
C1.features();
C1.human();
    }
}