public class Person {



    private String name;


    //getter
    public String getName(){
//TODO: return the person's name
        return name;
    }

//setter
    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Someone told me your name is %s. Hello from me, your loyal Macbook!", name);
    }

    public Person(){} //No arg constructor

    public Person(String name) {
        this.name = name;
    }
}//class ending bracket
