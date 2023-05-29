package logicalproblems;

public class Saif {
    public static void main(String[] args) {
        int triangle[]={0,5,10};
        int perimeter=0;
        boolean isPerimeterValid=true;

        for (int i=0;i<triangle.length;i++){
                perimeter+=triangle[i];
                if (triangle[i]<=0){
                    isPerimeterValid=false;
                }
        }

        if (isPerimeterValid){
            System.out.println("Perimeter ="+ perimeter);
        }
        else {
            System.out.println("Perimeter not possible");
        }




    }

}
