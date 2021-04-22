package homeWorkWeek7;

/*Wall Area
Write a class with the name Wall. The class needs two fields (instance variables)
with name width and height of type double.
The class needs to have two constructors. The first constructor does not have any parameters
(no-arg  constructor). The second constructor has parameters width and height of type double and
it needs to  initialize the fields. In case the width is less than 0 it needs to set the width field
value to 0, in case the  height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
* Method named getWidth without any parameters, it needs to return the value of width field.
* Method named getHeight without any parameters, it needs to return the value of height field.
* Method named setWidth with one parameter of type double, it needs to set the value of the width field.
If the parameter is less than 0 it needs to set the width field value to 0.
* Method named setHeight with one parameter of type double, it needs to set the value of the  height field.
If the parameter is less than 0 it needs to set the height field value to 0.
* Method named getArea without any parameters, it needs to return the area of the
* created with help of Group
 */

public class WallArea {
    double width;
    double height;


    // constructor without parameter
    public WallArea() {

    }

    // constructor with two parameter
    public WallArea(double width, double height) {
        if (width < 0) {
            width = 0;
        } else if (height < 0) {
            height = 0;
        }
        this.width=width;
        this.height=height;


    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {


        return this.height;
    }

    public double setWidht(double width) {
        if (width < 0) {
            width = 0;
        }
        this .width=width;
        return this.width;
    }
    public double setHight(double height) {
        if (height < 0) {
            height = 0;

        }
        this.height=height;
        return this.height;
    }
    public double getArea(){
        final double area =this.width*this.height;
        return area;


    }
}



