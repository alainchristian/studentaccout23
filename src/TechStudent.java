public class TechStudent extends Student{
    private static final int stFee =400;

    public TechStudent(int stId, String stNames, String stPhone) {
        super(stId, stNames, stPhone);
    }
    public String stDept(){
        return "Tech";
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+stFee+"\t"+stDept();
    }
}
