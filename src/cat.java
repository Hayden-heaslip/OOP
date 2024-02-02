public class cat implements Animal
{
    cat(){
        System.out.println("in the cat constructor without a parameter");
    }
    cat(String cowpoke){
        System.out.println("in the cat constructor that has a parameter");
    }
    @Override
    public void makeSound() {
        System.out.println("MEYAw");
    }

    @Override
    public void eat() {
        System.out.println("i want salmon *chomp*");
    }
    public void eat(String food) {
        System.out.println("i want to eat "+ food);
    }
}
