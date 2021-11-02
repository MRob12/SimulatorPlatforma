package jobers;

import java.util.Random;
public class Employee extends EployerClass{
    public Employee(){

    }
    public Employee(String domain, int sallary, boolean parttime, boolean fulltime){
        _parttime = parttime;
        _fulltime = fulltime;
        _domain = domain;
        _sallary = sallary;
    }
    public Employee(String domainw, int sallaryd){
        _domain = domainw;
        _sallary = sallaryd;
        _fulltime = false;
        _parttime = false;
    }
    public int candidatsquant(){
        Random rand = new Random();
        int rand_int1 = rand.nextInt(70);
        return rand_int1;
    }
}
