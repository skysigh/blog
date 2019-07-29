package org.skysigh.blog.web.po.user;

import java.io.Serializable;

/**
 * 关注的用户
 */
public class FollowUser implements Serializable {

    private static final long serialVersionUID = -163079738712337241L;

    private Long id;
    private Long userId;
    /**
     * 被关注的用户id
     */
    private Long followUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFollowUserId() {
        return followUserId;
    }

    public void setFollowUserId(Long followUserId) {
        this.followUserId = followUserId;
    }
}
