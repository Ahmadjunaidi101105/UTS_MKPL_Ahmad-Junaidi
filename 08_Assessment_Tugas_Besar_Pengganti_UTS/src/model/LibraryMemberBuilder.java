import java.util.Date;

public class LibraryMemberBuilder {
    private final PersonalInfo personalInfo;
    private final String memberId;
    private Date joinDate;
    private MembershipLevel membershipLevel = MembershipLevel.BASIC;
    private boolean isActive = true;
    private int borrowedBooksCount = 0;
    private int lateReturnsCount = 0;
    private int fineAmount = 0;
    private int loyaltyPoints = 0;
    private String referralCode = "";
    private boolean isNewsletterSubscribed = false;

    public LibraryMemberBuilder(PersonalInfo personalInfo, String memberId) {
        if (personalInfo == null) {
            throw new IllegalArgumentException("PersonalInfo tidak boleh null");
        }
        if (memberId == null || memberId.isEmpty()) {
            throw new IllegalArgumentException("Member ID tidak boleh kosong");
        }
        this.personalInfo = personalInfo;
        this.memberId = memberId;
        this.joinDate = new Date();
    }

    public LibraryMemberBuilder joinDate(Date joinDate) {
        if (joinDate == null) {
            throw new IllegalArgumentException("Join date tidak boleh null");
        }
        this.joinDate = new Date(joinDate.getTime());
        return this;
    }

    public LibraryMemberBuilder membershipLevel(MembershipLevel level) {
        if (level == null) {
            throw new IllegalArgumentException("Membership level tidak boleh null");
        }
        this.membershipLevel = level;
        return this;
    }

    public LibraryMemberBuilder isActive(boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    // Method chaining untuk atribut lainnya...
    public LibraryMemberBuilder borrowedBooksCount(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Borrowed books count tidak boleh negatif");
        }
        this.borrowedBooksCount = count;
        return this;
    }

    // Method chaining untuk atribut lainnya serupa...

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