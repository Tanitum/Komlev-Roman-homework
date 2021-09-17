package com.company;
public class Vector
{
    double x;
    double y;
    double z;
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    public Vector(double inputX, double inputY, double inputZ) {
        x = inputX;
        y = inputY;
        z = inputZ;
    }

    // Длина вектора. Корень из суммы квадратов
    double length(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector){
        return x*vector.x+y*vector.y+z*vector.z;
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        return new Vector(y*vector.z-z*vector.y,z*vector.x-x*vector.z,x*vector.y-y*vector.x);
    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        return this.scalarProduct(vector)/(this.length() * vector.length());
    }

    // Сумма двух векторов
    Vector add(Vector vector){
        return new Vector(x+vector.x,y+vector.y,z+vector.z);
    }

    // Разность двух векторов
    Vector subtract(Vector vector){
        return new Vector(x-vector.x,y-vector.y,z-vector.z);
    }

     @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
     @Override
    public boolean equals(Object vector) {
        Vector internal_vek = (Vector) vector;
        if (x==internal_vek.x && y==internal_vek.y && z==internal_vek.z){
            return true;}
        else{return false;}
    }
     @Override
    public int hashCode() {
        int X = (int) (x);
        int Y = (int) (y);
        int Z = (int) (z);
       return X * 100000000 + Y * 10000 + Z;
    }

}
