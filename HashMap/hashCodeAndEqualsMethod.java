import java.util.HashMap;
import java.util.Objects;

public class hashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Student, String> map=new HashMap<>();
        Student S1 = new Student("Ram", 1);
        Student S2 = new Student("Shyam", 2); 
        Student S3 = new Student("Ram", 1); 
        map.put(S1,"Engineer"); // hashcode ---> index of bucket array
        map.put(S2, "Doctor"); // hashcode ---> index of bucket array
        map.put(S3, "Manager"); // hashcode ---> index of bucket array----->equals----> replace

        System.out.println("Hashmap.size(): " + map.size());//3
        System.out.println("Value for S1 : "+ map.get(S1));// Engineer
        System.out.println("Value for S3 : "+ map.get(S3));// Manager
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass()!=obj.getClass()){// 2 alag alag class k instance ko check kra rhe h
            return false;
        }
        Student other= (Student) obj;// student me caste kiya h vo obj jo yha passed h
        return id=other.getId() && Object.equals(name,other.getName());
        //if jo id h current instance ki vo other ki id se match kar rha h  and 
        // name ek String h and to avoid null pointer exception hmne Objects classka use 
        //kiya h jo ek utility class h and will check if both are equal
        // ab agar ye dono cheez equal h mtlb ye person equal h
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(name,id);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "id: "+id + "name : "+ name;
    }
    class Student{
        private int id;
        private String name;
        public Student(String name,int id){
            this.name=name;
            this.id=id;
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
    }    
}
