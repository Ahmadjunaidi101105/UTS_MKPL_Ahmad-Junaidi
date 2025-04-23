public class MembershipService {
    public boolean isEligibleForUpgrade(LibraryMember member) {
        return member.getMembershipLevel() == MembershipLevel.BASIC 
               && member.getLoyaltyPoints() > 100;
    }

    public double calculateRiskScore(LibraryMember member) {
        double score = member.getLateReturnsCount() * 1.5 
                     + member.getFineAmount() * 0.1;

        if (!member.isActive()) score += 5;
        if (member.getMembershipLevel() == MembershipLevel.BASIC) score += 2;
        if (member.getBorrowedBooksCount() > 50) score -= 1.5;

        return score;
    }

    // Method lain: upgradeMembership, applyPenalty, dll.
}