public class Dog
{
    //Instance Variables
    private String name;
    private int age;
    private boolean goodDog;

    //Default Constructor
    public Dog(){
        name = "None";
        age = 0;
        goodDog = true;
    }

//    public Dog(){
    // We could even be more efficient with our constructors
//        this("None", 0, true);
//    }


    //Parameter Constructors
    public Dog(String n, int a, boolean g){
        name = n;
        age = a;
        goodDog = g;
    }

    public Dog(String n, int a){
        name = n;
        age = a;
        goodDog = true;
    }

    //Accessors
    public String getName()
    { return name; }

    public int getAge()
    { return age; }

    public boolean getGoodDog()
    { return goodDog; }
    //Mutators
    public void setName(String n)
    { name = n; }

    public void setAge(int a)
    { age = a; }

    public void setGoodDog(boolean b)
    { goodDog = b; }

    //toString
    public String toString()
    {
        return name + " " + age + ". Is " + name + " a good dog? " + goodDog;
    }
    //equals
//    public boolean equals(Dog other)
//    {
//        String otherName = other.getName();
//        int otherAge = other.getAge();
//        boolean otherGoodDog = other.getGoodDog();
//
//        if(name.equals(otherName) && age == otherAge && goodDog == otherGoodDog)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }

//    public boolean equals(Dog other)
//    {
//        if(this.name.equals(other.getName()) && this.age == other.getAge() && this.goodDog == other.getGoodDog())
//        {
//            return true;
//        }
//        return false;
//    }


    //Other Methods
    public void speak(){
        System.out.println("Woof Woof!");
    }

    public void haveBirthday(){
        age++;
    }
}
