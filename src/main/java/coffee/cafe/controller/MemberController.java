package coffee.cafe.controller;

import coffee.cafe.domain.CreateMemberRequest;
import coffee.cafe.domain.Member;
import coffee.cafe.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/member")
    public void create(@Valid CreateMemberRequest memberRequest) {
        Member member = new Member();
        member.setName(memberRequest.getName());
        memberService.join(member);
    }
}
