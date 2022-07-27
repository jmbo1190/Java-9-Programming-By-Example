public class HelloWorld {

    public static void main(String args[]){
        String name = "World";
        if (args.length >= 1) {
            name = args[0];
        }
        System.out.println("Hello, "+name+"!");
    }

}