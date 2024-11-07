package Java_P.Getter_Setter;
public class Get_Set {
    public static class Person {
        private String name;
        public Person(String name)
        {
            this.name=name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            if(name!=null && name.length()>2)
                this.name = name;
        }
    }
}
