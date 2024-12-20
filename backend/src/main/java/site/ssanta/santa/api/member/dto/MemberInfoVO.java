package site.ssanta.santa.api.member.dto;

import site.ssanta.santa.api.member.domain.Tier;

public interface MemberInfoVO {

    Long getId();
    String getEmail();
    String getNickname();
    String getProfileUrl();
    Tier getTier();
    Long getExp();
}
