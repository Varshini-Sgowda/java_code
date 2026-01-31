class Animal{
void Horse(){
    System.out.println("the horse is black");
}
    } 
class elephant extends Animal{
    void region(){
        System.out.println(" The Elephant is from kenya the masimara");
    }
}
class code1{
    public static void main(String[] args){
        Animal A1=new Animal();
        A1.Horse();
        elephant A2=new elephant();
        A2.region();
        A2.Horse();
    }
}
