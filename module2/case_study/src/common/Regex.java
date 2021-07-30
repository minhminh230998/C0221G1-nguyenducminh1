package common;

public interface Regex {
    String MA_DICH_VU_VILLA="^SVVL\\-[0-9]{4}$";
    String MA_DICH_VU_HOUSE="^SVHO\\-[0-9]{4}$";
    String MA_DICH_VU_ROOM="^SVRO\\-[0-9]{4}$";
    String TEN_DICH_VU="^[A-Z]{1}[a-z]{1,}$";
    String  DIEN_TICH_SU_DUNG="^3[0-9]{1}|[0-9]{3}$";
    String KIEU_THUE="^ngay|tuan|thang|nam$";
    String TIEU_CHUAN_PHONG="^[A-Z]{1}[a-z]{1,}$";
    String TIEN_NGHI="^[A-Z]{1}[a-z]{1,}$";
    String  DIEN_TICH_HO_BOI="^3[0-9]{1}|[0-9]{3}$";
    String CHI_PHI_THUE="^[0-9]{1,}$";
    String SO_NGUOI_TOI_DA="^[1-9]{1}|1[0-9]{1}$";
    String SO_TANG="[0-9]{1,}";
    String DICH_VU_DI_KEM="^massage|karaoke|food|drink|car$";
    String DICH_VU_FREE_DI_KEM="^[A-Z]{1}[a-z]{1,}$";
    String TEXT_VILLA ="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\case_study\\src\\data\\dichVu.csv";
    String TEXT_ROOM ="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\case_study\\src\\data\\room.csv";
    String TEXT_HOUSE="E:\\C0221G1-nguyenducminh1\\C0221G1-nguyenducminh\\module2\\case_study\\src\\data\\house.csv";
    String HO_TEN="^[A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)+$";
    String EMAIL="[A-Za-z1-9]\\@[A-Za-z1-9]\\.[A-Za-z1-9]";
    String LOAI_KHACH_HANG="^Male|Female|Unknow$";
    String SO_CMND="^[0-9]{9}$";
    String NAM_SINH="\"^(((0[1-9]|[12][0-9]|3[01])[- /.](0[13578]|1[02])|(0[1-9]|[12][0-9]|30)[- /.]\" +\n" +
            "        \"(0[469]|11)|(0[1-9]|1\\\\d|2[0-8])[- /.]02)[- /.]\\\\d{4}\" +\n" +
            "        \"|29[- /.]02[- /.](\\\\d{2}(0[48]|[2468][048]|[13579][26])|([02468][04s8]|[1359][26])00))$\"\n";
    String GIOI_TINH="^Nam|Nu|Khac$";
    String SDT="^[0-9]{10,11}$";
    String DIA_CHI="^[A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)+$";
}
