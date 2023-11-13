package hub.babos.pkuweb.post.dto;

import hub.babos.pkuweb.post.domain.Post;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PostsElementResponse {

    private final Long id;
    private final String title;
    private final String content;
    private final String nickname;
    private final int commentCount;


    @Builder
    public PostsElementResponse(Long id, String title, String content, String nickname, int commentCount) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.nickname = nickname;
        this.commentCount = commentCount;
    }

    public static PostsElementResponse from(Post post) {
        return PostsElementResponse.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .nickname(post.getAuthor().getNickname())
                .commentCount(post.getCommentCount())
                .build();
    }
}
