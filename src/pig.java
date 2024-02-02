public class pig implements Animal {
    pig(){
        System.out.println("in the pig constructor without a parameter");
    }
    pig(String cowpoke){
        System.out.println("in the pig constructor that has a parameter");
    }
    @Override
    public void makeSound() {
        System.out.println("oink");
    }

    @Override
    public void eat() {
        System.out.println("i want to eaat apple *CHOMP*");
    }
    public void eat(String thing) {
        System.out.println("I want to eaat " + thing + "*CHOMP*");
    }
}
