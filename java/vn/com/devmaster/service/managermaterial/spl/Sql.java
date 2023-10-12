package vn.com.devmaster.service.managermaterial.spl;

public class Sql {
    public static final String PRODUCT="" +
            "select ID id,NAME name,DESCRIPTION description,NOTES notes,IMAGE image,PRICE price,QUATITY quatity,\n" +
            "       case\n" +
            "           when ISACTIVE = 1 then \"Còn bán\"\n" +
            "           else \"Không còn sản phẩm\"\n" +
            "        end isActive\n" +
            "       from product";

    public static final String PRODUCT_HP="select ID id,NAME name,DESCRIPTION MoTa,IMAGE image,PRICE price,QUATITY quatity," +
            "       case\n" +
            "           when ISACTIVE = 1 then \"Còn bán\"\n" +
            "           else \"Không còn sản phẩm\"\n" +
            "        end isActive\n" +
            " from product p where NAME like N'%hp%'";
    public static final String PRODUCT_ASUS="select ID id,NAME name,DESCRIPTION MoTa,IMAGE image,PRICE price,QUATITY quatity," +
            "       case\n" +
            "           when ISACTIVE = 1 then \"Còn bán\"\n" +
            "           else \"Không còn sản phẩm\"\n" +
            "        end isActive\n" +
            " from product p where NAME like N'%asus%'";
    public static final String PRODUCT_DELL="select ID id,NAME name,DESCRIPTION MoTa,IMAGE image,PRICE price,QUATITY quatity," +
            "       case\n" +
            "           when ISACTIVE = 1 then \"Còn bán\"\n" +
            "           else \"Không còn sản phẩm\"\n" +
            "        end isActive\n" +
            " from product p where NAME like N'%dell%'";
    public static final String PRODUCT_ACER="select ID id,NAME name,DESCRIPTION MoTa,IMAGE image,PRICE price,QUATITY quatity," +
            "       case\n" +
            "           when ISACTIVE = 1 then \"Còn bán\"\n" +
            "           else \"Không còn sản phẩm\"\n" +
            "        end isActive\n" +
            " from product p where NAME like N'%acer%'";
    public static final String PRODUCT_MACBOOK="select ID id,NAME name,DESCRIPTION MoTa,IMAGE image,PRICE price,QUATITY quatity," +
            "       case\n" +
            "           when ISACTIVE = 1 then \"Còn bán\"\n" +
            "           else \"Không còn sản phẩm\"\n" +
            "        end isActive\n" +
            " from product p where NAME like N'%macbook%'";

    public static final String PAYMENT_METHOD="select  NAME name,NOTES notes from payment_method pay";
    public static final String TRANSPORT_METHOD="select NAME name,NOTES notes from transport_method";

//    public static final String PRODUCT_CHITIET="" +
//            "select NAME name,DESCRIPTION description,NOTES notes,IMAGE image,PRICE price,QUATITY quatity,\n" +
//            "       case\n" +
//            "           when ISACTIVE = 1 then \"Còn sản phẩm\"\n" +
//            "           else \"Sản phẩm đã hết\"\n" +
//            "        end trangThai\n" +
//            "       from product";

    public static final String LOCPRICE_10="select ID id,NAME name,DESCRIPTION MoTa,IMAGE image,PRICE price,QUATITY quatity from product where PRICE < 10000000";
    public static final String LOCPRICE_10_15="select ID id,NAME name,DESCRIPTION MoTa,IMAGE image,PRICE price,QUATITY quatity from product where PRICE >=10000000 and PRICE <= 15000000";
    public static final String LOCPRICE_15_20="select ID id,NAME name,DESCRIPTION MoTa,IMAGE image,PRICE price,QUATITY quatity from product where PRICE >= 15000000 and PRICE <= 20000000";
    public static final String LOCPRICE_20_25="select ID id,NAME name,DESCRIPTION MoTa,IMAGE image,PRICE price,QUATITY quatity from product where PRICE >= 20000000 and PRICE <= 25000000";
    public static final String LOCPRICE_25_30="select ID id,NAME name,DESCRIPTION MoTa,IMAGE image,PRICE price,QUATITY quatity from product where PRICE >= 25000000 and PRICE <= 30000000";
    public static final String LOCPRICE_30="select ID id,NAME name,DESCRIPTION MoTa,IMAGE image,PRICE price,QUATITY quatity from product where PRICE > 30000000";

    public static final String PRODUCT_IMAGE="select prod.ID id,prod.NAME name, prod.NOTES notes,pi.URL from product prod inner join `manager-material`.product_images pi on prod.ID = pi.ID_PRODUCT where prod.ID = ?";
    public static final String PRODUCT_TRANGCHU="select ID id,NAME name,IMAGE image,NOTES moTa,PRICE price,QUATITY quatity from product where DESCRIPTION like N'%thanh lịch%'";
}
