package com.ohgiraffers.mapping.section03.compositekey.subsection01.embeddedId;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class LikeBookService {

    private LikeRepository likeRepository;

    public LikeBookService(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    @Transactional
    public void generateLikeBook(LikeDTO likeDTO) {
        Like newLike = new Like(
                new LikeCompositeKey(
                        likeDTO.getLikedMemberNo(),
                        likeDTO.getLikedBookNo()
                )
        );

        likeRepository.save(newLike);
    }

}
