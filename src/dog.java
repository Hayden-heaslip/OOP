public class dog implements Animal
{
    dog(){
        System.out.println("in the dog constructor without a parameter");
    }
    dog(String cowpoke){
        System.out.println("in the dog constructor that has a parameter");
    }
    @Override
    public void makeSound() {
        System.out.println("bark");
    }
    public void makeSound(String speak) {
        System.out.println(speak);
    }
    @Override
    public void eat() {
        System.out.println("i want to eat a bone *chomp*");
    }

}
