package Util;

public enum Transaction {
    RENTMOVIE("Thuê phim"), BUYMOVIE("Mua phim")
    , DEPOSIT("Nạp tiền");

    String value;

    Transaction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
