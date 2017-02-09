/**
 * An outer class can access all private and public data field 
 * and methods of inner class.
 * Inner class also access private and public data and methods of outer class if inner class non-static.
*/
package staticinnerclass;

/**
 *
 * @author Amine
 */
public class Karpuz {

    public String color;
    public String mensei;
    private String taste;
    private static int count=0;
    
    public Karpuz(String color, String mensei) {
        this.color = color;
        this.mensei = mensei;
        setTaste("Tatli");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMensei() {
        return mensei;
    }

    public void setMensei(String mensei) {
        this.mensei = mensei;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    private void privateMethod(){
        System.out.print("This is a private method of outer class.\n");
    }
    
    private static void staticMethod(){
        System.out.print("This is a private STATIC method of outer class.\n");
        System.out.printf("Count: %s \n",count);
        ++count;
    }
    

    public void callStaticClass(){
        Su a= new Su("Suuu");
        a.methodOfInner();
        System.out.printf("%s\n",a.name);
        
    }
    
    public static class Su {

        
        private String name;
        
        public Su(String name) {
            this.name = name;
        }
        private  void methodOfInner() {
            Karpuz a = new Karpuz("Red", "Diyarbakır");
            System.out.printf("%s---%s----%s\n",a.color, a.mensei, a.taste);
            
            staticMethod();
            System.out.printf("Inner class can access static membs of outer:  %d\n",count);
            //Below prints when Su class made non-static
            /*************WORKS-FOR-NON-STATIC CLAS/******************************/
//            System.out.printf("%s %s \n",taste, color);
//            System.out.printf("%s %s \n",getTaste(), getColor());
//            privateMethod();
            /*********************************************************************/
        }
    }

}
