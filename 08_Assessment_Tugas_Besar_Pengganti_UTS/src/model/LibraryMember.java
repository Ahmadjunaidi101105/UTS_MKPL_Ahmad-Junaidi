import java.util.Date;

public class LibraryMember {
    private final PersonalInfo personalInfo;
    private final String memberId;
    private final Date joinDate;
    private boolean isActive;
    private MembershipLevel membershipLevel;
    private int borrowedBooksCount;
    private int lateReturnsCount;
    private int fineAmount;
    private int loyaltyPoints;
    private String referralCode;
    private boolean isNewsletterSubscribed;

    public enum MembershipLevel {
        BASIC, STANDARD, PREMIUM
    }

    public LibraryMember(PersonalInfo personalInfo, String memberId, Date joinDate, 
                        boolean isActive, MembershipLevel membershipLevel, 
                        int borrowedBooksCount, int lateReturnsCount, int fineAmount, 
                        int loyaltyPoints, String referralCode, 
                        boolean isNewsletterSubscribed) {
        this.personalInfo = personalInfo;
        this.memberId = memberId;
        this.joinDate = new Date(joinDate.getTime()); // Defensive copy
        this.isActive = isActive;
        this.membershipLevel = membershipLevel;
        this.borrowedBooksCount = borrowedBooksCount;
        this.lateReturnsCount = lateReturnsCount;
        this.fineAmount = fineAmount;
        this.loyaltyPoints = loyaltyPoints;
        this.referralCode = referralCode;
        this.isNewsletterSubscribed = isNewsletterSubscribed;
    }

    public boolean isEligibleForUpgrade() {
        return membershipLevel == MembershipLevel.BASIC && loyaltyPoints > 100;
    }

    public double calculateRiskScore() {
        double score = 0;
        score += lateReturnsCount * 1.5;
        score += fineAmount * 0.1;
        
        if (!isActive) {
            score += 5;
        }
        
        if (membershipLevel == MembershipLevel.BASIC) {
            score += 2;
        }
        
        if (borrowedBooksCount > 50) {
            score -= 1.5;
        }
        
        return score;
    }

    // Getter methods
    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public String getMemberId() {
        return memberId;
    }

    public Date getJoinDate() {
        return new Date(joinDate.getTime()); // Defensive copy
    }

    public boolean isActive() {
        return isActive;
    }

    public MembershipLevel getMembershipLevel() {
        return membershipLevel;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public int getLateReturnsCount() {
        return lateReturnsCount;
    }

    public int getFineAmount() {
        return fineAmount;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public boolean isNewsletterSubscribed() {
        return isNewsletterSubscribed;
    }

    // Setter methods only for mutable fields
    public void setActive(boolean active) {
        isActive = active;
    }

    public void setMembershipLevel(MembershipLevel level) {
        this.membershipLevel = level;
    }

    public void setBorrowedBooksCount(int count) {
        this.borrowedBooksCount = count;
    }

    public void setLateReturnsCount(int count) {
        this.lateReturnsCount = count;
    }

    public void setFineAmount(int amount) {
        this.fineAmount = amount;
    }

    public void setLoyaltyPoints(int points) {
        this.loyaltyPoints = points;
    }

    public void setReferralCode(String code) {
        this.referralCode = code;
    }

    public void setNewsletterSubscribed(boolean subscribed) {
        this.isNewsletterSubscribed = subscribed;
    }
}