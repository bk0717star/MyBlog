package cn.lsj.blog.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_message
 */
@TableName(value ="t_message")
@Data
public class Message implements Serializable {
    /**
     * 留言id
     */
    @TableId
    private Long messageId;

    /**
     * 用户id
     */
    private Long authorId;

    /**
     * 父评论id
     */
    private Long parentId;

    /**
     * 留言级别(评论分两级：0，留言；1，回复)
     */
    private String level;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Long createDate;

    /**
     * 被回复人id
     */
    private Long toUid;

    /**
     * 点赞数
     */
    private Integer likeCounts;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Message other = (Message) that;
        return (this.getMessageId() == null ? other.getMessageId() == null : this.getMessageId().equals(other.getMessageId()))
            && (this.getAuthorId() == null ? other.getAuthorId() == null : this.getAuthorId().equals(other.getAuthorId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getToUid() == null ? other.getToUid() == null : this.getToUid().equals(other.getToUid()))
            && (this.getLikeCounts() == null ? other.getLikeCounts() == null : this.getLikeCounts().equals(other.getLikeCounts()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        result = prime * result + ((getAuthorId() == null) ? 0 : getAuthorId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getToUid() == null) ? 0 : getToUid().hashCode());
        result = prime * result + ((getLikeCounts() == null) ? 0 : getLikeCounts().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messageId=").append(messageId);
        sb.append(", authorId=").append(authorId);
        sb.append(", parentId=").append(parentId);
        sb.append(", level=").append(level);
        sb.append(", content=").append(content);
        sb.append(", createDate=").append(createDate);
        sb.append(", toUid=").append(toUid);
        sb.append(", likeCounts=").append(likeCounts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}