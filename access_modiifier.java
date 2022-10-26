class MainEmployee{
    private int id;
    private String name;
    public void setId(int i){
        this.id = i;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class access_modiifier {
    public static void main(String[] args) {
        MainEmployee emp1 = new MainEmployee();
        emp1.setId(1);
        emp1.setName("rajat");
        System.out.println(emp1.getId());
        System.out.println(emp1.getName());
    }
}
