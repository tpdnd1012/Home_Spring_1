package spring.domain.Reply;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyRepository extends JpaRepository<ReplyEntity, Long> {
                            // 새로인터페이스 extends JpaRepository< 엔티티명 , id의자료형 >

    List<ReplyEntity> findAllBypostid(Long postid);
}
