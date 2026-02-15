public class Pet {
    //Private data fields
private String name;
private String type;
private int age;

//public Constructor(s)
public Pet()
{
    this.type = "Animal";
    this.name = "Pet Name";
    this.age = 1;
}
public Pet(String newName, String newType, int newAge)
{
    setName(newName);
    setType(newType);
    setAge(newAge);
}

//public set or mutator method for every private data field (except if it is a secret)
public void setName(String newName)
{
    this.name = newName;
}
public void setType(String type)
{
    this.type = type;
}
public void setAge(int age)
{
    this.age = age;
}
//public get or accessor method for every private data field (except if it is a secret)
public String getName()
{
    return this.name;
}
public String getType()
{
    return this.type;
}
public int getAge()
{
    return this.age;
}

//speak method 
public String speak()
{
    if (type.equalsIgnoreCase("dog")){
        return "Woof";
    }
    else if (type.equalsIgnoreCase("cat")){
        return "Meow";
    }
    else {
        return "Noise";
    }
}
//public toString method that prints out all of the object state (meaning the data in the object instance that you will later instantiate in the main() method)
public String toString()
{
    String output = "Pet information:\n";
        output += "Type: " + this.type + "\n";
        output += "Name: " + this.name + "\n";
        output += "Sound: " + speak() + "\n";
        output += "Age:  " + this.age + "\n";
        return output;
}

}
