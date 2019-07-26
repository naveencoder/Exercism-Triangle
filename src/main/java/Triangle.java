import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

class Triangle {
    private Double side1;
    private Double side2;
    private Double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if ((side1 <= 0 || side2 <= 0) || side3 <= 0) {
            throw new TriangleException();
        }
        Boolean a=((side1+side2)>=side3)&&((side2+side3)>=side1);
        Boolean b=(side1+side3)>=side2;
        if (!(a && b))
        {
            throw new TriangleException();
        }
    }

    boolean isEquilateral() {
        if ((side1.equals(side2)) && (side2.equals(side3)))
            return true;
        else
            return false;

    }

    boolean isIsosceles() {
        if ((side1.equals(side2)) || (side2.equals(side3)) || (side3.equals(side1))) {
            return true;
        }
        else
            return false;
    }

    boolean isScalene() {
        if ((!side1.equals(side2)) && (!side2.equals(side3)) && (!side3.equals(side1)))
            return true;
        else
            return false;
    }

}
