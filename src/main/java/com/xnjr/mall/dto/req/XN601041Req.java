package com.xnjr.mall.dto.req;

/** 
 * @author: xieyj 
 * @since: 2016年5月24日 上午9:13:00 
 * @history:
 */
public class XN601041Req {

    // 编号（必填）
    private String code;

    // 型号编号（必填）
    private String modelCode;

    // 原价（必填）
    private String originalPrice;

    // 折扣价（必填）
    private String discountPrice;

    // 受众（必填）
    private String toLevel;

    // 受众（必填）
    private String toSite;

    // 更新人（必填）
    private String updater;

    // 备注（必填）
    private String remark;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getToLevel() {
        return toLevel;
    }

    public void setToLevel(String toLevel) {
        this.toLevel = toLevel;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getToSite() {
        return toSite;
    }

    public void setToSite(String toSite) {
        this.toSite = toSite;
    }
}
