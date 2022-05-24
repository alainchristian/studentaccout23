public class TourStudent extends Student{
    private static final int stFee=350;

    public TourStudent(int stId, String stNames, String stPhone) {
        super(stId, stNames, stPhone);
    }
    public String stDept(){
        return "Tourism";
    }
    @Override
    public String toString() {
        return super.toString()+"\t"+stFee+"\t"+totals()+"\t"+stDept();
    }
    public int totals(){
        return stFee*3;
    }
}
