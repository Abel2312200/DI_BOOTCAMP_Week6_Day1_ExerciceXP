public class Circle {

    // class attributes
    private double radius;
    private String color;

    // class methods

    /*
    * It's the first constructor of the class
    * @param : empty
    * @returns : void
    **/
    public Circle(){
        radius = 1.0;
        color  = "red";
    }

    /*
    * It's the second constructor of the class
    * @param :
    *   -radius : double
    * @returns : void
    * */
    public Circle(double radius){
        this.radius = radius;
        color = "red";
    }

    /*
     * It's the second constructor of the class
     * @param :
     *   -radius : double
     *   -color : String
     * @returns : void
     * */
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    /*
    * This method returns the value of the radius
    * @param : empty
    * @returns : double
    * */
    public double getRadius() {
        return radius;
    }

    /*
     * This method sets the value of the radius
     * @param :
     *  - radius : double
     * @returns : void
     * */
    public void setRadius(double radius){
        this.radius = radius;
    }

    /*
     * This method sets the value of the radius
     * @param :
     *  - color : String
     * @returns : void
     * */
    public void setRadius(String color){
        this.color = color;
    }

    /*
     * This method returns the value of the radius
     * @param : empty
     * @returns : double
     * */
    public String getColor() {
        return color;
    }

    /*
    * convert an instance in String
    * @param : empty
    * @returns : String
    * */
    public String toString() {
        return super.toString();
    }

    /*
    *
    * @param : empty
    * @returns : double
    * */
    public double getArea(){
        return (radius * radius * Math.PI);
    }
}
