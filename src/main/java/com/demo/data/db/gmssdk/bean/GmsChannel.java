package com.demo.data.db.gmssdk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author demo
 * @Date 2020/7/23 9:42
 * @Version 1.0
 */
@Data
public class GmsChannel implements Serializable {
    /**
     * 编号id
     */
    private Integer id;

    /**
     * 渠道编号
     */
    private Integer cid;

    /**
     * 系统
     */
    private String system;

    /**
     * 用途
     */
    private String purpose;

    /**
     * 合作商
     */
    private String corporation;

    /**
     * 平台
     */
    private String platform;

    /**
     * 备注
     */
    private String alias;

    /**
     * 游戏名称
     */
    private String name;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 序号
     */
    private Integer idx;

    /**
     * 公告
     */
    private String announcement;

    /**
     * 当前模式
     */
    private Integer mode;

    private Integer updatemode;

    /**
     * 网站地址
     */
    private String url;

    private String size;

    private String serviceannouncement;

    private String officeurl;

    private static final long serialVersionUID = 1L;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getSystem() == null) ? 0 : getSystem().hashCode());
        result = prime * result + ((getPurpose() == null) ? 0 : getPurpose().hashCode());
        result = prime * result + ((getCorporation() == null) ? 0 : getCorporation().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIdx() == null) ? 0 : getIdx().hashCode());
        result = prime * result + ((getAnnouncement() == null) ? 0 : getAnnouncement().hashCode());
        result = prime * result + ((getMode() == null) ? 0 : getMode().hashCode());
        result = prime * result + ((getUpdatemode() == null) ? 0 : getUpdatemode().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getServiceannouncement() == null) ? 0 : getServiceannouncement().hashCode());
        result = prime * result + ((getOfficeurl() == null) ? 0 : getOfficeurl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cid=").append(cid);
        sb.append(", system=").append(system);
        sb.append(", purpose=").append(purpose);
        sb.append(", corporation=").append(corporation);
        sb.append(", platform=").append(platform);
        sb.append(", alias=").append(alias);
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", idx=").append(idx);
        sb.append(", announcement=").append(announcement);
        sb.append(", mode=").append(mode);
        sb.append(", updatemode=").append(updatemode);
        sb.append(", url=").append(url);
        sb.append(", size=").append(size);
        sb.append(", serviceannouncement=").append(serviceannouncement);
        sb.append(", officeurl=").append(officeurl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}