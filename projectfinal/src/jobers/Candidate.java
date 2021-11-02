package jobers;

public class Candidate implements candidate2 {
    int years;
    public Candidate(int years){
        this.years = years;
    }
    public Candidate(){
        this.years = 0;
    }
    public int yearsexp() {
        years += 1;
        return years;
    }
}
