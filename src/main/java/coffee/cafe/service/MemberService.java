package coffee.cafe.service;

import coffee.cafe.domain.Member;
import coffee.cafe.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository; // final 선언? 재할당을 막기 위해서

    // static을 적용하면 해당 필드 객체는 static 영역에 로드되어지고, 프로그램이 메모리에 올라와있는 동안은 메모리에 계속 존재하게 된다. 이는 성능 이슈로 이어진다.

    @Transactional
    public void join(Member member) {
        memberRepository.save(member);
    }
}
