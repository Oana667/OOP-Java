package Ex1;

public class CoffeTest {
    public static void main(String[] args) {
        CofeeMaker mk = new CofeeMaker();
        CofeeDrinker d = new CofeeDrinker();

        for(int i = 0;i<15;i++){
            Cofee c = mk.makeCofee();
            try {
                d.drinkCofee(c);
            } catch (TemperatureException e) {
                System.out.println("Exception:"+e.getMessage()+" temp="+e.getTemp());
            } catch (ConcentrationException e) {
                System.out.println("Exception:"+e.getMessage()+" conc="+e.getConc());
            }catch(MaxCofeeException e){
                System.out.println("Exception: " + e.getMessage()+ "maxcoffe="+ e.getCoffee());
            }
            finally{
                System.out.println("Throw the cofee cup.\n");
            }
        }
    }
}//.class

class CofeeMaker {
    Cofee makeCofee(){
        System.out.println("Make a coffe");
        int t = (int)(Math.random()*100);
        int c = (int)(Math.random()*100);
        int cpd=(int)(Math.random()*100);
        Cofee cofee = new Cofee(t,c,cpd);
        return cofee;
    }

}

class Cofee{
    private int temp;
    private int conc;
    private int coffeePerDay;

    Cofee(int t,int c,int cpd){temp = t;conc = c; coffeePerDay=cpd;}
    int getTemp(){return temp;}
    int getConc(){return conc;}
    int getCoffee(){return coffeePerDay;}
    public String toString(){return "[cofee temperature="+temp+":concentration="+conc+"]";}
}

class CofeeDrinker{
    void drinkCofee(Cofee c) throws TemperatureException, ConcentrationException,MaxCofeeException{
        if(c.getTemp()>60)
            throw new TemperatureException(c.getTemp(),"Cofee is to hot!");
        if(c.getConc()>50)
            throw new ConcentrationException(c.getConc(),"Cofee concentration to high!");
        System.out.println("Drink cofee:"+c);
        if(c.getCoffee()>80)
            throw  new MaxCofeeException(c.getCoffee(),"Maximum of coffees were made!");
    }
}//.class

class TemperatureException extends Exception{
    int t;
    public TemperatureException(int t,String msg) {
        super(msg);
        this.t = t;
    }

    int getTemp(){
        return t;
    }
}//.class

class ConcentrationException extends Exception {
    int c;

    public ConcentrationException(int c, String msg) {
        super(msg);
        this.c = c;
    }

    int getConc() {
        return c;
    }
}
    class MaxCofeeException extends Exception {
        int co;
        public MaxCofeeException(int co, String msg){
                super(msg);
                this.co=co;

    }
    int getCoffee(){
            return co;
    }

}