package hello.core.member;

public class MemberServiceImpl implements MemberService {

    // 추상화에만 의존, DIP 지킴
    private final MemberRepository memberRepository;

    // memberRepository의 구현체에 뭐가 들어갈지 생성자를 통해서 결정
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
