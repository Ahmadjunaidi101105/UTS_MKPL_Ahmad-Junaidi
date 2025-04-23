import java.util.Date;

public class LibraryMemberBuilder {
    private final PersonalInfo personalInfo;
    private final String memberId;
    private Date joinDate = new Date();
    private MembershipLevel membershipLevel = MembershipLevel.BASIC;
    private boolean isActive = true;
    private int borrowedBooksCount = 0;
    private int lateReturnsCount = 0;
    private int fineAmount = 0;
    private int loyaltyPoints = 0;
    private String referralCode = "";
    private boolean isNewsletterSubscribed = false;

    public LibraryMemberBuilder(PersonalInfo personalInfo, String memberId) {
        if (personalInfo == null) throw new IllegalArgumentException("PersonalInfo tidak boleh null");
        if (memberId == null || memberId.isEmpty()) throw new IllegalArgumentException("Member ID tidak boleh kosong");

        this.personalInfo = personalInfo;
        this.memberId = memberId;
    }

    public LibraryMemberBuilder joinDate(Date joinDate) {
        if (joinDate == null) throw new IllegalArgumentException("Join date tidak boleh null");
        this.joinDate = new Date(joinDate.getTime());
        return this;
    }

    public LibraryMemberBuilder membershipLevel(MembershipLevel level) {
        if (level == null) throw new IllegalArgumentException("Membership level tidak boleh null");
        this.membershipLevel = level;
        return this;
    }

    public LibraryMemberBuilder isActive(boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public LibraryMemberBuilder borrowedBooksCount(int count) {
        if (count < 0) throw new IllegalArgumentException("Jumlah buku tidak boleh negatif");
        this.borrowedBooksCount = count;
        return this;
    }

    public LibraryMemberBuilder lateReturnsCount(int count) {
        if (count < 0) throw new IllegalArgumentException("Jumlah keterlambatan tidak boleh negatif");
        this.lateReturnsCount = count;
        return this;
    }

    public LibraryMemberBuilder fineAmount(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Denda tidak boleh negatif");
        this.fineAmount = amount;
        return this;
    }

    public LibraryMemberBuilder loyaltyPoints(int points) {
        if (points < 0) throw new IllegalArgumentException("Poin loyalitas tidak boleh negatif");
        this.loyaltyPoints = points;
        return this;
    }

    public LibraryMemberBuilder referralCode(String code) {
        this.referralCode = code == null ? "" : code;
        return this;
    }

    public LibraryMemberBuilder isNewsletterSubscribed(boolean subscribed) {
        this.isNewsletterSubscribed = subscribed;
        return this;
    }

    public LibraryMember build() {
        return new LibraryMember(
            personalInfo,
            memberId,
            joinDate,
            membershipLevel,
            isActive,
            borrowedBooksCount,
            lateReturnsCount,
            fineAmount,
            loyaltyPoints,
            referralCode,
            isNewsletterSubscribed
        );
    }
}
