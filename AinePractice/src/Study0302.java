public class Study0302{
    private String ano;
    private String owner;
    private int balance;
    public Study0302(String ano, String owner, int balnace) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balnace;
    }
    
    
    @Override
    public String toString() {
        return ano +"\t"+ owner +"\t"+ balance;
    }



    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getBalnace() {
        return balance;
    }
    public void setBalnace(int balnace) {
        this.balance = balnace;
    }
}