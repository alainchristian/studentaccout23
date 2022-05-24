public class Student {
    private int stId;
    private String stNames;
    private String stPhone;

    public Student(int stId, String stNames, String stPhone) {
        this.stId = stId;
        this.stNames = stNames;
        this.stPhone = stPhone;
    }

    public int getStId() {
        return stId;
    }
    public String getStNames() {
        return stNames;
    }
    public String getStPhone() {
        return stPhone;
    }

    @Override
    public String toString() {
        return stId+"\t"+stNames+"\t"+stPhone;
    }
}
