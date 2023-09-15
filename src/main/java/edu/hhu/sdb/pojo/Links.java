package edu.hhu.sdb.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName links
 */
@TableName(value ="links")
@Data
public class Links implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 链接名称
     */
    private String name;

    /**
     * 链接对应url
     */
    private String url;

    /**
     * 链接对应图标
     */
    private String icon;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}