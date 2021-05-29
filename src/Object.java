public class Object {

     private String name;
     private int year;
     private int exp;
     private int pass;

     public Object(String name, int year, int exp, int pass) {
          this.name = name;
          this.year = year;
          this.exp = exp;
          this.pass = pass;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getYear(int i) {
          return year;
     }

     public void setYear(int year) {
          this.year = year;
     }

     public int getExp() {
          return exp;
     }

     public void setExp(int exp) {
          this.exp = exp;
     }

     public int getPass() {
          return pass;
     }

     public void setPass(int pass) {
          this.pass = pass;
     }

     @Override
     public String toString() {
          return "Object{" +
                  "name='" + name + '\'' +
                  ", year=" + year +
                  ", exp=" + exp +
                  ", pass=" + pass +
                  '}';
     }
}
