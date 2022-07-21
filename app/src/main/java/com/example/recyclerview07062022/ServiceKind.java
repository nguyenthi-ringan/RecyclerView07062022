package com.example.recyclerview07062022;

/**
 * Created by pphat on 7/19/2022.
 */
public enum ServiceKind {
    RESTAURANT ("Nhà hàng"),
    FAMILY ("Gia đình"),
    GROUP ("Hội nhóm"),
    BUFFET ("Buffet"),
    SHOP_ONLINE ("Shop online"),
    STREET ("Vỉa hè");

    private final String name;

    ServiceKind(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }
}

