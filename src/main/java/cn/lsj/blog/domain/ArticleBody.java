package cn.lsj.blog.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_article_body
 */
@TableName(value ="t_article_body")
@Data
public class ArticleBody implements Serializable {
    /**
     * 文章内容id
     */
    @TableId
    private Long articleBodyId;

    /**
     * 文章id
     */
    private Long articleId;

    /**
     * Markdown源码内容
     */
    private String content;

    /**
     * Markdown网页内容
     */
    private String contentHtml;

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
        ArticleBody other = (ArticleBody) that;
        return (this.getArticleBodyId() == null ? other.getArticleBodyId() == null : this.getArticleBodyId().equals(other.getArticleBodyId()))
            && (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getContentHtml() == null ? other.getContentHtml() == null : this.getContentHtml().equals(other.getContentHtml()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArticleBodyId() == null) ? 0 : getArticleBodyId().hashCode());
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getContentHtml() == null) ? 0 : getContentHtml().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleBodyId=").append(articleBodyId);
        sb.append(", articleId=").append(articleId);
        sb.append(", content=").append(content);
        sb.append(", contentHtml=").append(contentHtml);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}