class Box{
    double l,b,h;
    Box(double length,double breadth,double height){
        l=length;
        b=breadth;
        h=height;

    }
    double vol(){
        return (l*b*h);
    }
}
public class DemoBox{
    public static void main(String arg[]){
        Box b1=new Box(5,5,5);
        Box b2=new Box(6,6,6);
        System.out.println("The volume of the first box is"+b1.vol());
        System.out.println("The volume of the second box is "+b2.vol());
    }
}