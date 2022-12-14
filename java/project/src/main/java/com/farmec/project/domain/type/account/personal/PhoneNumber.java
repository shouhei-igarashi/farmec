package com.farmec.project.domain.type.account.personal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class PhoneNumber {
    @NotBlank(message = "電話番号を入力してください")
    @Pattern(regexp = "([0-9]{2,4}[0-9]{2,4}[0-9]{2,4})?", message = "電話番号形式で入力してください")
    @Size(min = 8, max = 13, message = "桁数は8桁以上13桁以下で入力してください")
    String value;

    public PhoneNumber() {}

    public PhoneNumber(String phoneNumber) {
        value = phoneNumber;
    }

    public Integer toInteger() {
        return Integer.decode(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
