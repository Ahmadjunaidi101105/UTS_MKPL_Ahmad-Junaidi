import java.util.Date;

public final class LibraryMember {
    private final PersonalInfo personalInfo;
    private final String memberId;
    private final Date joinDate;
    private final MembershipLevel membershipLevel;
    private final boolean isActive;
    private final int borrowedBooksCount;
    private final int lateReturnsCount;
    private final int fineAmount;
    private final int loyaltyPoints;
    private final String referralCode;
    private final boolean isNewsletterSubscribed;

    // Package-private constructor, hanya bisa diakses oleh Builder
    LibraryMember(PersonalInfo personalInfo, String memberId, Date joinDate, 
                MembershipLevel membershipLevel, boolean isActive, int borrowedBooksCount,
                int lateReturnsCount, int fineAmount, int loyaltyPoints,
                String referralCode, boolean isNewsletterSubscribed) {
        this.personalInfo = personalInfo;
        this.memberId = memberId;
        this.joinDate = new Date(joinDate.getTime()); // Defensive copy
        this.membershipLevel = membershipLevel;
        this.isActive = isActive;
        this.borrowedBooksCount = borrowedBooksCount;
        this.lateReturnsCount = lateReturnsCount;
        this.fineAmount = fineAmount;
        this.loyaltyPoints = loyaltyPoints;
        this.referralCode = referralCode;
        this.isNewsletterSubscribed = isNewsletterSubscribed;
    }

    // Getter methods
    public PersonalInfo getPersonalInfo() { return personalInfo; }
    public String getMemberId() { return memberId; }
    public Date getJoinDate() { return new Date(joinDate.getTime()); } // Defensive copy
    public MembershipLevel getMembershipLevel() { return membershipLevel; }
    public boolean isActive() { return isActive; }
    public int getBorrowedBooksCount() { return borrowedBooksCount; }
    public int getLateReturnsCount() { return lateReturnsCount; }
    public int getFineAmount() { return fineAmount; }
    public int getLoyaltyPoints() { return loyaltyPoints; }
    public String getReferralCode() { return referralCode; }
    public boolean isNewsletterSubscribed() { return isNewsletterSubscribed; }
}