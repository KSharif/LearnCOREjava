public class SuperKeywordEmeployee extends SuperKeyWordPerson{
    float salary;
    SuperKeywordEmeployee(int id, String name, float salary){
       //reusing the parameter from the parent constructor
        super(id, name);
        this.salary=salary;

    }

    void display (){
        System.out.println("id: "+id +"\n"+
                "name: "+ name +"\n"+ "salary: "+ salary);
    }
}
