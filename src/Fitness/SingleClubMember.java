package Fitness;

public class SingleClubMember extends Member {
    private int club; // клуб

    public SingleClubMember(char memberType, int memberID, String name, double fees, int club) {
        super(memberType, memberID, name, fees);
        this.club = club;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
