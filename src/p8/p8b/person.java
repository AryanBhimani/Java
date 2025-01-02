public class person {
    int person_id,age;
    String name;
    person(int id,int a,String s){
        person_id=id;
        age=a;
        name=s;
    }
    void agegroup()
    {
        if(age<8){
            System.out.println("child");
        }
        else if(age>8 & age<20){
            System.out.println("teenagae");
        }
        else if(age>=20 & age<=40){
            System.out.println("young");
        }
        else if(age>40){
            System.out.println("old");
        }
    }
    public static void main(String[] args) {
        person p=new person(91,19,"aryan");
        p.agegroup();
        System.out.println("id is"+p.person_id);
        System.out.println("name is"+p.name);
    }
}
