package manta.ex4;

public class MyPoint {
    int x,y;
    public MyPoint(){
        x=0;y=0;
    }
    public MyPoint(int x, int y){
        this.x=x;this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
       return "(" +this.x+ "," +this.y+ ")";
    }
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(MyPoint another){
        int xDiff = this.x - another.x;
        int yDiff = this.y -another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

}


