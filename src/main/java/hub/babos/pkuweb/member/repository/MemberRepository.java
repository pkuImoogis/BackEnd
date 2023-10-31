package hub.babos.pkuweb.member.repository;

import hub.babos.pkuweb.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByNickname(String nickname);
}