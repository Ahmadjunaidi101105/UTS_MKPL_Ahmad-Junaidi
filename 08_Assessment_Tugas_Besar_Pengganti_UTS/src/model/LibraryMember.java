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

    // Hanya bisa dibuat via Builder
    private LibraryMember(Builder builder) {
        this.personalInfo = builder.personalInfo;
        this.memberId = builder.memberId;
        this.joinDate = builder.joinDate;
        this.membershipLevel = builder.membershipLevel;
        this.isActive = builder.isActive;
        this.borrowedBooksCount = builder.borrowedBooksCount;
        this.lateReturnsCount = builder.lateReturnsCount;
        this.fineAmount = builder.fineAmount;
        this.loyaltyPoints = builder.loyaltyPoints;
        this.referralCode = builder.referralCode;
        this.isNewsletterSubscribed = builder.isNewsletterSubscribed;
    }

    // Getter methods (tanpa setter, karena immutable)
    public PersonalInfo getPersonalInfo() { return personalInfo; }
    public String getMemberId() { return memberId; }
    public Date getJoinDate() { return new Date(joinDate.getTime()); }
    public MembershipLevel getMembershipLevel() { return membershipLevel; }
    public boolean isActive() { return isActive; }
    public int getBorrowedBooksCount() { return borrowedBooksCount; }
    public int getLateReturnsCount() { return lateReturnsCount; }
    public int getFineAmount() { return fineAmount; }
    public int getLoyaltyPoints() { return loyaltyPoints; }
    public String getReferralCode() { return referralCode; }
    public boolean isNewsletterSubscribed() { return isNewsletterSubscribed; }

    // Builder Class
    public static class Builder {
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

        public Builder(PersonalInfo personalInfo, String memberId) {
            this.personalInfo = personalInfo;
            this.memberId = memberId;
            this.joinDate = new Date(); // Default: tanggal sekarang
        }

        public Builder joinDate(Date joinDate) {
            this.joinDate = new Date(joinDate.getTime());
            return this;
        }

        public Builder membershipLevel(MembershipLevel level) {
            this.membershipLevel = level;
            return this;
        }

        // Method chaining untuk atribut lainnya...
        public Builder isActive(boolean isActive) { /* ... */ return this; }
        public Builder borrowedBooksCount(int count) { /* ... */ return this; }

        public LibraryMember build() {
            // Validasi sebelum membuat objek
            if (memberId == null || memberId.isEmpty()) {
                throw new IllegalArgumentException("Member ID tidak boleh kosong");
            }
            return new LibraryMember(this);
        }
    }
}