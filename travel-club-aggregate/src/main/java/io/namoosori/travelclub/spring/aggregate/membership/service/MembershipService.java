package io.namoosori.travelclub.spring.aggregate.membership.service;

import io.namoosori.travelclub.spring.spec.aggregate.club.Membership;
import io.namoosori.travelclub.spring.spec.facade.aggregate.club.sdo.MembershipCdo;
import io.namoosori.travelclub.spring.spec.facade.shared.NameValueList;

import java.util.List;

public interface MembershipService {
    //
    String registerMembership(MembershipCdo membershipCdo);
    Membership findMembership(String membershipId);
    Membership findMembershipByClubIdAndMemberId(String clubId, String memberId);
    Membership findMembershipByClubIdAndMemberEmail(String clubId, String memberEmail);
    List<Membership> findAllMembershipsOfClub(String clubId);
    List<Membership> findAllMembershipsOfAllClubs();
    List<Membership> findAllMembershipsOfMember(String memberId);
    void modifyMembership(String membershipId, NameValueList nameValueList);
    void removeMembership(String membershipId);
}
