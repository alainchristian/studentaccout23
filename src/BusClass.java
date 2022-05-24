public class BusClass extends Student{
    private static final int stFee=300;
    public BusClass(int stId, String stNames, String stPhone) {
        super(stId, stNames, stPhone);
    }
    public String stDept(){
        return "Business";
    }
    @Override
    public String toString() {
        return super.toString()+"\t"+stFee+"\t"+totals()+"\t"+stDept();
    }
    public int totals(){
        return stFee*3;
    }
}
