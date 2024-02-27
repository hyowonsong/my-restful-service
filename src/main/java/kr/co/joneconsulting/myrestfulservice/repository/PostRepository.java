package kr.co.joneconsulting.myrestfulservice.repository;

import kr.co.joneconsulting.myrestfulservice.bean.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
