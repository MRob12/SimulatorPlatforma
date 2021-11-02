package jobers;

public class EployerClass {
    boolean _parttime;
    boolean _fulltime;
    public String _domain;
    int _sallary;
    int score = 0;
    public EployerClass(){

    }
    public EployerClass(String domain, int sallary, boolean parttime, boolean fulltime){
        _parttime = parttime;
        _fulltime = fulltime;
        _domain = domain;
        _sallary = sallary;
    }
   public EployerClass(String domainw, int sallaryd){
        _domain = domainw;
        _sallary = sallaryd;
       _fulltime = false;
       _parttime = false;
    }
    public String chances(){
        String chance;
        if(_fulltime == true){
            score = score + 10;
        }else if(_parttime == true){
            score = score + 5;
        }else{
            score = score + 15;
        }
        if(_sallary > 4000){
            score = score + 5;
        }else {
            score = score + 10;
        }
        if(_domain.equals("Engineering")){
            score = score + 10;
        }
        if(score > 30){
            return chance = "high";
        }else {
            return chance = "low";
        }

    }
    public String getDomain(){

        return _domain;
    }
}
