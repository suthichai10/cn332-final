/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
/**
 *
 * @author sutic
 */
public class Promotion {
    private final Date StartPromotion;
    private final Date EndPromotion;
    private final int discount;
    private final String promotionName;
    
    public Promotion(Date StartPromotion ,Date EndPromotion , int discount , String promotionName) {
        this.StartPromotion = StartPromotion;
        this.EndPromotion = EndPromotion;
        this.discount = discount;
        this.promotionName = promotionName;
    }
    
    public Date getStartPromotionDate() {
        return StartPromotion;
    }
    
    public Date getEndPromotionDate() {
        return EndPromotion;
    }
    
    public int getDiscount() {
        return discount;
    }
    
    public String getPromotionName() {
        return promotionName;
    }
}
