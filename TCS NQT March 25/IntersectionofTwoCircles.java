import java.util.Scanner;
class IntersectionofTwoCircles{
static long IntersectionArea(double x1, double y1, double r1, double x2, double y2, double r2){
double d=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

if(d>=(r1+r2)){
return 0;
}

if(d<=(Math.abs(r1-r2))){
double minradius=Math.min(r1,r2);
return (long) Math.floor(3.14*minradius*minradius);
}

double angle1=2*Math.acos((r1*r1+d*d-r2*r2)/(2*r1*d));
double angle2=2*Math.acos((r2*r2+d*d-r1*r1)/(2*r2*d));

double area1=(0.5*r1*r1*(angle1-Math.sin(angle1)));
double area2=(0.5*r2*r2*(angle2-Math.sin(angle2)));

return (long) Math.floor(area1+area2);
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter x1 value: ");
int x1=s.nextInt();
System.out.print("\nEnter y1 value: ");
int y1=s.nextInt();
System.out.print("\nEnter r1 value: ");
int r1=s.nextInt();
System.out.print("\nEnter x2 value: ");
int x2=s.nextInt();
System.out.print("\nEnter y2 value: ");
int y2=s.nextInt();
System.out.print("\nEnter r2 value: ");
int r2=s.nextInt();
System.out.println("The intersecting area equals "+IntersectionArea(x1,y1,r1,x2,y2,r2));
s.close();
}
}