public class Person {



    private String name;


//setter
    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Someone told me your name is %s. Hello from me, your loyal Macbook!", name);
    }


//getter
    public String getName(){
//TODO: return the person's name
        return name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Frances");
        person.sayHello();



    }




}//class ending bracket
