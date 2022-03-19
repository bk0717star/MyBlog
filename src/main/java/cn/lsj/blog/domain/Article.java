package cn.lsj.blog.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_article
 */
@TableName(value ="t_article")
@Data
public class Article implements Serializable {
    /**
     * 文章id
     */
    @TableId
    private Long articleId;

    /**
     * 文章标题
     */
    private String articleTitle;

    /**
     * 简介
     */
    private String summary;

    /**
     * 分类id
     */
    private Integer categoryId;

    /**
     * 作者id
     */
    private Long authorId;

    /**
     * 内容id
     */
    private Long articleBodyId;

    /**
     * 创建时间
     */
    private Long createDate;

    /**
     * 最后更新时间
     */
    private Long lastUpdated;

    /**
     * 评论数量
     */
    private Integer commentCounts;

    /**
     * 是否发布(0:未发布; 1:发布)
     */
    private String status;

    /**
     * 点赞数
     */
    private Integer likeCounts;

    /**
     * 浏览数
     */
    private Integer viewCounts;

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
        Article other = (Article) that;
        return (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getArticleTitle() == null ? other.getArticleTitle() == null : this.getArticleTitle().equals(other.getArticleTitle()))
            && (this.getSummary() == null ? other.getSummary() == null : this.getSummary().equals(other.getSummary()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getAuthorId() == null ? other.getAuthorId() == null : this.getAuthorId().equals(other.getAuthorId()))
            && (this.getArticleBodyId() == null ? other.getArticleBodyId() == null : this.getArticleBodyId().equals(other.getArticleBodyId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getLastUpdated() == null ? other.getLastUpdated() == null : this.getLastUpdated().equals(other.getLastUpdated()))
            && (this.getCommentCounts() == null ? other.getCommentCounts() == null : this.getCommentCounts().equals(other.getCommentCounts()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLikeCounts() == null ? other.getLikeCounts() == null : this.getLikeCounts().equals(other.getLikeCounts()))
            && (this.getViewCounts() == null ? other.getViewCounts() == null : this.getViewCounts().equals(other.getViewCounts()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getArticleTitle() == null) ? 0 : getArticleTitle().hashCode());
        result = prime * result + ((getSummary() == null) ? 0 : getSummary().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getAuthorId() == null) ? 0 : getAuthorId().hashCode());
        result = prime * result + ((getArticleBodyId() == null) ? 0 : getArticleBodyId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        result = prime * result + ((getCommentCounts() == null) ? 0 : getCommentCounts().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLikeCounts() == null) ? 0 : getLikeCounts().hashCode());
        result = prime * result + ((getViewCounts() == null) ? 0 : getViewCounts().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleId=").append(articleId);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", summary=").append(summary);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", authorId=").append(authorId);
        sb.append(", articleBodyId=").append(articleBodyId);
        sb.append(", createDate=").append(createDate);
        sb.append(", lastUpdated=").append(lastUpdated);
        sb.append(", commentCounts=").append(commentCounts);
        sb.append(", status=").append(status);
        sb.append(", likeCounts=").append(likeCounts);
        sb.append(", viewCounts=").append(viewCounts);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}